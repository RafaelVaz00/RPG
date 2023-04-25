import java.util.Scanner;

public class Casa extends Construcao {

    protected int qntUnidade = 0;

    public Casa(int vida, int defesa) {
        super(vida, defesa);
    }

    public void defineValores(Scanner scan) {
    }


    public void armazenaUnidade() {
        if (qntUnidade > 10) {
            System.out.println("A casa está cheia, não é possivel armazenar nenhuma unidade!!");
        }
        System.out.println("A unidade foi armazenada!" + " Restam:" + qntUnidade + "espaços para armazenar");
        qntUnidade++;

    }


}
