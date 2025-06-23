package inheritance;

public class GreatWizard extends Wizard {
    private int mp = 150;

    @Override
    public void heal(Hero hero) {
        hero.setHp(hero.getHp() + 25);
        mp -= 5;
    }

    public void superHeal(Hero hero) {
        if (mp < 50) {
            System.out.println("마나가 부족합니다");
        }

        hero.setHp(hero.getHp() );
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
        mp -= 50;
    }


}
