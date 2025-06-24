package com.survivalcoding.assignments_01_instance.exam01;

public class PoisonSlime extends Slime {
    public static final int MAX_HP=10;
    public static final int DEFAULT_POISON_COUNT=5;

    //인스턴스화 PoisonSlime poisonSlime = new PoisonSlime(“A”);
    //PoisonSlime 독 공격 가능 횟수를 저장하는 poisonCount(초기값 5)를 가진다. 아무나 수정 금지
    private int poisonCount=DEFAULT_POISON_COUNT;

    public PoisonSlime(String prefix, int hp){
        super(prefix, hp);
    }
    public PoisonSlime(String prefix){
        super(prefix, MAX_HP);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    //PoisonSlime attack() 메소드가 호출되면 다음 내용의 공격을 한다
    // 보통 슬라임과 같은 공격
    @Override
    public void attack(Hero hero){
        super.attack(hero);
        //poisonCount가 0이 아니면 다음을 추가로 수행한다
        //화면에 “추가로, 독 포자를 살포했다!” 를 표시
        if(poisonCount>0){
            System.out.println("추가로 독 포자를 살포했다!");

            int damage=hero.getHp()/5;
            hero.setHp(hero.getHp()-damage);
            System.out.println(damage + "포인트의 데미지");
            poisonCount--;
            //hero의 HP 의 1/5에 해당하는 포인트를 용사의 HP 로부터 감소시키고, “~포인트의 데미지" 라고 표시
            //poisonCount 를 1 감소 시킨다
        }
    }
}
