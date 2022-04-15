package museo.comparators;

import museo.Quadro;

import java.util.Comparator;

public class OrdinaByTecnicaDecrescenteComparator implements Comparator<Quadro> {
    @Override
    public int compare(Quadro o1, Quadro o2) {
        int result = 0;
        result = o1.getTecnica().compareTo(o2.getTecnica())* -1;
        if(result == 0){
            result = o1.getTitolo().compareTo(o2.getTitolo());
        }
        return result;
    }
}
