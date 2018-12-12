package redsis.bd;

import redsis.model.Usuario;

/**
 *
 * @author murilo
 */
public interface IUsuarioDAO {
    public void inserir(Usuario usuario);
    public void atualizar(Usuario usuario);
    public boolean verificarLogin(Usuario usuario);
    public Usuario consultar(Usuario usuario);
}
