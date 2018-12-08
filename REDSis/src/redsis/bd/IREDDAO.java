package redsis.bd;

import java.util.List;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public interface IREDDAO {
    public void inserir(RED red);
    public void alterar(RED red);
    public void deletar(RED red);
    public List<RED> obterREDsProntuario(String prontuario);
}
