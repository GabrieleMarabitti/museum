package museo;

import museo.exceptions.InputNonValidoException;
import museo.exceptions.OperaNonPresenteException;

import java.text.DateFormat;

public class Main {
    private static Quadro q1;


    public static void main(String[] args) {
        Autore a1 = new Autore("Marco", "Feniello", 1992,2,13);
        Autore a2 = new Autore("Francesco", "Pecchia", 1986,11,14);
        Autore a3 = new Autore("Federica", "Liotta",1763,7,20);
        Autore a4 = new Autore("Giulia", "Torino",2001,9,23);


        Statua s1 = new Statua("Il vaso", a3, 1, 0.57);
        Quadro q1 = new Quadro("Bacche al sole", a2, 1);
        Statua s2 = new Statua("Banchiere", a1, 2, 1.24);
        Quadro q2 = new Quadro("Mare", a2, 2);
        Quadro q3 = new Quadro("Gabbiani al gabbio", a1, 3);
        Quadro q4 = new Quadro("Giravolte in giro", a3, 4);
        Quadro q5 = new Quadro("Fresca", a2, 5);
        Statua s3 = new Statua("Cuori di marmo", a1, 3, 1.03);
        Statua s4 = new Statua("Pietre di pietre", a3, 4, 0.20);
        Statua s5 = new Statua("Alveare", a2, 5, 1.80);
        Quadro q6 = new Quadro("Al fresco", a3, 2);
        Statua s6 = new Statua("La madonnina", a2, 2, 3.25);

        Museo m1 = new Museo(5);

        m1.caricaOpera(s1);
        m1.caricaOpera(s2);
        m1.caricaOpera(s3);
        m1.caricaOpera(q1);
        m1.caricaOpera(q2);
        m1.caricaOpera(q3);
        m1.caricaOpera(s4);
        m1.caricaOpera(s5);
        m1.caricaOpera(q4);
        m1.caricaOpera(q5);
        m1.caricaOpera(q6);
        m1.caricaOpera(s6);

        try{
            m1.cerca(8);
        }catch (OperaNonPresenteException e){
            System.err.println(e.getMessage());
        }

        try{
            m1.cerca(6);
        }catch (OperaNonPresenteException e){
            System.err.println(e.getMessage());
        }


        System.out.println("");

        m1.stampaSala();

        System.out.println("");

        m1.stampaDeposito();

        System.out.println("");

        try{
            m1.sposta(8);
        }catch (OperaNonPresenteException e){
            System.err.println(e.getMessage());
        }

        try{
            m1.sposta(3);
        }catch (OperaNonPresenteException e){
            System.err.println(e.getMessage());
        }

        try{
            m1.cerca(8);
        }catch (OperaNonPresenteException e){
            System.err.println(e.getMessage());
        }


        System.out.println("");

        m1.stampaSala();

        System.out.println("");

        m1.stampaDeposito();

        System.out.println("");

        m1.cercaTecnica("guazzo");

        System.out.println("");

        m1.cercaMateriale("legno");

        System.out.println("");

        m1.stampaOpereAutore(a2);

        System.out.println("");


        try {
            InterfacciaUtente.cosaOrdinare();
        } catch (InputNonValidoException e) {
            System.err.println(e.getMessage());
        }


        System.out.println("");

        m1.stampaOpereAutore(a4);

        try{
            m1.cerca(20);
        }catch (OperaNonPresenteException e){
            System.err.println(e.getMessage());
        }


    }
}
