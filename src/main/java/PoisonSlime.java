public class PoisonSlime extends Slime {

    private int poisonCount = 5;  // 수정 금지

    public PoisonSlime(String name) {
        super(name);
    }

    @Override
    public void attack(Wizard wizard) {
        super.attack(wizard);

        if (poisonCount > 0) {
            System.out.println("\n추가로, 독 포자를 살포했다!");

            int poisonDamage = wizard.getHp() / 5;
            wizard.setHp(wizard.getHp() - poisonDamage);

            System.out.println(poisonDamage + "데미지! \n");
            poisonCount--;
        }
    }
}
