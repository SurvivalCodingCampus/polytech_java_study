package inheritance;

public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // getter, setter, 생성자 생략

    public void attack(Slime slime) {
        System.out.println(name + "이 공격했다");
        hp -= 10;
    }

    public void run() {
        System.out.println(name + "이 도망쳤다");
    }

    public final void slip() {
        hp -= 5;
        System.out.println(name + "는 미끄러졌다!");
        System.out.println("5의 데미지!");
    }


}
