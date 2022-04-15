package museo;

public class Opera {
    private static int ID = 1;
    private int codice;
    private String titolo;
    private Autore autore;
    private String status;

    public Opera(String titolo, Autore autore){
        this.codice = ID++;
        this.titolo = titolo;
        this.autore = autore;
    }

    public int getCodice() {
        return codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "titolo: " + titolo + ", autore: " + autore;
    }
}
