package museo;

import museo.comparators.*;
import museo.exceptions.EnumNonPresente;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Quadro extends Opera{
    private String tecnica;

    public Quadro(String titolo, Autore autore,int tecnica){
        super(titolo, autore);
        setTecnica(tecnica);
    }

    public String getTecnica() {
        return tecnica;
    }

    private void enumEsiste(int valore) throws EnumNonPresente {
        int count = 0;
        for(Tecnica t : Tecnica.values()){
            if(t.getValore() != valore)
                count++;
        }
        if(count == 0)
            throw new EnumNonPresente("Tecnica non selezionabile");
    }

    public void setTecnica(int valore) {
        try {
            enumEsiste(valore);
        }catch (EnumNonPresente e){
            System.err.println(e.getMessage());
        }
        for(Tecnica t : Tecnica.values()){
            if(t.getValore() == valore)
                this.tecnica = t.name().toLowerCase();
        }
    }

    @Override
    public String toString() {
        return "Quadro [" + super.toString() +
                ", tecnica: " + tecnica + "]" + " CODICE: " + super.getCodice();
    }

    public static Set<Quadro> ordinaTecnicaCrescente(ArrayList<Opera> esp, HashSet<Opera> dep) {
        System.out.println("QUADRI TECNICA CRESCENTE");
        OrdinaByTecnicaCrescenteComparator tc = new OrdinaByTecnicaCrescenteComparator();
        Set<Quadro> quadri = new TreeSet<>(tc);
        for (Opera opera : esp) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        for (Opera opera : dep) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        return quadri;
    }

    public static Set<Quadro> ordinaTecnicaDecrescente(ArrayList<Opera> esp, HashSet<Opera> dep) {
        System.out.println("QUADRI TECNICA DECRESCENTE");
        OrdinaByTecnicaDecrescenteComparator td = new OrdinaByTecnicaDecrescenteComparator();
        Set<Quadro> quadri = new TreeSet<>(td);
        for (Opera opera : esp) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        for (Opera opera : dep) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        return quadri;
    }

    public static Set<Quadro> ordinaNomeCrescente(ArrayList<Opera> esp, HashSet<Opera> dep) {
        System.out.println("QUADRI AUTORE CRESCENTE");
        OrdinaByNomeCrescenteQuadroComparator nc = new OrdinaByNomeCrescenteQuadroComparator();
        Set<Quadro> quadri = new TreeSet<>(nc);
        for (Opera opera : esp) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        for (Opera opera : dep) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        return quadri;
    }

    public static Set<Quadro> ordinaNomeDecrescente(ArrayList<Opera> esp, HashSet<Opera> dep) {
        System.out.println("QUADRI AUTORE DECRESCENTE");
        OrdinaByNomeDecrescenteQuadroComparator nd = new OrdinaByNomeDecrescenteQuadroComparator();
        Set<Quadro> quadri = new TreeSet<>(nd);
        for (Opera opera : esp) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        for (Opera opera : dep) {
            if (opera instanceof Quadro) {
                quadri.add((Quadro) opera);
            }
        }
        return quadri;
    }
}
