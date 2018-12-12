package redsis.controller;

import java.util.List;
import redsis.bd.IREDDAO;
import redsis.bd.REDDAO;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public class REDController {
    IREDDAO dao;

    public REDController() {
        this.dao = new REDDAO();
    }
    
    public void inserir(RED red) {
        dao.inserir(red);
    }
    
    public void atualizar(RED red) {
        dao.atualizar(red);
    }
    
    public void deletar(RED red) {
        dao.deletar(red);
    }
    
    public List<RED> obterREDsProntuario(String prontuario) {
        return dao.obterREDsProntuario(prontuario);
    }
    
    public RED atualizarCodigo(RED red) {
        return dao.atualizarCodigo(red);
    }
}
