#상속(inheritance)

이전에 만든 클래스와 닮았지만 일부 다른 클래스를 만들 필요가 있을 경우.
**public class SuperHero extends Hero**

- SuperHero : 자식 클래스
- Hero : 부모 클래스

<ins>부모 클래스로 부터 상속 받았음을 표현.</ins>

**오버라이드(override)**
@Override //주석 역할

<ins>'재정의'</ins>

부모 클래스로 부터 상속 받아 그의 기능을 확장한다는 느낌이다.

**final이 붙은 클래스는 상속이 금지다.**

**부모 클래스의 생성자가 무조건 호출되어야 한다.**
- 디폴트 생성자가 있어야만 에러가 뜨지 않는다.
- 생성자를 통해 부모 클래스 상속 받았음을 알려주는 역할.

public class SuperHero extends Hero{

public SuperHero(string name, int hp){ //생성자
super(name, hp);
}

//
super(name, hp);
super 키워드는 Hero 부모 클래스를 가르키는 포인터 역할


**올바른 상속**
"is-a 원칙" 이라고 하는 규칙에 따른 상태

ex)
SuperHero is a Hero가 말이 되면 올바른 상속이라 할 수 있다.

**잘못된 상속**
- 클래스를 확장할 시 현실세계와 모순이 발생
- 객체지향의 특징 중 "다형성"을 쓸 수 없게 됨.



결론

자식 클래스일수록 <ins>구체화</ins> 되고
부모 클래스일수록 <ins>추상적</ins>인 것으로 일반화



번외)
자바 줄 정리 command+L
해당 문자 사용 위치 command+B