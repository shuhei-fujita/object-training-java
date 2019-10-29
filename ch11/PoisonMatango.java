public class PoisonMatango extends Matango {
    // 毒攻撃の可能な残り回数の初期値を５にセット
    private int poisonCount = 5;

    // コンストラクタ
    public PoisonMatango(char suffix) {
        super(suffix);
        // TODO Auto-generated constructor stub
    }

    public void attack() {
        System.out.println("きのこ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.setHp(getHp() - 10);

        if (poisonCount != 0) {
            attackPoison(this.h);
            System.out.println("毒の胞子をばらまいた!");

            steHp(hp - hp / 5);
            System.out.println(hp / 5 + "ポイントのダメージ");

            poisonCount--;
        }
    }

    // 毒攻撃ができるので
    public void attackPoison(Hero h) {
        System.out.println("きのこ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.setHp(getHp() - 10);
    }
}