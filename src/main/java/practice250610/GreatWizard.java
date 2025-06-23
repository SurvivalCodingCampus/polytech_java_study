package practice250610;

public class GreatWizard extends Wizard {
    public GreatWizard() {
        setMp(150);
    }

    @Override
    public void heal(Hero hero) {
        int basePoint = 25; // 기본 회복 포인트
        int mpPoint = 5;

        if (getMp() < mpPoint) {
            System.out.println("마나가 부족합니다");
        } else {
            hero.setHp(hero.getHp() + basePoint);
            setMp(getMp() - mpPoint);
            System.out.println("힐을 시전했습니다. " + hero.getName() + " HP: " + hero.getHp());
        }
    }

    public void superHeal(Hero hero) {
        int basePoint = 100; // 기본 회복 포인트
        int mpPoint = 50;

        if (getMp() < mpPoint) {
            System.out.println("마나가 부족합니다");
        } else {
            hero.setHp(basePoint);
            setMp(getMp() - mpPoint);
            System.out.println("슈퍼 힐을 시전했습니다. " + hero.getName() + " HP: " + hero.getHp());
        }
    }
}
