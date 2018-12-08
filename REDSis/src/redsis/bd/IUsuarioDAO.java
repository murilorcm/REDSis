package redsis.bd;

import redsis.model.Usuario;

/**
 *
 * @author murilo
 */
public interface IUsuarioDAO {
    public void inserir(Usuario usuario);
    public void alterar(Usuario usuario);
}
