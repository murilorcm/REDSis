package redsis.bd;

import java.util.List;
import redsis.model.Disciplina;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public interface IDisciplinaDAO {
    public void inserir(Disciplina disciplina);
    public List<Disciplina> obterDisciplinasRED(RED red);
}
