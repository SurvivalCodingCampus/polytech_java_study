public class Main {
    public static void main(String[] args) {
        /*GreatWizard gw = new GreatWizard();
        PoisonSlime ps = new PoisonSlime("\n슬라임");
        Wizard wizard = new Wizard();

        System.out.println("현재 HP: " + gw.getHp());
        System.out.println("현재 MP: " + gw.getMp());

        ps.attack(gw);

        gw.heal(wizard);
        gw.SuperHeal();
    */
        StrongBox<String> box1 = new StrongBox<>(StrongBox.KeyType.PADLOCK);
        box1.put("패드록");

        for (int i = 0; i < 1024; i++) {
            if (box1.get() != null) {
                System.out.println("금고 열림: " + box1.get());
                break;
            }
        }

        StrongBox<String> box2 = new StrongBox<>(StrongBox.KeyType.BUTTON);
        box2.put("버튼");

        for (int i = 0; i < 10000; i++) {
            if (box2.get() != null) {
                System.out.println("금고 열림: " + box2.get());
                break;
            }
        }

        StrongBox<String> box3 = new StrongBox<>(StrongBox.KeyType.DIAL);
        box3.put("다이얼");

        for (int i = 0; i < 30000; i++) {
            if (box3.get() != null) {
                System.out.println("금고 열림: " + box3.get());
                break;
            }
        }

        StrongBox<String> box4 = new StrongBox<>(StrongBox.KeyType.FINGER);
        box4.put("핀겔");

        for (int i = 0; i < 1000000; i++) {
            if (box4.get() != null) {
                System.out.println("금고 열림: " + box4.get());
                break;
            }
        }
    }
}
