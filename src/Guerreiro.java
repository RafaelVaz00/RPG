import java.util.Scanner;

public class Guerreiro extends Unidade implements Buff, ataqueArea {


    public Guerreiro(String nome, int vida, int defesa, int danoBase, int range) {
        super(nome, vida, defesa, danoBase, range);

    }
    @Override
    public void defineValores(Scanner scan){
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
    public void ataca() {
        System.out.println("Você atacou o inimigo e causou 5 de dano");
    }

    @Override
    public void aplicaBuff() {
        System.out.println("Buff aplicado!! O dano aumentou em 5");
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
                "range='" + getRange() +
                '}';
    }
}
