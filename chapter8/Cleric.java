public class Cleric {

    // 静的メンバ，最大値は共通事項なのでここで定義
    static final int maxHp = 50;
    static final int maxMp = 10;

    // コンストラクタの定義
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, Cleric.maxMp);
    }

    Cleric(String name) {
        this(name, Cleric.maxHp);
    }

    Cleric() {
        int hp = 50;
        // finalは定数，上書き不可
        final int maxHp = 50;
        int mp = 10;
        final int maxMp = 10;
    }

    public void selfAid() {
        System.out.println("聖職者は「セルフエイド」を唱えた！");
        mp = mp - 5;
        hp = maxHp;
        System.out.println("HPが最大まで回復した！");
    }

    public int pray(int prayTime) {
        // 祈る呪文を発動
        System.out.println("聖職者は" + prayTime + "秒間「祈る」をした！");

        // 回復値をランダムを使って求める
        int aidPoint = new java.util.Random().nextInt(2) + prayTime;

        // 実際の回復量を計算
        // 最大MPより大きくならないという条件付き
        int upMp = Math.min(maxMp - mp, aidPoint);

        // mpの値を更新
        mp += upMp;

        // 戻り値を回復量を返す
        return upMp;
    }
}