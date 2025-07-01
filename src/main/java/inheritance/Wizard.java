package inheritance;

public class Wizard extends Character {
    private String name;
    private int hp;
    private int mp;

    public void heal(Hero hero) {
        if (mp < 10) {
            System.out.println("마나가 부족합니다");
        }

        hero.setHp(hero.getHp() + 20);
        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }
}
