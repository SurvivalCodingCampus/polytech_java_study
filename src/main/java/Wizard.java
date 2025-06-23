public class Wizard {
    int hp;
    int mp;
    String name;
    private Wand wand;

    public Wand getWand() {
        return wand;
    }

    public void setWand (Wand wand){
        if (wand == null) {
            throw new IllegalArgumentException ("마법사의 지팡이는 null 일 수 없다.");
        }
        this.wand = wand;
    }

    public int getMP(){
        return mp;
    }

    public void setMP(){
        if(mp > 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 한다.");
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
        if (hp < 0) {
            throw new IllegalArgumentException("HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.");
        }
    }
}