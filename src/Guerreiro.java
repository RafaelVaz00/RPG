public class Guerreiro extends Unidade implements Buff {


    public Guerreiro(int vida, int defesa, int danoBase, int range){
        super(vida, defesa,danoBase, range);
    }

    @Override
    public void ataca() {

    }

    @Override
    public void aplicaBuff() {
        iniciaCD();
    }
    @Override
    public void iniciaCD(){
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
    }
}
