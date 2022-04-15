package museo;


import museo.comparators.OrdinaByAutoreDataCrescenteComparator;
import museo.comparators.OrdinaByAutoreDataDecrescenteComparator;
import museo.comparators.OrdinaByMaterialeCresComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Autore {
    private String nome;
    private String cognome;
    private LocalDate dataNascita;

    public Autore(String nome, String cognome, int anno, int mese, int giorno){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = LocalDate.of(anno, mese, giorno);
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public static Set<Autore> ordinaAutoreDataCrescente(ArrayList<Opera> esp, HashSet<Opera> dep){
        System.out.println("AUTORI DATA CRESCENTE");
        OrdinaByAutoreDataCrescenteComparator dc = new OrdinaByAutoreDataCrescenteComparator();
        Set<Autore> autori = new TreeSet<>(dc);
        for(Opera opera : esp){
            autori.add(opera.getAutore());
        }
        for(Opera opera : dep){
            autori.add(opera.getAutore());
            }

        return autori;
    }

    public static Set<Autore> ordinaAutoreDataDecrescente(ArrayList<Opera> esp, HashSet<Opera> dep){
        System.out.println("AUTORI DATA DECRESCENTE");
        OrdinaByAutoreDataDecrescenteComparator dc = new OrdinaByAutoreDataDecrescenteComparator();
        Set<Autore> autori = new TreeSet<>(dc);
        for(Opera opera : esp){
            autori.add(opera.getAutore());
        }
        for(Opera opera : dep){
            autori.add(opera.getAutore());
        }

        return autori;
    }
}
