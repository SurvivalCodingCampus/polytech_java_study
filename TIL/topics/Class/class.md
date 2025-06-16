# 클래스와 인스턴스
## 인스턴스 VS 오브젝트

- 둘의 개념은 다름
    - But 현업에서는 둘이 같은 의미로 사용될 수 있음.
- 오브젝트의 경우 실제 물체를 의미
- 인스턴스는 클래스를 활용해서 만든 것을 의미 (가상)

## 클래스

### 필드와 메소드

- 클래스에는 **속성**을 필드(변수)로, 동작을 **메소드**로 선언한다
-   ```final  ``` 이 붙은 필드는 상수 필드로서 값이 불변이다
-   ```this``` 는 자기 자신의 인스턴스를 표시하는 키워드

    ```java
    void selfAid(){
            if(currentMp < 5){
                // 스킬 못 쓴다고 하기
                return;
            }
    
            this.currentMp -= 5;
            this.currentHp  = maxHp;
        }
    ```


### 클래스 타입

- 클래스를 정의하면, 그 클래스 타입의 변수를 선언 할 수 있다

    ```java
    public class Cleric {
        String name;
        final int maxHp = 50;
    }
    ```

- 어떤 클래스 타입 변수는 그 클래스의 인스턴스를 담을 수 있다

### 인스턴스화

- new 키워드를 사용하여 클래스로부터 인스턴스를 생성

    ```java
    Cleric clericSelfAid = new Cleric();
    ```

- 어떤 클래스 타입 변수에 인스턴스가 담겨 있을 때 “변수명.필드명" 이나 “변수명.메소드명()” 으로 그 인스턴스의 필드나 메소드를 이용할 수 있다

    ```java
     Cleric clericSelfAid = new Cleric();
            //when(실행)
            clericSelfAid.selfAid();
            clericSelfAid.pray(3);
    ```


## 클래스 사용 이유?

- 역할 분담을 및 구조화

  → 메서드로 하면 안되나?

    - 메서드는 상태와 동작을 하나로 묶을 수 없음.
    - 하나의 변수를 여러 곳에서 사용하려고 하면 충돌과 혼란이 야기됨.
- 개발자가 이해하기에 더 좋음
    - 점점 복잡해지는 코드에 덜 헷갈림 (예 : 디자인 패턴)
- 절차지향형(c언어) 대신 객체지향을 왜 쓰는지?
    - 절차지향형이 더 빠르긴하지만 요즘의 컴퓨터 성능으로는 충분히 커버 가능
    - 최종적으로는 버그를 줄임
    - 현실과 코드 간 격차를 줄임

## 동적 vs 정적

- 동적 : 그때 그때 생성하는 것(변화함, new)
    - 다른 예시로는 변수의 타입이 런타임을 했을 때 정해짐(예 : Python, JS)
- 정적 : 생성하지 않거나 이미 생성되어 있는 것들 (예 : static)
    - 다른 예시로는 변수 타입이 컴파일 시 정해짐(예 : C++,Java)

## 과제

- 문제 하나 할때마다 커밋하기(잘게 쪼개서 하는 연습)

---

# Test 코드

## Test 코드 작성

- given > when > then 기법을 사용
    - given :  준비 (인스턴스 생성)
    - when : 실행 (실행하기 위한 함수 불러오기)
    - then : 검증 (assert를 활용하여 테스트하기)


- 테스트 코드 예시

```java
    @Test
    @DisplayName("기도하면 MP가 (시간 ~ 시간+2) 만큼 회복되고, 최대 MP를 초과하지 않는다.")
    void pray() {
        // given(준비)
        Cleric clericPray = new Cleric();

        //when
        clericPray.pray(3);

        //then
        assertEquals(10,clericPray.currentMp);
        clericPray.currentHp = 3;

        clericPray.pray(2);
        //then
        assertEquals(10,clericPray.currentMp);

    }
```

- 어노테이션

    | 어노테이션 | 설명 |
    | --- | --- |
    | `@Test` | 해당 메서드가 **JUnit 테스트**임을 명시 |
    | `@DisplayName("...")` | 테스트 이름을 직관적으로 보여주기 위한 어노테이션 |

