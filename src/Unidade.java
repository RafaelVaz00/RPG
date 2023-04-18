public abstract class Unidade extends Entidade {

    private int danoBase;
    private int range;

    public Unidade(int vida, int defesa, int danoBase, int range){
        super(vida, defesa);
        this.danoBase=danoBase;
        this.range=range;
    }
    public abstract void ataca();

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
