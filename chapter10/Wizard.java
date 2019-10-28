public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.power);

        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * @return the mp
     */
    public int getMp() {
        return this.mp;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the wand
     */
    public Wand getWand() {
        return this.wand;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @param mp the mp to set
     */
    public void setMp(int mp) {
        this.mp = mp;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param wand the wand to set
     */
    public void setWand(Wand wand) {
        this.wand = wand;
    }
}