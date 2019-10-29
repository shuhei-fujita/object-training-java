public class PoisonMatango extends Matango {
    // 毒攻撃の可能な残り回数の初期値を５にセット
    private int poisonCount = 5;

    // コンストラクタ
    public PoisonMatango(char suffix) {
        super(suffix);
        // TODO Auto-generated constructor stub
    }

    public void attack() {
        super.attack(h);
        if (poisonCount > 0) {
            System.out.println("毒の胞子をばらまいた!");

            int dmg = h.getHp() / 5;
            h.setHp(h.getHp() - dmg);
            System.out.println(hp / 5 + "ポイントのダメージ");

            this.poisonCount--;
        }
    }
}