#제네릭(Generic)

- 자료형을 일반화
- 클래스나 메소드를 정의할 때 타입을 나중에 원하는 형태로 정의 가능하도록 하는 것.
- 타입 안정성을 보장해준다.
- 형변환을 줄일 수 있다.
- 재사용성을 높일 수 있다.

public class StrongBox<E> {
private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        }
    }

<E>라는 타입을 지정해주고, E라는 데이터를 넣을 수 있도록 한다.

| 타입  | 설명      | 
|:----|:--------|
| <T> | Type    |
| <E> | Element | 
| <K> | Key     | 
| <V> | Value   | 
| <N> | Number  | 

해당 타입들이 자주 쓰인다.

이후 테스트 코드로 넘어가보자.

StrongBox**<String>** strongBox = new StrongBox<>();
테스트 코드에서 타입을 지정해 준 것을 알 수 있다.

| 타입  | 코드      | 
|:----|:--------|
| 정수  | Integer |
| 실수  | Double  | 
| 문자열 | String  | 
| 클래스 | 클래스명    | 

#Enum(열거형)

- 정해둔 값만 넣어둘 수 있는 타입

  public enum KeyType {
  PADLOCK, //0
  BUTTON, //1
  DIAL, //2
  FINGER //3
  }

순서대로 0~3의 숫자가 부여된다.

