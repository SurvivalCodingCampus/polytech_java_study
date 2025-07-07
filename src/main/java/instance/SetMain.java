package instance;

import com.survivalcoding.Hero;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Hero> heroesSet = new HashSet<>();
        Hero h1 = new Hero("슈퍼맨", 100);
        Hero h2 = new Hero("슈퍼맨", 100);

        heroesSet.add(h1);
        System.out.println(heroesSet.size());

        heroesSet.remove(h2);
        System.out.println(heroesSet.size());
    }
}
