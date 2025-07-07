# 제네릭 Generic

## '나중에' 타입을 정하고 싶음
클래스 설계 단계가 아닌, 런타임 중에 타입을 결정하고 싶음

```Java
// Non-generic..
public class Pocket {
    private Object data; // Object, one above all

    public void put(Object data) {
        this.data = data;
    }

    public Object get() {
        return this.data;
    }
}


public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket();
        
        // Can put everything in.
        pocket.put("111");
        pocket.put(111);
        pocket.put(true);
        
        // Can NOT get anything specific.
        String name = pocket.get(); // Compile Error
        
        // But DON'T
        String forcedName = (String) pocket.get();
    }
}
```

```Java
// Generic
public class Pocket<E> {
    private E data; // Define type later

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        return this.data;
    }
}


public class Main {
    public static void main(String[] args) {
        Pocket<String> pocket = new Pocket<>(); // Now String-specific Pocket
        
        pocket.put("111");
        // You can NOT 
        // pocket.put(111);
    }
}
```

## 특정 클래스에서 상속받은 클래스만을 타입으로 제약할 수도 있음

```Java
public class Pocket<E extends Character> {
    // codes..
}
```