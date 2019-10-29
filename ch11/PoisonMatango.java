public class PoisonMatango extends Matango {

    // コンストラクタ
    public PoisonMatango(char suffix) {
        super(suffix);
        // TODO Auto-generated constructor stub
    }

    // 毒攻撃ができるので
    public void attackPoison(Hero h) {
        System.out.println("きのこ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.setHp(getHp() - 10);
    }
}