package redsis.model;

import java.util.Comparator;

/**
 *
 * @author murilo
 */
public class ComparadorREDPorProntuario implements Comparator<RED> {

    @Override
    public int compare(RED t, RED t1) {
        return t.getProntuario().compareTo(t1.getProntuario());
    }
    
}
