package redsis.controller;

import java.util.List;
import redsis.bd.DisciplinaDAO;
import redsis.bd.IDisciplinaDAO;
import redsis.model.Disciplina;
import redsis.model.RED;

/**
 *
 * @author murilo
 */
public class DisciplinaController {
    IDisciplinaDAO dao = new DisciplinaDAO();

    public DisciplinaController() {
    }
    
    public void inserir(Disciplina disciplina) {
        dao.inserir(disciplina);
    }
    
    public List<Disciplina> obterDisciplinasRED(RED red) {
        return dao.obterDisciplinasRED(red);
    }
    
    public void removerAntigasRED(RED red) {
        List<Disciplina> disciplinasOld = obterDisciplinasRED(red);
        
        disciplinasOld.forEach((disciplina) -> {
            dao.remover(disciplina);
        });
    }
}
