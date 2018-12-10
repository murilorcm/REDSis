package redsis.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import redsis.model.Disciplina;
import redsis.model.DisciplinaRED;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public class DisciplinaREDDAO implements IDisciplinaREDDAO {
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 

    public DisciplinaREDDAO() {
    }

    @Override
    public void inserir(DisciplinaRED discRED) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO disciplinaRED (codigoDisciplina, codigoRED) VALUES (?, ?)");
            
            stm.setInt(1, discRED.getCodigoDisciplina());
            stm.setInt(2, discRED.getCodigoRED());
            
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
            stm = con.prepareStatement("SELECT * FROM disciplinaRED WHERE codigoRED = ?");
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
                
                disciplinas.add(disciplina);
            }
        } catch (SQLException sqle){
            System.out.println("Exceção de conexão ao banco." + sqle);
        }    
        
        return disciplinas;
    }
    
}
