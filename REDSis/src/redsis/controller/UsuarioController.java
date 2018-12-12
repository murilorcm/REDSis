package redsis.controller;

import redsis.bd.IUsuarioDAO;
import redsis.bd.UsuarioDAO;
import redsis.model.Usuario;

/**
 *
 * @author murilo
 */
public class UsuarioController {
    IUsuarioDAO dao = new UsuarioDAO();

    public UsuarioController() {
    }
    
    public void inserir(Usuario usuario) {
        dao.inserir(usuario);
    }
    
    public void alterarSenha(Usuario usuario, String novaSenha) {
        if (verificarLogin(usuario)) {
            usuario.setSenha(novaSenha);
            dao.atualizar(usuario);
        }
    }
    
    public boolean verificarLogin(Usuario usuario) {
        return dao.verificarLogin(usuario);
    }
}
