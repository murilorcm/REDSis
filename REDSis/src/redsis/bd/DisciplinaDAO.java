package redsis.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import redsis.model.Disciplina;

/**
 *
 * @author murilo
 */
public class DisciplinaDAO implements IDisciplinaDAO{
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    public DisciplinaDAO() {
    }

    @Override
    public void inserir(Disciplina disciplina) {
         try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO disciplinas (nome, sigla, pofessor, semestre, ano) VALUES (?, ?, ?, ?, ?)");
          
            stm.setString(1, disciplina.getNome());
            stm.setString(2, disciplina.getSigla());
            stm.setString(3, disciplina.getProfessor());
            stm.setString(4, disciplina.getSemestre());
            stm.setInt(5, disciplina.getAno());
            
            stm.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);        
        } 
    }

    @Override
    public List<Disciplina> obterTodas() {
        try {
            List disciplinas = new LinkedList();
            
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM disciplinas");
            rs = stm.executeQuery();
            
            while(rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setCodigo(rs.getInt("codigo"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setSigla(rs.getString("sigla"));                
                disciplina.setProfessor(rs.getString("professor"));
                disciplina.setSemestre(rs.getString("semestre"));
                disciplina.setAno(rs.getInt("ano"));

                disciplinas.add(disciplina);
            }   
            
            return disciplinas;            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }
    }
}
