import java.util.Scanner;

public class Mago extends Unidade implements Cura, Buff, Debuff, ADistancia, ataqueArea {

    public Mago(String nome, int vida, int defesa, int danoBase, int range) {
        super(nome, vida, defesa, danoBase, range);
    }

    @Override
    public void defineValores(Scanner scan) {
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

    public void ataca(Unidade defensor) {
        System.out.println("Você atacou o inimigo e causou 4 de dano");
    }

    public void recuperaVida() {
        System.out.println("Você utilizou uma habilidade de cura e renegerou 8 de HP");
        iniciaCD();
    }

    @Override
    public void aplicaBuff(Unidade mago) {
        int danoGuerreiro = mago.getDanoBase() + 5;

        mago.setDanoBase(danoGuerreiro);

        System.out.println("Buff aplicado!! O dano aumentou em 5 e está em " + mago.getDanoBase() +
                "/" + getDanoBase());
        iniciaCD();
    }

    @Override
    public void aplicaDebuff(Unidade defensor) {

        int danoDefensor = defensor.getDanoBase() - 2;

        defensor.setDanoBase(danoDefensor);

        System.out.println("Debuff aplicado!! O dano do inimigo reduziu em 2" + defensor.getDanoBase() +
                "/" + getDanoBase());
        iniciaCD();

    }

    @Override
    public void ataqueDistancia(Unidade defensor) {

        int vidaDefensor = defensor.getVida();
        int danoAtacante= this.getDanoBase() + 3;

        vidaDefensor = vidaDefensor - danoAtacante;

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo com um ataque A DISTANCIA e causou " + danoAtacante + " de dano");
        System.out.println("A vida atual da unidade "+ defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do defensor chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }
    }

    @Override
    public void ataqueArea(Unidade unidade) {
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
