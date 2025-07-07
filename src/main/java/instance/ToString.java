package instance;

import com.survivalcoding.Hero;

public class ToString {
    public static void main(String[] args) {
        Object object = new Hero("aaa", 10);
        object = 10;
        object = true;
        object = null;

        Hero hero = new Hero("hero", 10);
        System.out.println(hero.hashCode());
    }
}