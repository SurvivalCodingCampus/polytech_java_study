package Monster;

public class Goblin extends WalkingMonster {
    
    @Override
    public void attack() {
        System.out.println("Goblin attack");
    }

    @Override
    public void run() {
        super.run();

        System.out.println("Goblin run");
    }
}
