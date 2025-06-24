# 추상클래스와 인터페이스

- 상속의 메서드를 작성하는 **개발자의 입장과 역할**
    - 다른 사람이 내 클래스를 부모 클래스로 받아서 사용 가능
    - 미래 개발자가 효율 좋게 안심하고 이용할 수 잇는 상속의 재료를 작성하는 것이 사명
    - 이를 위해 abstract와 interface가 있음

## 추상 클래스(abstract class)

- **상속의 재료**로 사용되는 클래스
- 상세 부분이 **일부 미정인 클래스 혹은 메서드**
- `public abstract void attack()` 의 형식
- **abstract 메서드가 하나**라도 있다면 클래스에 키워드를 `abstract` 추가해야됨
- abstract 메서드를 상속받으면 반드시 구현해야됨

    ```csharp
    @Override
    public void attack(){};
    ```

- **인스턴스화 불가**

**→ 상속의 재료**로서의 부모클래스를 개발하면, 예기치 않은 인스턴스화나 오버라이드의 미 구현의 걱정이 없음

### abstract 클래스 다이어그램

<img width="551" alt="Image" src="https://github.com/user-attachments/assets/158b9f32-2934-49a6-90d7-d24ae8294f5b" />

- abstract는 **기울임 꼴**로 보여줌
    - **다이어그램 그릴 때** class는 키워드만 붙이면 됨.
    - 메서드는 {abstract}로 추상임을 보여줌

## 인터페이스

- `추상 메서드`만 가지는 추상 클래스라고 봐도 됨.
- `implements`로 상속 받음
- 인터페이스 메서드는 모두 `public abstract`가 생략되었다고 보면 됨.

  <img width="641" alt="Image" src="https://github.com/user-attachments/assets/80f3ba6b-6630-42af-9919-909f6c951943" />

- 만약 멤버를 선언한다면 `public static final`이 생략된것임

  <img width="573" alt="Image" src="https://github.com/user-attachments/assets/dcad1b53-64c1-4f04-80a9-35b36c9ee23e" />

- 해당 메서드를 반드시 구현해야됨.

  <img width="383" alt="Image" src="https://github.com/user-attachments/assets/9cf92fe6-b922-45ea-84c1-515351d143f0" />

- 인터페이스를 구현한 클래스들은 **공통 메소드를 구현하도록 강제**
- 어떤 **클래스가 인터페이스를 구현하고 있다면**, 적어도 그 인터페이스에 **정의된 메소드를 가지고 있다는 것이 보증**
- 다중 구현 가능
    - `public class Hero implements Attackable, Moveable`
- 구현과 상속 동시에 가능

  <img width="436" alt="Image" src="https://github.com/user-attachments/assets/86631927-630c-4cf7-92cf-5facb9abf4c9" />

- 인터페이스를 먼저 구상하고 안되면 추상 클래스로 구현함
- 클래스 다이어그램에서의 표현

 <img width="92" alt="Image" src="https://github.com/user-attachments/assets/1d2dd976-dc49-4cc5-87cc-90f4696ef5a1" />