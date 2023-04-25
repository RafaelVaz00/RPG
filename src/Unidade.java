import java.util.Scanner;

public abstract class Unidade extends Entidade {
    private String nome;
    private int danoBase;
    private int range;

    public Unidade(String nome, int vida, int defesa, int danoBase, int range) {
        super(vida, defesa);
        this.nome = nome;
        this.danoBase = danoBase;
        this.range = range;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void ataca(Unidade defensor);

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
