package practice250610;

public class PoisonSlime extends Slime {
    private int poisonCount;

    public PoisonSlime(String suffix) {
        super(suffix);
        poisonCount = 5;
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        System.out.println("슬라임 " + getSuffix() + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);

        if (getPoisonCount() > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");

            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);

            System.out.println(poisonDamage + "포인트의 데미지");

            poisonCount--;
        }
    }
}
