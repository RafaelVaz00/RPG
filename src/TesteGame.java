import java.util.Scanner;
import java.util.ArrayList;

public class TesteGame {

    public static Integer opcoesUnidades(Scanner scan) {
        System.out.println("1- CRIAR UM GUERREIRO");
        System.out.println("2- CRIAR UM ARQUEIRO");
        System.out.println("3- CRIAR UM MAGO");
        System.out.println("4- CRIAR UMA CASA");
        System.out.println("5- CRIAR UMA TORRE DE VIGIA");
        System.out.println("6- VER UNIDADES CRIADAS");
        System.out.println("7- RETORNAR");

        return Integer.parseInt(scan.next());
    }

    public static Integer acoesUnidades(Scanner scan) {
        System.out.println("1- Realizar ataque");
        System.out.println("2- Realizar ataque a distancia");
        System.out.println("3- Realizar ataque em area");
        System.out.println("4- Ativar CURA");
        System.out.println("5- Ativar BUFF");
        System.out.println("6- Ativar DEBUFF");

        return Integer.parseInt(scan.next());
    }

    public static Integer selecionarOpcao(Scanner scan) {
        System.out.println(" ");
        System.out.println("1- OPÇOES DE UNIDADES");
        System.out.println("2- AÇÕES DA UNIDADE");
        System.out.println("3- SAIR");
        System.out.println("");

        return Integer.parseInt(scan.next());
    }

    public static void main(String[] args) {

        ArrayList<Unidade> listaUnidades = new ArrayList<>();
        ArrayList<Construcao> listaConstrucoes= new ArrayList<>();

        int menu = 0;
        int opUnidades = 0;
        int opAcoes = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("===================AGE OF RAFAEL=========================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");

        System.out.println("");
        System.out.println("");

        System.out.println("Escolha o que deseja fazer: ");
        menu = selecionarOpcao(scan);


        while (menu < 3 && menu > 0) {
            switch (menu) {
                case 1: {
                    opUnidades=opcoesUnidades(scan);
                    switch (opUnidades) {
                        case 1: {

                            Guerreiro guerreiros = new Guerreiro(" ", 0, 0, 0, 0);
                            listaUnidades.add(guerreiros);
                            guerreiros.defineValores(scan);


                            break;
                        }
                        case 2: {

                            Arqueiro arqueiros = new Arqueiro(" ", 0, 0, 0, 0);
                            listaUnidades.add(arqueiros);
                            arqueiros.defineValores(scan);


                            break;
                        }
                        case 3: {

                            Mago magos = new Mago(" ", 0, 0, 0, 0);
                            listaUnidades.add(magos);
                            magos.defineValores(scan);


                            break;
                        }
                        case 4: {
                            Casa casa = new Casa(0,0);
                            listaConstrucoes.add(casa);

                        }
                        case 5:{
                            TorreVigia torreVigia = new TorreVigia(0, 0, 0 );
                            listaConstrucoes.add(torreVigia);

                        }
                        case 6:{
                            int x = 0;
                            try {
                                while (x < listaUnidades.size()) {
                                    System.out.println(listaUnidades.get(x).toString());
                                    x++;
                                }
                            } catch (Exception e) {
                                System.out.println("houve um erro desconhecido");
                            }

                            break;
                        }
                        case 7:{
                           selecionarOpcao(scan);

                        }
                        default: {
                            throw new IllegalStateException("Insira um valor válido!! " + opUnidades);
                        }
                    }
                }
                case 2: {
                    switch (opAcoes) {
                        case 1: {

                            acoesUnidades(scan);

                            break;
                        }
                    }
                }


            }
        }

    }
}

