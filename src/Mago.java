import java.util.Scanner;

public class Mago extends Unidade implements Cura, Buff, Debuff, AtaqueDistancia, ataqueArea {

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

        int vidaDefensor = defensor.getVida();

        vidaDefensor = vidaDefensor - this.getDanoBase();

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo e causou " + this.getDanoBase() + " de dano");
        System.out.println("A vida atual da unidade " + defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do " + defensor.getNome() + " chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }
    }

    public void recuperaVida(Unidade unidade) {

        int vidaUnidade = unidade.getVida() + DIPIRONA;

        unidade.setVida(vidaUnidade);

        System.out.println("Você utilizou uma habilidade de cura e renegerou " + DIPIRONA + " de HP");

    }

    @Override
    public void aplicaBuff(Unidade unidade) {
        int danoUnidade = unidade.getDanoBase() + 5;

        unidade.setDanoBase(danoUnidade);

        System.out.println("Buff aplicado!! O dano aumentou em " + DIPIRONA + " e está em " + unidade.getDanoBase() +
                "/" + getDanoBase());
    }

    @Override
    public void aplicaDebuff(Unidade defensor) {

        int danoDefensor = defensor.getDanoBase() - ANTIALERGICO;

        defensor.setDanoBase(danoDefensor);

        System.out.println("Debuff aplicado!! O dano do inimigo reduziu em" + ANTIALERGICO + defensor.getDanoBase() +
                "/" + getDanoBase());

    }

    @Override
    public void ataqueDistancia(Unidade defensor) {

        int vidaDefensor = defensor.getVida();
        int danoAtacante = this.getDanoBase() + 3;

        vidaDefensor = vidaDefensor - danoAtacante;

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo com um ataque A DISTANCIA e causou " + danoAtacante + " de dano");
        System.out.println("A vida atual da unidade " + defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do defensor chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }
    }

    @Override
    public void ataqueArea(Unidade defensor) {

        int vidaDefensor = defensor.getVida();
        int danoAtacante = this.getDanoBase() + 10;

        vidaDefensor = vidaDefensor - danoAtacante;

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo com uma Habilidade em área e causou " + danoAtacante + " de dano");
        System.out.println("A vida atual da unidade " + defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do defensor chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }
    }

    @Override
    public void iniciaCD() {

        for (int x = 10; x >= 10; x--) {
            System.out.println(x);
        }
    }

    public String toString() {
        return "=========================" + "\n" +
                "|" + "\t" + "Classe:  *MAGO* " + "|" + "\n" +
                "|" + "\t" + "nome='" + getNome() + "\t" + "\t" + "|" + "\n" +
                "|" + "\t" + "vida='" + getVida() + "\t" + "\t" + "|" + "\n" +
                "|" + "\t" + "defesa='" + getDefesa() + "\t" + "\t" + "|" + "\n" +
                "|" + "\t" + "dano='" + getDanoBase() + "\t" + "\t" + "|" + "\n" +
                "|" + "\t" + "range='" + getRange() + "\t" + "\t" + "|" + "\n" +
                "========================="
                ;
    }
}
