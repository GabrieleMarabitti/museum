package museo;

import museo.comparators.OrdinaByMaterialeCrescenteComparator;
import museo.comparators.OrdinaByMaterialeDecrescenteComparator;
import museo.comparators.OrdinaByNomeAutoreCrescenteComparator;
import museo.comparators.OrdinaByNomeAutoreDecrescenteComparator;
import museo.exceptions.EnumNonPresente;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Statua extends Opera{
    private String materiale;
    private double altezza;

    public Statua(String titolo, Autore autore, int materiale, double altezza){
        super(titolo,autore);
        setMateriale(materiale);
        this.altezza = altezza;
    }

    public String getMateriale() {
        return materiale;
    }

    private void enumEsiste(int valore) throws EnumNonPresente {
        int count = 0;
        for(Materiale m : Materiale.values()){
            if(m.getValore() != valore)
                count++;
        }
        if(count == 0)
            throw new EnumNonPresente("Materiale non selezionabile");
    }

    public void setMateriale(int valore) {
        try {
            enumEsiste(valore);
        }catch (EnumNonPresente e){
            System.err.println(e.getMessage());
        }
        for(Materiale m : Materiale.values()){
            if(m.getValore() == valore)
                this.materiale = m.name().toLowerCase();
        }
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Statua [" + super.toString() +
                ", materiale: " + materiale +
                ", altezza: " + altezza +
                "]" + " CODICE: " + super.getCodice();
    }

    public static Set<Statua> ordinaMaterialeDecrescente(ArrayList<Opera> esp, HashSet<Opera> dep){
        System.out.println("STATUE MATERIALE DECRESCENTE");
        OrdinaByMaterialeDecrescenteComparator cm = new OrdinaByMaterialeDecrescenteComparator();
        Set<Statua> statue = new TreeSet<>(cm);
        for(Opera opera : esp){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        for(Opera opera : dep){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        return statue;
    }

    public static Set<Statua> ordinaAutoreCrescente(ArrayList<Opera> esp, HashSet<Opera> dep){
        System.out.println("STATUE AUTORE CRESCENTE");
        OrdinaByNomeAutoreCrescenteComparator nc = new OrdinaByNomeAutoreCrescenteComparator();
        Set<Statua> statue = new TreeSet<>(nc);
        for(Opera opera : esp){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        for(Opera opera : dep){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        return statue;
    }

    public static Set<Statua> ordinaAutoreDecrescente(ArrayList<Opera> esp, HashSet<Opera> dep){
        System.out.println("STATUE AUTORE DECRESCENTE");
        OrdinaByNomeAutoreDecrescenteComparator nc = new OrdinaByNomeAutoreDecrescenteComparator();
        Set<Statua> statue = new TreeSet<>(nc);
        for(Opera opera : esp){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        for(Opera opera : dep){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        return statue;
    }

    public static Set<Statua> ordinaMaterialeCrescente(ArrayList<Opera> esp, HashSet<Opera> dep){
        System.out.println("STATUE MATERIALE CRESCENTE");
        OrdinaByMaterialeCrescenteComparator cm = new OrdinaByMaterialeCrescenteComparator();
        Set<Statua> statue = new TreeSet<>(cm);
        for(Opera opera : esp){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        for(Opera opera : dep){
            if(opera instanceof Statua){
                statue.add((Statua) opera);
            }
        }
        return statue;
    }
}
