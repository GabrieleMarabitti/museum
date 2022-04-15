package museo;

public enum Materiale {
    COCCIO(1),
    RESINA(2),
    MARMO(3),
    PIETRA(4),
    LEGNO(5);

    private int valore;
    Materiale(int valore){
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }
}
