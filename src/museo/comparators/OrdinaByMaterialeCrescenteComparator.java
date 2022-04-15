package museo.comparators;

import museo.Statua;

import java.util.Comparator;

public class OrdinaByMaterialeCrescenteComparator implements Comparator<Statua> {
    @Override
    public int compare(Statua o1, Statua o2) {
        int result = 0;
        result = o1.getMateriale().compareTo(o2.getMateriale());
        if(result == 0){
            result = o1.getTitolo().compareTo(o2.getTitolo())* -1;
        }
        return result;
    }
}
