package instance;

import com.survivalcoding.Hero;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<Hero> heroesList = new ArrayList<>();
        Hero h1 = new Hero("슈퍼맨", 100);
        Hero h2 = new Hero("슈퍼맨", 100);

        heroesList.add(h1);
        System.out.println(heroesList.size());

        heroesList.remove(h2);
        System.out.println(heroesList.size());
    }
}
