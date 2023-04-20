import java.util.Scanner;

public class TorreVigia extends Construcao implements ADistancia {

    private int danoBase;

    public TorreVigia(int vida, int defesa, int danoBase){
        super(vida, defesa);
        this.danoBase=danoBase;
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

    @Override
    public void ataqueDistancia() {
        System.out.println("Você tacou uma pedra na cabeça do inimigo e causou" +
                " 7 de dano");
    }
}
