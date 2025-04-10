package MasterMind;

public abstract class Player {
    protected int longitudCodigo;

    public Player(int longitudCodigo) {
        this.longitudCodigo = longitudCodigo;
    }

    public abstract String hacerIntento();

    public int getLongitudCodigo() {
        return longitudCodigo;
    }
}