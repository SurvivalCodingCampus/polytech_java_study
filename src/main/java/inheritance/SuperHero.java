package inheritance;

public class SuperHero extends Hero{
    private boolean isFlying;   // 필드 추가

    // 생성자
    public SuperHero(String name, int hp) {
        super(name, hp);
    }

    // 추가한 메소드들
    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void run() {
        System.out.println("멋지게 퇴각했다");
    }

    @Override
    public  void attack(Slime slime) {
        System.out.println(getName() + "이 공격했다");
        setHp( getHp() - 10);

        if (isFlying) {
            slime.setHP(slime.getHP() - 5);
            System.out.println("5포인트의 추가 피해를 입혔다");
        }
    }

    public static void main(String[] args) {
        Hero hero = new Hero("홍길동", 100);
        hero.run();

        SuperHero superHero = new SuperHero("한석봉", 50);
        superHero.run();
    }
}
