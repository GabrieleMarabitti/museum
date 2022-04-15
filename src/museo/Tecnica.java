package museo;

public enum Tecnica {
    PUNTINISMO(1),
    ASSEMBLAGE(2),
    COLLAGE(3),
    CARBONCINO(4),
    GUAZZO(5);

    private int valore;

    Tecnica(int valore) {
        this.valore =valore;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }
}
