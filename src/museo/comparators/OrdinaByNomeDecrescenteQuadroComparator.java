package museo.comparators;

import museo.Quadro;

import java.util.Comparator;

public class OrdinaByNomeDecrescenteQuadroComparator implements Comparator<Quadro> {
    @Override
    public int compare(Quadro o1, Quadro o2) {
        return -(new OrdinaByNomeCrescenteQuadroComparator().compare(o1, o2));
    }
}
