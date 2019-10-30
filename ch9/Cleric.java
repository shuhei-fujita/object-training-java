public class Cleric {
    //初期値
    String name;
    int hp = 50;
    int mp = 20;
    
    //メモリの無駄を省くためにstaticで定義
    static final int maxHp = 50;
    static final int maxMp = 20;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    Cleric(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    Cleric(String name){
        this.name = name;
    }
}