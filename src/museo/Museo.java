package museo;

import museo.exceptions.AutoreNonPresenteException;
import museo.exceptions.OperaNonPresenteException;

import java.util.*;

public class Museo {
    private int capienza;
    private static ArrayList<Opera> opereEsposte;
    private static HashSet<Opera> opereDeposito;

    public Museo(int capienza){
        this.capienza = capienza;
        this.opereEsposte = new ArrayList<>();
        this.opereDeposito = new HashSet<>();
    }

    public int getCapienza() {
        return capienza;
    }

    public static ArrayList<Opera> getOpereEsposte() {
        return opereEsposte;
    }

    public static HashSet<Opera> getOpereDeposito() {
        return opereDeposito;
    }

    public void caricaOpera(Opera opera){
        if(opereEsposte.size() < capienza){
            opereEsposte.add(opera);
            opera.setStatus("Esposta");
        }else{
            opereDeposito.add(opera);
            opera.setStatus("Desposito");
        }
    }

    public Opera sposta(int code) throws OperaNonPresenteException {
        Iterator<Opera> iter = opereEsposte.iterator();
        while (iter.hasNext()) {
            Opera o = iter.next();
            if (o.getCodice() == code){
                iter.remove();
                opereDeposito.add(o);
                o.setStatus("Deposito");
                return o;
            }
        }
        throw new OperaNonPresenteException("Opera non presente");
    }

    public Opera cerca(int codice) throws OperaNonPresenteException {
        for(Opera o : opereEsposte){
            if(o.getCodice() == codice){
                System.out.println("OPERA CODICE " + o.getCodice() + " - " + o.getStatus());
                return o;
            }
        }
        for(Opera o : opereDeposito){
            if(o.getCodice() == codice){
                System.out.println("OPERA CODICE " + o.getCodice() + " - " + o.getStatus());
                return o;
            }
        }
        throw new OperaNonPresenteException("Opera non presente");
    }

    public void stampaSala(){
        System.out.println("OPERE IN SALA:");
        for(Opera o : opereEsposte){
            System.out.println(o);
        }
    }

    public void stampaDeposito(){
        System.out.println("OPERE IN DEPOSITO");
        for(Opera o : opereDeposito){
            System.out.println(o);
        }
    }

    private void autoreEsiste(Autore autore) throws AutoreNonPresenteException {
        int esposte = 0;
        int deposito = 0;
        for(Opera o : opereEsposte) {
            if (o.getAutore() == autore)
                esposte++;
        }
        for(Opera o : opereDeposito) {
            if (o.getAutore() == autore)
                deposito++;
        }
        if(esposte + deposito == 0){
            throw new AutoreNonPresenteException("Autore non presente nel museo");
        }
    }

    public void stampaOpereAutore(Autore autore){
        System.out.println("OPERE DI: " + autore.toString().toUpperCase());
        try{
            autoreEsiste(autore);
        }catch (AutoreNonPresenteException e){
            System.err.println(e.getMessage());
        }

        for(Opera o : opereEsposte){
            if(o.getAutore() == autore)
                System.out.println(o);
        }
        for(Opera o : opereDeposito){
            if(o.getAutore() == autore)
                System.out.println(o);
        }
    }

    public void cercaTecnica(String tecnica){
        System.out.println("OPERE CON TECNINCA: " + tecnica.toUpperCase());

        for(Opera o : opereEsposte){
            if(o instanceof Quadro && ((Quadro) o).getTecnica().equalsIgnoreCase(tecnica)){
                System.out.println(o);
            }
        }
        for(Opera o : opereDeposito){
            if(o instanceof Quadro && ((Quadro) o).getTecnica().equalsIgnoreCase(tecnica)){
                System.out.println(o);
            }
        }
    }

    public void cercaMateriale(String materiale){
        System.out.println("OPERE CON MATERIALE: " + materiale.toUpperCase());

        for(Opera o : opereEsposte){
            if(o instanceof Statua && ((Statua) o).getMateriale().equalsIgnoreCase(materiale)){
                System.out.println(o);
            }
        }
        for(Opera o : opereDeposito){
            if(o instanceof Statua && ((Statua) o).getMateriale().equalsIgnoreCase(materiale)){
                System.out.println(o);
            }
        }
    }




}
