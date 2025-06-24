public class Slime {
    protected String name;

    public Slime(String name) {
        this.name = name;
    }

    public void attack(Wizard wizard) {
        System.out.println(this.name + "이(가) 공격했다!");
        System.out.println("10의 데미지");
        wizard.setHp(wizard.getHp() - 10);
    }
}
