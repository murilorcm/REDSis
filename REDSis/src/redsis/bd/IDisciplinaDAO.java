package redsis.bd;

import java.util.List;
import redsis.model.Disciplina;

/**
 *
 * @author murilo
 */
public interface IDisciplinaDAO {
    public void inserir(Disciplina disciplina);
    public List<Disciplina> obterTodas();
}
