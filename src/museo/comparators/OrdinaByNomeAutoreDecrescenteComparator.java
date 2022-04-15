package museo.comparators;

import museo.Statua;

import java.util.Comparator;

public class OrdinaByNomeAutoreDecrescenteComparator implements Comparator<Statua>{
        @Override
        public int compare(Statua o1, Statua o2) {
            return -(new OrdinaByNomeAutoreCrescenteComparator().compare(o1,o2)) ;
        }
}

