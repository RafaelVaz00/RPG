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
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo e causou " + this.getDanoBase() + " de dano");
        System.out.println("A vida atual da unidade " + defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do defensor chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }

    }

    @Override
    public void aplicaBuff(Unidade guerreiro) {

        int danoGuerreiro = guerreiro.getDanoBase() + 5;

        guerreiro.setDanoBase(danoGuerreiro);

        System.out.println("Buff aplicado!! O dano aumentou em 5 e está em " + guerreiro.getDanoBase() +
                "/" + getDanoBase());
        iniciaCD();
    }

    @Override
    public void ataqueArea(Unidade defensor) {

        int vidaDefensor = defensor.getVida();
        int danoAtacante = this.getDanoBase() + 10;

        vidaDefensor = vidaDefensor - danoAtacante;

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo com uma Habilidade em área e causou " + danoAtacante + "+ [10] de dano extra");
        System.out.println("A vida atual da unidade " + defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A inimigo ficou com " + "/" + getVida() + "HP e MORREU HAHAHAHA!!!");
        }

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
        return "=========================" + "\n"+
                "|" + "\t"+ "Classe:  *GUERREIRO* " + "|" + "\n" +
                "|" + "\t" + "nome='" + getNome() + "\t"+ "\t"+  "|" + "\n" +
                "|" + "\t" + "vida='" + getVida() + "\t"+ "\t"+ "|" + "\n" +
                "|" + "\t" + "defesa='" + getDefesa() +"\t"+ "\t"+  "|" + "\n" +
                "|" + "\t" + "dano='" + getDanoBase() + "\t"+ "\t"+ "|" + "\n" +
                "|" + "\t" + "range='" + getRange()  + "\t"+ "\t"+  "|" + "\n" +
                "========================="
                ;
    }
}
