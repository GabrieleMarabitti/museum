package museo.comparators;

import museo.Quadro;

import java.util.Comparator;

public class OrdinaByTecnicaCrescenteComparator implements Comparator<Quadro> {
    @Override
    public int compare(Quadro o1, Quadro o2) {
        int result = 0;
        result = o1.getTecnica().compareTo(o2.getTecnica());
        if(result == 0){
            result = (o1.getTitolo().compareTo(o2.getTitolo()))* -1;
        }
        return result;
    }
}
