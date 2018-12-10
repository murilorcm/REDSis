package redsis.bd;

import java.util.List;
import redsis.model.Disciplina;
import redsis.model.DisciplinaRED;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public interface IDisciplinaREDDAO {
    public void inserir(DisciplinaRED discRed);
    public List<Disciplina> obterDisciplinasRED(RED red);
}
