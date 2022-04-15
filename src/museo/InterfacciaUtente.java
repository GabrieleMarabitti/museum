package museo;

import museo.exceptions.InputNonValidoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfacciaUtente {



    private static void scegliQuadri() throws InputNonValidoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scegli come ordinare i  quadri");
        System.out.println("1 - Tecnica Crescente");
        System.out.println("2 - Tecinca Decrescente");
        System.out.println("3 - Nome Autore Crescente");
        System.out.println("4 - Nome Autore Decrescente");
        int scelta = sc.nextInt();

        switch (scelta){
            case 1:{
                for(Quadro q : Quadro.ordinaTecnicaCrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(q);
                }break;
            }
            case 2:{
                for(Quadro q : Quadro.ordinaTecnicaDecrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(q);
                }break;
            }
            case 3:{
                for(Quadro q : Quadro.ordinaNomeCrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(q);
                }break;
            }
            case 4:{
                for(Quadro q : Quadro.ordinaNomeDecrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(q);
                }break;
            }
            default:{
                throw new InputNonValidoException("Input non valido");
            }
        }

    }

    private static void scegliStatue() throws InputNonValidoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scegli come ordinare le statue");
        System.out.println("1 - Materiale Crescente");
        System.out.println("2 - Materiale Decrescente");
        System.out.println("3 - Nome Autore Crescente");
        System.out.println("4 - Nome Autore Decrescente");
        int scelta = sc.nextInt();

        switch (scelta){
            case 1:{
                for(Statua s : Statua.ordinaMaterialeCrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(s);
                }break;
            }
            case 2:{
                for(Statua s : Statua.ordinaMaterialeDecrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(s);
                }break;
            }
            case 3:{
                for(Statua s : Statua.ordinaAutoreCrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(s);
                }break;
            }
            case 4:{
                for(Statua s : Statua.ordinaAutoreDecrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(s);
                }break;
            }
            default:{
                throw new InputNonValidoException("Input non valido");
            }

        }

    }

    private static void scegliAutore() throws InputNonValidoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scegli come ordinare gli autori");
        System.out.println("1 - Data Nascita Autore Crescente");
        System.out.println("2 - Data Nascita Autore Decrescente");
        int scelta = sc.nextInt();

        switch (scelta){
            case 1:{
                for(Autore a : Autore.ordinaAutoreDataCrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(a + " - " + a.getDataNascita());
                }break;
            }
            case 2:{
                for(Autore a : Autore.ordinaAutoreDataDecrescente(Museo.getOpereEsposte(),Museo.getOpereDeposito())){
                    System.out.println(a + " - " + a.getDataNascita());
                }break;
            }
            default:{
                throw new InputNonValidoException("Input non valido");
            }
        }

    }

    public static void cosaOrdinare() throws InputNonValidoException {

        int continua;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Scegli cosa ordinare");
            System.out.println("1 - Quadri");
            System.out.println("2 - Statue");
            System.out.println("3 - Autori");
            int scelta =0 ;
            try{
                scelta = sc.nextInt();
            } catch (InputMismatchException e){
                System.err.println("Inserisci un numero!");

            }
            if(scelta == 1){
                try{
                    scegliQuadri();
                }catch (InputNonValidoException e){
                    System.err.println(e.getMessage());
                }
            }
            else if(scelta == 2){
                try{
                    scegliStatue();
                }catch (InputNonValidoException e){
                    System.err.println(e.getMessage());
                }
            }
            else if(scelta == 3){
                try{
                    scegliAutore();
                }catch (InputNonValidoException e){
                    System.err.println(e.getMessage());
                }
            }
            else {
                throw new InputNonValidoException("Input non valido");
            }
            System.out.println("continuare? 1-Y     2-N");
            continua = sc.nextInt();
        }while (continua  == 1);
        if(continua != 1 || continua != 2){
            throw new InputNonValidoException("Input non valido");
        }
    }
}








