public class Main {
    public static void main(String[] args) {
        GreatWizard gw = new GreatWizard();
        PoisonSlime ps = new PoisonSlime("\n슬라임");
        Wizard wizard = new Wizard();

        System.out.println("현재 HP: " + gw.getHp());
        System.out.println("현재 MP: " + gw.getMp());

        ps.attack(gw);

        gw.heal(wizard);
        gw.SuperHeal();
    }
}
