package redsis.bd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public class REDDAO implements IREDDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null;
    private final IDisciplinaDAO disciplinaDAO = new DisciplinaDAO();

    public REDDAO() {
    }

    @Override
    public void inserir(RED red) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO reds (nomeAluno, prontuario, dataInicio, dataFim) VALUES (?, ?, ?, ?)");
            
            stm.setString(1, red.getNomeAluno());
            stm.setString(2, red.getProntuario());
            stm.setDate(3, new Date(red.getDataInicio().getTime()));
            stm.setDate(4, new Date(red.getDataFim().getTime()));
            
            stm.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);        
        }
    }

    @Override
    public void atualizar(RED red) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("UPDATE reds SET nomeAluno = ?, prontuario = ?, dataInicio = ?, dataFim = ? WHERE codigo = ?");
            
            stm.setString(1, red.getNomeAluno());
            stm.setString(2, red.getProntuario());
            stm.setDate(3, new Date(red.getDataInicio().getTime()));
            stm.setDate(4, new Date(red.getDataFim().getTime()));
            stm.setInt(5, red.getCodigo());
            
            stm.executeUpdate();                
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        } 
    }

    @Override
    public void deletar(RED red) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("DELETE FROM reds WHERE codigo = ?");
            
            stm.setInt(1, red.getCodigo());
            
            stm.executeUpdate();                     
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);  
        }
    }

    @Override
    public List<RED> obterREDsProntuario(String prontuario) {
        try {
            List reds = new LinkedList();
            
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM reds WHERE prontuario = ?");
            
            stm.setString(1, prontuario);
            
            rs = stm.executeQuery();
            
            while(rs.next()) {
                RED red = new RED();
                red.setCodigo(rs.getInt("codigo"));
                red.setNomeAluno(rs.getString("nomeAluno"));
                red.setProntuario(rs.getString("prontuario"));
                red.setDataInicio(rs.getDate("dataInicio"));
                red.setDataFim(rs.getDate("dataFim"));
                
                List disciplinas = disciplinaDAO.obterDisciplinasRED(red);
                red.setDisciplinas(disciplinas);
          
                reds.add(red);
            }   
            
            return reds;            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }

    @Override
    public RED atualizarCodigo(RED red) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM reds WHERE prontuario = ? AND dataInicio = ?;");
            stm.setString(1, red.getProntuario());
            stm.setDate(2, new Date(red.getDataInicio().getTime()));
            rs = stm.executeQuery();
            while(rs.next()) {
                red.setCodigo(rs.getInt("codigo"));
            }
            return red;
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }    
    }

    @Override
    public List<RED> obterTodos() {
    try {
            List reds = new LinkedList();
            
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM reds");
            
            
            rs = stm.executeQuery();
            
            while(rs.next()) {
                RED red = new RED();
                red.setCodigo(rs.getInt("codigo"));
                red.setNomeAluno(rs.getString("nomeAluno"));
                red.setProntuario(rs.getString("prontuario"));
                red.setDataInicio(rs.getDate("dataInicio"));
                red.setDataFim(rs.getDate("dataFim"));
                
                List disciplinas = disciplinaDAO.obterDisciplinasRED(red);
                red.setDisciplinas(disciplinas);
          
                reds.add(red);
            }   
            
            return reds;            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
}
