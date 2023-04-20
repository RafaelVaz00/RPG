import java.util.Scanner;

public class Mago extends Unidade implements Cura, Buff, Debuff, ADistancia, ataqueArea {

    public Mago(String nome, int vida, int defesa, int danoBase, int range) {
        super(nome, vida, defesa, danoBase, range);
    }

    public void ataca() {
        System.out.println("Você atacou o inimigo e causou 4 de dano");
    }

    @Override
    public void defineValores(Scanner scan){
        System.out.println("Escolha o NOME da sua unidade");
        Mago.this.setNome(scan.next());

        System.out.println("Escolha a VIDA da sua unidade");
        Mago.this.setVida(Integer.parseInt(scan.next()));

        System.out.println("Escolha a DEFESA da sua unidade ");
        Mago.this.setDefesa(Integer.parseInt(scan.next()));

        System.out.println("Escolha o DANO da sua unidade ");
        Mago.this.setDanoBase(Integer.parseInt(scan.next()));

        System.out.println("Escolha o RANGE da sua unidade ");
        Mago.this.setRange(Integer.parseInt(scan.next()));
    }

    public void recuperaVida() {
        System.out.println("Você utilizou uma habilidade de cura e renegerou 8 de HP");
        iniciaCD();
    }

    @Override
    public void aplicaBuff() {
        System.out.println("Você utilizou uma habilidade de Buff, o dano Foi aumentado em 3");
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
    public void ataqueArea() {
        System.out.println("Você utilizou uma habilidade em Área e causou 5 d dano");
    }

    @Override
    public void iniciaCD() {

        for (int x = 10; x >= 10; x--) {
            System.out.println(x);
        }
    }

    public String toString() {
        return "Classe Mago{" +
                "nome='" + getNome() + '\'' +
                "vida'" + getVida() + '\'' +
                "defesa='" + getDefesa() + '\'' +
                "dano='" + getDanoBase() + '\'' +
                "range='" + getRange() + '\'' +
                "}";
    }
}
