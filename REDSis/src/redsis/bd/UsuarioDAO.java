package redsis.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import redsis.model.Usuario;

/**
 *
 * @author murilo
 */
public class UsuarioDAO implements IUsuarioDAO {
    private final ConnectionFactory cf;
    private PreparedStatement stm;
    private ResultSet rs;  
    private Connection con; 

    public UsuarioDAO() {
        this.con = null;
        this.rs = null;
        this.stm = null;
        this.cf = new ConnectionFactory();
    }
    
    @Override
    public void inserir(Usuario usuario) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO usuarios (nome, prontuario, senha) VALUES (?, ?, ?);");
            
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getProntuario());
            stm.setString(3, usuario.getSenha());
            
            stm.executeUpdate();
                        
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } }

    @Override
    public void atualizar(Usuario usuario) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("UPDATE usuarios SET nome = ?, "
                    + "prontuario = ?, senha = ?, WHERE nome = ?");
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getProntuario());
            stm.setString(3, usuario.getSenha());
            stm.setInt(4, usuario.getCodigo());
            stm.executeUpdate();                
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }     
    }

    @Override
    public boolean verificarLogin(Usuario usuario) {
        try {
            con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM usuarios WHERE nome = ? AND senha = ?");
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getSenha());
            rs = stm.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
        }     
    }
}
