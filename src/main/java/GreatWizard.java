public class GreatWizard extends Wizard {

    int mp = 150;

    @Override
    public void heal(Wizard wizard) {

        if (mp >= 10) {
            this.hp = Math.min(this.hp + 25, MAX_HP);
            this.mp -= 5;

            System.out.println("힐을 시전했습니다. 대상 HP: " + hp + ", MP: " + mp);
        } else {
            System.out.println("마나가 부족합니다.");
        }
    }

    public void SuperHeal() {
        if (mp >= 50) {
            this.hp = Math.min(this.hp + 100, MAX_HP);
            this.mp -= 50;

            System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hp + ", MP: " + mp);
        } else {
            System.out.println("마나가 부족합니다.");
        }
    }
}
