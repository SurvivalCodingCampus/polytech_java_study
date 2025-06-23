package inheritance;

public class PoisonSlime extends Slime{
    private int poisonCount = 5;

    public PoisonSlime(String name, int hp) {
        super(name, hp);
    }


    @Override
    public void attack(Hero hero) {
        System.out.println("보통 슬라임과 같은 공격");
            hero.setHp(hero.getHp() - 10);

        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포한다!");
            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println( damage + "포인트의 데미지");
            poisonCount --;
        }
    }
}
