package redsis.model;

import java.util.Comparator;

/**
 *
 * @author murilo
 */
public class ComparadorREDPorNome implements Comparator<RED> {

    @Override
    public int compare(RED t, RED t1) {
        return t.getNomeAluno().compareTo(t1.getNomeAluno());
    }
    
}
