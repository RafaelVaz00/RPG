import java.util.Scanner;

public class TorreVigia extends Construcao implements ADistancia {

    private int danoBase;

    public TorreVigia(int vida, int defesa, int danoBase) {
        super(vida, defesa);
        this.danoBase = danoBase;
    }

    @Override
    public void defineValores(Scanner scan) {
        System.out.println("Escolha a VIDA da sua unidade");
        TorreVigia.this.setVida(Integer.parseInt(scan.next()));

        System.out.println("Escolha a DEFESA da sua unidade");
        TorreVigia.this.setDefesa(Integer.parseInt(scan.next()));

        System.out.println("Escolha o DANO da sua unidade ");
        TorreVigia.this.setDanoBase(Integer.parseInt(scan.next()));

    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getDanoBase(){
        return this.danoBase;
    }

    @Override
    public void ataqueDistancia(Unidade defensor) {

        int vidaDefensor = defensor.getVida();
        int danoAtacante= this.getDanoBase() + 3;

        vidaDefensor = vidaDefensor - danoAtacante;

        defensor.setVida(vidaDefensor);
        //consertar a vida original do alvo.
        System.out.println("A torre atacou o inimigo com um ataque A DISTANCIA e causou " + danoAtacante + " de dano");
        System.out.println("A vida atual da unidade "+ defensor.getNome() + " está em " + defensor.getVida() + "/" + getVida() + " HP");

        if (defensor.getVida() <= 0) {
            System.out.println(" ");
            System.out.println("A vida do defensor chegou a 0" + "/" + getVida() + " e ele morreu!!!");
        }
    }
}
