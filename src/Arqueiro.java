import java.util.Scanner;

public class Arqueiro extends Unidade implements Debuff, ADistancia {

    public Arqueiro(String nome, int vida, int defesa, int danoBase, int range) {
        super(nome, vida, defesa, danoBase, range);
    }
    @Override
    public void defineValores(Scanner scan){
        System.out.println("Escolha o NOME da sua unidade");
        Arqueiro.this.setNome(scan.next());

        System.out.println("Escolha a VIDA da sua unidade");
        Arqueiro.this.setVida(Integer.parseInt(scan.next()));

        System.out.println("Escolha a DEFESA da sua unidade ");
        Arqueiro.this.setDefesa(Integer.parseInt(scan.next()));

        System.out.println("Escolha o DANO da sua unidade ");
        Arqueiro.this.setDanoBase(Integer.parseInt(scan.next()));

        System.out.println("Escolha o RANGE da sua unidade ");
        Arqueiro.this.setRange(Integer.parseInt(scan.next()));
    }

    @Override
    public void ataca() {
        System.out.println("Você atacou o inimigo e causou 4 de dano");
    }

    @Override
    public void aplicaDebuff() {
        System.out.println("Debuff aplicado!! O dano do inimigo reduziu em 2");
        iniciaCD();
    }

    @Override
    public void ataqueDistancia() {
        System.out.println("Você tacou uma pedra na cabeça do inimigo e causou" +
                " 7 de dano");
    }

    @Override
    public void iniciaCD() {
        System.out.println("7");
        System.out.println("6");
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
    }

    public String toString() {
        return "Classe Arqueiro{" +
                "nome='" + getNome() + '\'' +
                "vida'" + getVida() + '\'' +
                "defesa='" + getDefesa() + '\'' +
                "dano='" + getDanoBase() + '\'' +
                "range='" + getRange() + '\'' +
                "}";
    }
}
