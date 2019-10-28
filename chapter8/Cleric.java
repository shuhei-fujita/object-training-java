public class Cleric {
    String name;

    // コンストラクタの定義
    Cleric() {
        int hp = 50;
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