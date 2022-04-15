package museo.comparators;

import museo.Statua;

import java.util.Comparator;

public class OrdinaByNomeCrescenteComparator implements Comparator<Statua> {
    @Override
    public int compare(Statua o1, Statua o2) {
        int result = 0;
        result = o1.getAutore().toString().compareTo(o2.getAutore().toString());
        return result;
    }
}


