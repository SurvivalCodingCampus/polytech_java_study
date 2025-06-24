package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount;

    public PoisonSlime(String suffix) {
        super(suffix);
        this.poisonCount = 5;
    }

    public int getPoisonCount() {
        return this.poisonCount;
    }

    // 클래스 내부에서만 수정이 가능하게
    private final void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (this.getPoisonCount() == 0) {
            return;
        }

        System.out.println("추가로, 독 포자를 살포했다!");

        int remainHp = hero.getHp() - hero.getHp() / 5;
        hero.setHp(remainHp);
        System.out.println(remainHp + "포인트의 데미지");

        this.setPoisonCount(this.getPoisonCount() - 1);
    }
}
