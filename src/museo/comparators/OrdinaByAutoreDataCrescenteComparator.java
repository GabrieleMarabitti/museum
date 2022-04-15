package museo.comparators;

import museo.Autore;

import java.util.Comparator;

public class OrdinaByAutoreDataCrescenteComparator implements Comparator<Autore> {
    @Override
    public int compare(Autore o1, Autore o2) {
        int result = 0;
        result = o1.getDataNascita().compareTo(o2.getDataNascita());
        return result;
    }
}
