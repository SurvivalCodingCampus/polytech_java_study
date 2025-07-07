package instance;

import java.util.HashSet;

public class SetMain {
    public static void main(String[] args) {
        Set<Hero> heroesSet = new HashSet<>();
        Hero h1 = new Hero("슈퍼맨", 100);
        Hero h2 = new Hero("슈퍼맨", 100);

        heroesSet.add(h1);
        System.out.printl(heroesSet.size());

        heroesSet.remove(h2);
        System.out.printl(heroesSet.size());
    }
}
