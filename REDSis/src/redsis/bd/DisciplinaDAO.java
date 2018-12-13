package redsis.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import redsis.model.Disciplina;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public class DisciplinaDAO implements IDisciplinaDAO{
    private final ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    public DisciplinaDAO() {
    }

    @Override
    public void inserir(Disciplina disciplina) {
         try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO disciplinas (nome, sigla, professor, semestre, ano, codigoRed) VALUES (?, ?, ?, ?, ?, ?)");
          
            stm.setString(1, disciplina.getNome());
            stm.setString(2, disciplina.getSigla());
            stm.setString(3, disciplina.getProfessor());
            stm.setString(4, disciplina.getSemestre());
            stm.setInt(5, disciplina.getAno());
            stm.setInt(6, disciplina.getRed().getCodigo());
            
            stm.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);        
        }
    }

    @Override
    public List<Disciplina> obterDisciplinasRED(RED red) {
        List<Disciplina> disciplinas = new ArrayList();
        try{
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM disciplinas WHERE codigoRed = ?");
            stm.setInt(1, red.getCodigo());
            
            rs = stm.executeQuery();
            while(rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setCodigo(rs.getInt("codigo"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setSigla(rs.getString("sigla"));
                disciplina.setProfessor(rs.getString("professor"));
                disciplina.setSemestre(rs.getString("semestre"));
                disciplina.setAno(rs.getInt("ano"));
                disciplina.setRed(red);
                
                disciplinas.add(disciplina);
            }
        } catch (SQLException sqle){
            System.out.println("Exceção de conexão ao banco: " + sqle);
        }
        
        return disciplinas;
    }

    @Override
    public void remover(Disciplina disciplina) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("DELETE FROM disciplinas WHERE codigoRed = ?");
            
            stm.setInt(1, disciplina.getRed().getCodigo());
            
            stm.executeUpdate();                     
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);  
        }
    }
}
