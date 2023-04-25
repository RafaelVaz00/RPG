import java.util.Scanner;

public class Guerreiro extends Unidade implements Buff, ataqueArea {


    public Guerreiro(String nome, int vida, int defesa, int danoBase, int range) {
        super(nome, vida, defesa, danoBase, range);

    }

    @Override
    public void defineValores(Scanner scan) {
        System.out.println("Escolha o NOME da sua unidade");
        Guerreiro.this.setNome(scan.next());

        System.out.println("Escolha a VIDA da sua unidade");
        Guerreiro.this.setVida(Integer.parseInt(scan.next()));

        System.out.println("Escolha a DEFESA da sua unidade ");
        Guerreiro.this.setDefesa(Integer.parseInt(scan.next()));

        System.out.println("Escolha o DANO da sua unidade ");
        Guerreiro.this.setDanoBase(Integer.parseInt(scan.next()));

        System.out.println("Escolha o RANGE da sua unidade ");
        Guerreiro.this.setRange(Integer.parseInt(scan.next()));
    }

    @Override
    public void ataca(Unidade defensor) {

        int vidaDefensor = defensor.getVida();

        vidaDefensor = vidaDefensor - this.getDanoBase();

        defensor.setVida(vidaDefensor);

        System.out.println("Você atacou o inimigo e causou " + this.getDanoBase() + " de dano");
        System.out.println("A vida atual do inimigo está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do defensor chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }

    }

    @Override
    public void aplicaBuff(Unidade guerreiro) {

        int danoGuerreiro= guerreiro.getDanoBase() + 5;

        guerreiro.setDanoBase(danoGuerreiro);

        System.out.println("Buff aplicado!! O dano aumentou em 5 e está em " + guerreiro.getDanoBase() +
                "/" + getDanoBase());
        iniciaCD();
    }

    @Override
    public void ataqueArea() {
        System.out.println("Você realizou um ataque em Area!");
    }

    @Override
    public void iniciaCD() {
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
    }

    @Override
    public String toString() {
        return "Classe Guerreiro{" +
                "nome='" + getNome() + '\'' +
                "vida='" + getVida() + '\'' +
                "defesa='" + getDefesa() + '\'' +
                "dano='" + getDanoBase() + '\'' +
                "range='" + getRange() + '\'' +
                '}';
    }
}
