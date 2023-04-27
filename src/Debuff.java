public interface Debuff extends Habilidade{

    static final int ANTIALERGICO= -10;

    abstract void aplicaDebuff(Unidade defensor);

}
