# 다형성 Polymorphism

## 하나의 객체, 여러개의 형태

```Java
import java.util.ArrayList;

public interface Drawable {
    void Draw();
}

public class Laptop implements Drawable {
    @Override
    public void Draw() {
        // drawing Laptop..
    }
}

public class Photo implements Drawable {
    @Override
    public void Draw() {
        // drawing Photo..
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Photo photo = new Photo();

        // Can add to ArrayList despite they were instances of DIFFERENT classes.
        // They were Laptop and Photo, but they were Drawable, too.
        List<Drawable> drawableList = new ArrayList<>();
        drawableList.add(laptop);
        drawableList.add(photo);
    }
}
```

## 왜 다형성 Why polymorph

- 공통 메서드를 통합 관리 : \(예시) `laptop` 와 `photo` 의 `draw()` 를 한 가지의 메서드로 인식
    - 컴파일러는 타입이 메서드를 보유했는지는 확인하지만, 메서드의 코드 내용은 인스턴스의 몫
  ```Java
  public class Main {
    public class Thing {
        void write() {
            // thing's writing codes..
        }
    }
  
    public class Laptop extends Thing {
        void write() {
            // Laptop's writing codes..
        }
    }
  
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Thing macbook = new Laptop();
  
        // Both thing call write() in Laptop class..
        laptop.write();
        macbook.write();
    }
  }
  ```

### 다운캐스팅 Down-cast

```Java
public class Main {
    public static void main(String[] args) {
        Thing macbook = new Laptop();
        Laptop laptop = (Laptop) macbook; // Down-cast 
    }
}
```

## 코드의 중복을 제거하기
타입을 하나로 묶어 잘 동작하게 할 수 있음

```Java
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    final List<Character> characters = new ArrayList<>(); // 빈 리스트 생성
    
    characters.add(new Hero("Karl"));
    characters.add(new Hero("Lion"));
    characters.add(new Magician("Harry"));
    characters.add(new Shaman("Olo"));
    
    // 통합 관리 : 클래스가 다른 각 인스턴스의 메서드나 필드를 따로따로 손 댈 필요가 없음
    for (Character character : characters) {
        character.hp += 50;
    }
  }
}
```