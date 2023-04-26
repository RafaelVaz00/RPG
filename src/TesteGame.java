import java.util.Scanner;
import java.util.ArrayList;

public class TesteGame {

    public static void mostrarUnidades(ArrayList<Unidade> listaUnidades) {
        int x=0;

        while (x < listaUnidades.size()) {
            System.out.println(listaUnidades.get(x).toString());
            x++;
        }

    }

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
        System.out.println("7- RETORNAR");

        return Integer.parseInt(scan.next());
    }

    public static Integer menuInicial(Scanner scan) {
        System.out.println(" ");
        System.out.println("1- OPÇOES DE UNIDADES");
        System.out.println("2- AÇÕES DA UNIDADE");
        System.out.println("3- SAIR");
        System.out.println("");

        return Integer.parseInt(scan.next());
    }

    public static void main(String[] args) {

        ArrayList<Unidade> listaUnidades = new ArrayList<>();
        ArrayList<Construcao> listaConstrucoes = new ArrayList<>();

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
        menu = menuInicial(scan);


        while (menu < 3 && menu > 0) {
            switch (menu) {
                case 1: {
                    opUnidades = opcoesUnidades(scan);
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
                            Casa casa = new Casa(0, 0);
                            listaConstrucoes.add(casa);
                            break;
                        }
                        case 5: {
                            TorreVigia torreVigia = new TorreVigia(0, 0, 0);
                            listaConstrucoes.add(torreVigia);
                            break;
                        }
                        case 6: {
                            mostrarUnidades(listaUnidades);
                        }
                        case 7: {
                            menu = menuInicial(scan);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Houve um erro desconhecido" + menu);
                        }
                    }
                    break;
                }
                case 2: {
                    opAcoes = acoesUnidades(scan);
                    switch (opAcoes) {
                        case 1: {

                            System.out.println("Unidades disponíveis: ");
                            System.out.println(" ");
                            mostrarUnidades(listaUnidades);
                            System.out.println(" ");

                            Unidade unit1;
                            Unidade unit2;

                            System.out.println("Escolha uma unidade para atacar");
                            unit1 = listaUnidades.get(Integer.parseInt(scan.next()));

                            System.out.println("Escolha uma unidade para ser atacada");
                            unit2 = listaUnidades.get(Integer.parseInt(scan.next()));

                            unit1.ataca(unit2);

                            break;
                        }
                        case 2: {

                            System.out.println("Unidades disponíveis: ");
                            System.out.println(" ");
                            mostrarUnidades(listaUnidades);
                            System.out.println(" ");

                            Unidade unidade;

                            System.out.println("Escolha uma unidade para realizar um ATAQUE A DISTANCIA");
                            unidade = listaUnidades.get(Integer.parseInt(scan.next()));
                            //erro na hora de escolher uma construção!!!!!!!! resolver!!!!!!
                            if(unidade instanceof Arqueiro){
                                ((Arqueiro) unidade).ataqueDistancia(unidade);
                            } else if(unidade instanceof Mago){
                                ((Mago) unidade).ataqueDistancia(unidade);
                            } else if(Entidade instanceof TorreVigia){
                                ((TorreVigia) Entidade).ataqueDistancia(unidade);
                            }
                        }
                        case 3: {

                            System.out.println("Unidades disponíveis: ");
                            System.out.println(" ");
                            mostrarUnidades(listaUnidades);
                            System.out.println(" ");

                            Unidade unidade;

                            System.out.println("Escolha uma unidade para realizar um ATAQUE EM AREA");
                            unidade = listaUnidades.get(Integer.parseInt(scan.next()));

                            if(unidade instanceof Guerreiro){
                                ((Guerreiro) unidade).ataqueArea(unidade);
                            } else if(unidade instanceof Mago){
                                ((Mago) unidade).ataqueArea(unidade);
                            }

                        }
                        case 4: {
                            System.out.println("opcao 4 selecionada");
                            break;
                        }
                        case 5: {

                            System.out.println("Unidades disponíveis: ");
                            System.out.println(" ");
                            mostrarUnidades(listaUnidades);
                            System.out.println(" ");

                            Unidade unidade;

                            System.out.println("Escolha uma unidade para aplicar um BUFF");
                            unidade = listaUnidades.get(Integer.parseInt(scan.next()));

                            if(unidade instanceof Guerreiro){
                                ((Guerreiro) unidade).aplicaBuff(unidade);
                            } else if(unidade instanceof Mago){
                                ((Mago) unidade).aplicaBuff(unidade);
                            }

                            break;
                        }
                        case 6: {
                            System.out.println("opcao 6 selecionada");
                            break;
                        }
                        case 7: {
                            menu = menuInicial(scan);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}


