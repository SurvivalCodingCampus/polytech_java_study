# 상속

## 확장 extends

클래스는 **상속**을 통해 기존 클래스의 성질을 가지면서 그와 동시에 기능이 확장된 클래스를 만들 수 있음  
이 때, 확장된 클래스의 원본이 되는 클래스는 **슈퍼클래스**Superclass 라고 부름

클래스의 상속은 다음과 같이 함:

```Java
public class Hero {
    private String name;
}

// class 클래스이름 extends 슈퍼클래스(확장할 대상)이름
public class SuperHero extends Hero {
    private String powerName;
}
```

## 확장된 클래스의 생성자

- 확장된 클래스는 슈퍼클래스가 먼저 생성되어야 함을 전제로 함
- 확장하면서 생성자는 물려받지 못함
- 확장된 클래스에 생성자를 정의해야 함
    - `super()` 형태로 슈퍼클래스의 생성자를 호출
    - 생성자의 선두에 `super()`가 없다면 암묵적으로 `super();`가 추가

## 다중상속은 금지

'일반적으로' 하나의 (슈퍼)클래스가 여러 클래스로 상속시키는 행위, '다중상속' 은 불가능

## 상속을 막아야만 한다면 final

- `final` 을 붙인 클래스는 더 이상 상속되지 않음
- `final` 을 붙인 메서드는 Override 되지 않음

## 확장된 클래스의 인스턴스
- 인스턴스 내부에 부모클래스의 인스턴스를 가지는 구조
- 더 외측의 인스턴스 메서드가 우선적으로 동작
  - 내측 인스턴스의 멤버에 접근하기 위해 `super` 를 사용

## Override

Override : 슈퍼클래스로부터 받은 동일한 이름의 기능을 새로이 정의하는 것

- 아래의 예시에서, Hero 인스턴스가 실행하는 `run()` 과 SuperHero 인스턴스가 실행하는 `run()`은 다른 기능을 가짐
- ❗️SuperHero 인스턴스가 `super.run()` 을 실행하는 것으로 **슈퍼클래스인 Hero**의 `run()`을 실행할 수 있다.

```Java
public class Hero {
    private String name;

    public void run() {
        // RUN!
    }
}

// class 클래스이름 extends 슈퍼클래스(확장할 대상)이름
public class SuperHero extends Hero {
    private String powerName;

    // 생성자
    public SuperHero() {
        super();
    }

    @Override
    public void run() {
        // RUN MORE!
    }
}
```

## 잘못된 상속을 하지 말 것

- 클래스를 확장할 때 현실세계와의 모순이 생김
    - *"클래스 is a 슈퍼클래스"* 의 원칙을 잊지 말기 *(자식 클래스 is a 부모 클래스)*
    - ❗모순이 개발에 의도된 것이라면 예외, 개발목적이 최우선
  ```Java
    // 물약을 무기로 쓰는 게임이라면 문제가 없음
    public class Potion extends Weapon {
        // Some codes
    }
  ```
- 객체 지향의 3대 특징 중 1가지인 '다형성' 을 이용할 수 없게 됨

## 상속할수록 점점 구체화

상속해 줄 클래스는 핵심적, 범용적 및 추상적으로 정의한 뒤, 클래스가 상속을 거듭함에 따라 기능들이 점점 구체화