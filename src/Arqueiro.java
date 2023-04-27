import java.util.Scanner;

public class Arqueiro extends Unidade implements Debuff, AtaqueDistancia {

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
    public void ataca(Unidade defensor) {

        int vidaDefensor = defensor.getVida();

        vidaDefensor = vidaDefensor - this.getDanoBase();

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("Você atacou o inimigo e causou " + this.getDanoBase() + " de dano");
        System.out.println("A vida atual da unidade "+ defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do " + defensor.getNome() + " chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }
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

        return "=========================" + "\n"+
                "|" + "\t"+ "Classe:  *ARQUEIRO* " + "|" + "\n" +
                "|" + "\t" + "nome='" + getNome() + "\t"+ "\t"+  "|" + "\n" +
                "|" + "\t" + "vida='" + getVida() + "\t"+ "\t"+ "|" + "\n" +
                "|" + "\t" + "defesa='" + getDefesa() +"\t"+ "\t"+  "|" + "\n" +
                "|" + "\t" + "dano='" + getDanoBase() + "\t"+ "\t"+ "|" + "\n" +
                "|" + "\t" + "range='" + getRange()  + "\t"+ "\t"+  "|" + "\n" +
                "========================="
                ;
    }
}
