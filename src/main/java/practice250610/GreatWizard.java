package practice250610;

public class GreatWizard extends Wizard {
    private int superMpPoint;

    //mp = 150
    public GreatWizard() {
        super("Gwizard", 100, 150);
        setSuperMpPoint(50);
        setHealPoint(25);
        setMpPoint(5);
    }

    @Override
    public void heal(Hero hero) {
        super.heal(hero);
    }

    public void superHeal(Hero hero) {
        if (getMp() < getSuperMpPoint()) {
            System.out.println("마나가 부족합니다");
        } else {
            hero.setHp(hero.getMaxHp());
            setMp(getMp() - getSuperMpPoint());
            System.out.println("슈퍼 힐을 시전했습니다. " + hero.getName() + " HP: " + hero.getHp());
        }
    }

    public int getSuperMpPoint() {
        return superMpPoint;
    }

    public void setSuperMpPoint(int superMpPoint) {
        this.superMpPoint = superMpPoint;
    }
}
