package museo.comparators;

import museo.Quadro;

import java.util.Comparator;

public class OrdinaByNomeCrescenteQuadroComparator implements Comparator<Quadro> {
    @Override
    public int compare(Quadro o1, Quadro o2) {
        int result = 0;
        result = o1.getAutore().toString().compareTo(o2.getAutore().toString());
        return result;
    }
}
