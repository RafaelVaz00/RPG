public abstract class Entidade {

    private int vida;
    private int defesa;

    public Entidade(int vida, int defesa){
        this.vida=vida;
        this.defesa=defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
