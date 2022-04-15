package museo.comparators;

import museo.Statua;

import java.util.Comparator;

public class OrdinaByMaterialeDecrescenteComparator implements Comparator<Statua> {
    @Override
    public int compare(Statua o1, Statua o2) {
        return -(new OrdinaByMaterialeCrescenteComparator().compare(o1, o2));
    }
}
