### 캡슐화란?

- 맴버나 클래스로 접근을 제어하는 것
- 특히, 현실세계에서 있을 수 없는 값이 들어가지 않도록 제어
    - 체력이 음수 값이 된다거나, 치료했는데 체력이 닳는다거나 등등

```csharp
public class Inn{
  void checkIn(Hero hero){
    hero.hp = -100;
  }
}
```

- 얼핏보면 Inn잘못이지만, **Hero의 잘못**도 있음
- hp에 직접적인 접근을 제한하거나, -100이 들어가면 안되게 해야됨

```java
public class Hero {
    private int hp;
    String name;
    Sword sword;
    static int money;

    void sleep() {
        this.hp = 100;
        System.out.println(this.name);
    }
}
```

### 접근 지정자

| 제한 범위     | 명칭              | 설정 방법                   | 접근 가능한 범위                                  |
|-----------|-----------------|-------------------------|--------------------------------------------|
| 제한이 엄격    | private         | private                 | 자기 자신의 클래스                                 |
|           | package private 
 (default) | (아무것도 안 씀)      | 자신과 같은 **패키지에 소속**된 클래스 |
|           | protected       | protected               | 자신과 같은 **패키지에 소속**되던지, 자신을 **상속받은 자식** 클래스 |
| 제한이 느슨    | public          | public                  | 모든 클래스                                     |

- 멤버 엑세서 지정 정석
    - 필드는 전부 `private`
    - 메소드는 전부 `public`
    - 클래스는 이유가 없다면 `public`
- 접근이 제한된 필드에 접근하기 위해 `getter`와 `setter`를 생성
    - setter 내부에서는 해당 인수로 받은 값이 타당한지를 판별
    - Read Only, Write Only 필드의 실현
    - 이름은 해당 변수와 다르게 변경 가능하지만 **권장 X**
- setter안에서의 값 타당성 검사
    - setter안에서의 값이 이상할 때 임의로 **값을 변경하면 안됨**
  ```csharp
  public void setCurrentMp(int currentMp) {
        if (currentMp < 0){
            currentMp = 0;
        }
                  
        if (currentMp > MAX_MP)
            currentMp = MAX_MP;
            
        this.currentMp = currentMp;
  }
  ```

- 다음을 사용:  `throw new IllegalArgumentException(string);`

```csharp
public void setCurrentMp(int currentMp) {
        if (currentMp < 0)
            throw new IllegalArgumentException("Current mp cannot be negative");
        if (currentMp > MAX_MP)
            throw new IllegalArgumentException("Current mp cannot be greater than max mp");
        this.currentMp = currentMp;
    }
```

- 테스트 코드에서 예외 발생 테스트

    ```csharp
    @Test
        @DisplayName("생성자 테스트1")
        void ExceptionTest() {
            //given and when
            Cleric cleric = new Cleric("깃허브");
            //cleric.setCurrentHp(-1);
            // assert로 표현하기
            assertThrows(IllegalArgumentException.class, () -> {
                cleric.setCurrentHp(-1);
            });
        }
    ```

    - 위 코드를 실행한다면 오히려 테스트가 통과됨.
        - throw가 발생해야 테스트 통과되는 것임.

### UML(Unified Modeling Language)

- 복잡한 시스템을 시각화하고 구현하는 표준화 방법

  <img width="434" alt="Image" src="https://github.com/user-attachments/assets/ef090a6b-6254-47e3-9119-42e99157ab4b" />

`+`: public, `~`: protected, `-`: private

- Intellij에서 다이어그램 그려주는 플러그인 있음

  <img width="442" alt="Image" src="https://github.com/user-attachments/assets/de2c02a0-eac9-44d6-ae51-27cbddf42193" />

    - **PlantUML integration**
- 패키지 폴더에서 우클릭→ new → PlantUML file

  <img width="575" alt="Image" src="https://github.com/user-attachments/assets/e8867acb-dc36-4bef-8ac8-9f8adad985e2" />  

- 위 그림에 대한 코드
    - scale n으로 크기 조절 가능

```csharp
@startuml
'https://plantuml.com/class-diagram

class Cleric{
    + String name
    - static final int MAX_HP
    - static final int MAX_MP
    - int currentHp
    - int currentMp

    + void selfAid()
    + void pray(int time)

}
class Hero{
    + String name
    - int hp;

    + void attack(Kinoko enemy)
    + void bye()
    - void die()
}

@enduml
```