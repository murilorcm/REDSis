package redsis.model;

import java.util.Comparator;

/**
 *
 * @author murilo
 */
public class ComparadorREDPorDataInicio implements Comparator<RED> {

    @Override
    public int compare(RED t, RED t1) {
       return t.getDataInicio().compareTo(t1.getDataInicio());
    }
}
