package museo.comparators;

import museo.Quadro;

import java.util.Comparator;

public class OrdinaByTecnicaDecrescenteComparator implements Comparator<Quadro> {
    @Override
    public int compare(Quadro o1, Quadro o2) {
        return -(new OrdinaByTecnicaCrescenteComparator().compare(o1, o2));
    }
}
