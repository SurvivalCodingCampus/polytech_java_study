## 7차시 다형성

- **정의**: 함수를 **여러가지의 형태**로 다룰 수 있음
    - 부모와 자식의 인스턴스를 동일시하여, 부모 클래스 타입의 배열에 담을 수 있다

    - 동일시 취급 해도, 각각의 인스턴스는 각 클래스의 정의를 따르고 다른 동작을 한다.
- `Drawable` Interface가 있을 경우

```csharp
final Drawable element = new House("서울", 100, Color.WHITE);

//상속받은 Inferface를 사용해 하나로 묶어서 담을 수 있음
final List<Drawable> elements = new ArrayList<>();
elements.add(new Dog("dog",3));
elements.add(new House("서울"));
elements.add(new Tree(5.0));
```

- 부모로 묶어서 호출할 땐, `런타임` 시에 타입이 결정됨

    ```csharp
    final Drawable d =elements[i];
    d.draw();
    ```

    - `i`에 해당하는 타입의 `draw`가 호출됨

### 다형성을 활용

**상자의 타입** 과 **내용의 타입** 의 역할

- 어떤 멤버를 이용할 수 있는가는 상자의 타입(부모)이 결정
- 멤버가 어떻게 움직이는지는 내용(자식)의 타입이 결정
- **선언은 상위 개념**으로 **인스턴스 생성은 하위 개념**으로 해야됨.
- 추상적인 선언 = 상세 선언으로 인스턴스화

    ```csharp
    Character charac = new Hero("홍길동",20);
    ```

### 다형성을 활용 못한 코드

- 모든 클래스에 대해 함수를 호출함(할게 많다)

    <img width="430" alt="Image" src="https://github.com/user-attachments/assets/85de6b32-b7b4-4f95-9117-4794c5892e23" />

- 다형성을 사용하여 간편하게 함
- **다형성의 메리트:** 동일한 타입으로 취급할 수 있음

    <img width="482" alt="Image" src="https://github.com/user-attachments/assets/be83c9e2-6878-4229-8d0a-b52a900f702b" />

- `attack()` 을 모든 타입에 대해 해줘야됨(100개라면 100개 다)

  <img width="430" alt="Image" src="https://github.com/user-attachments/assets/a43a0bca-f6bc-490a-8f10-e25cc16223c9" />

- 다형성 활용
- 상위 클래스로 매개변수를 받음

    <img width="652" alt="Image" src="https://github.com/user-attachments/assets/e0dfb7ae-d1e2-4126-8107-b8e022409b65" />

- 하나로 묶어서 동작시키기

  <img width="382" alt="Image" src="https://github.com/user-attachments/assets/f7d29958-9164-4330-b28c-d94538d31208" />

- 캐스트 연산을 이용하면 강제 대입 가능(다운 캐스트)

  <img width="477" alt="Image" src="https://github.com/user-attachments/assets/cf6c4663-b41e-4cbc-8e1a-f7e10eafb6a4" />

- 부정 대입이 발생할 시 `ClassCastException` 발생

## 메서드가 없는 인터페이스

- 기능이 없는 Interface도 있음
    - 단순 마커용(그룹핑)으로만 만들 때도 있음
    - ex: String에는 `Serializable` 가 있음.

    <img width="249" alt="Image" src="https://github.com/user-attachments/assets/f2a1054f-8eba-4515-a170-b2f59c37f165" />