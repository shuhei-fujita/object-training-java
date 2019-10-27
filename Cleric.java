public class Cleric {
    String name;
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;
    void selfAid() {
        System.out.println("聖職者は「セルフエイド」を唱えた！");
        mp = mp - 5;
        hp = maxHp;
        System.out.println("HPが最大まで回復した！");
    }
}