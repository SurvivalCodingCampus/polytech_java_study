package generic;

import com.survivalcoding.Cleric;
import com.survivalcoding.Wizard;

public class Pocket<E> {
    private E data;

    public void put(E data) {

        this.data = data;
    }

    public E get() {

        return data;
    }

    public static void main(String[] args) {
       /* Pocket<String> pocket = new Pocket<>();
        pocket.put("111");

        String name = pocket.get();
        System.out.println(name); */

        Pocket<Character> pocket1 = new Pocket<>();
        //pocket1.put(new Cleric("11"));

        Pocket<Cleric> pocket2 = new Pocket<>();
        Pocket<Wizard> pocket3 = new Pocket<>();
    }
}
