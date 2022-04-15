package museo.comparators;

import museo.Autore;

import java.util.Comparator;

public class OrdinaByAutoreDataDecrescenteComparator implements Comparator<Autore> {
    @Override
    public int compare(Autore o1, Autore o2) {
        return -(new OrdinaByAutoreDataCrescenteComparator().compare(o1, o2));
    }
}
