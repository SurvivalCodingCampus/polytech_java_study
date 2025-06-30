# abstract and interface

  ```Java
  public abstract class Gun {
    String name;

    public abstract void fire();

    public abstract void reload();
}

public interface ElectricSystem {
    void checkRemainingBattery();
}

public class Revolver extends Gun {

    @Override
    public void fire() {
        // firing sequences for revolver..
    }

    @Override
    public void reload() {
        // reloading sequences for revolver..
    }
}

public class Railgun extends Gun implements ElectricSystem {
    double battery;

    @Override
    public void fire() {
        // firing sequences for railgun..
    }

    @Override
    public void reload() {
        // reloading sequences for railgun..
    }

    @Override
    public void checkRemainingBattery() {
        // print remaining battery..
    }
}
  ```

## '아직' 구현되지 않은, 추상체

- 개발 단계나 서비스 설계상, 미래에 구현될 것임이 (비)자명하나, 당장 구현할 수 없음
    - 예: 상속된 클래스에서 구현되는 것이 적합할 때
- 설계상 개념과 실제 구현체를 구분짓기
- 추상*(abstract)* 클래스나 인터페이스*(interface)*를 추상체로 쓸 수 있음

## 추상 클래스

- 내용이 정의되지 않고, **상세정의가 미정인 메서드**에 `abstract`를 붙여 추상 메서드로 지정
    - 추상 메서드를 포함하는 클래스도 `abstract` 를 붙여 추상 클래스가 된다
- 추상 클래스의 인스턴스화는 불가능 : **인스턴스화 하기 위해 구현이 필수**
    - 의도하지 않은 인스턴스화, 오버라이드 미구현의 문제는 발생하지 않음

## 인터페이스

- 추상 클래스들 중에서도, **추상 메서드만** 가진 것을 인터페이스로 취급
- 인터페이스에 선언된 메서드는 자동 `public abstract`, 필드는 자동 `public static final`
- 여러 인터페이스를 부모로 둘 수 있음 : **다중상속 가능**
- `implements <인터페이스>` 를 이용해 자식 클래스 정의