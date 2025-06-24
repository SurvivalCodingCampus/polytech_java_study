#추상클래스(abstract class)

**추상클래스**

- 상속의 재료로 사용되는 클래스
- 상세 부분이 일부 미정인 클래스

<ins>추상 메소드를 가지려면 반드시 추상 클래스여야 한다.</ins>

public abstract class Character {
int hp;
public abstract void attack(Kinoko kinoko);

}

- public 앞에 abstract를 붙여주면 추상 클래스이다.
- 추상 메소드 같은 경우는 중괄호가 아닌 바로 ';'을 붙여준다.

- 상속 받는 클래스 같은 경우 오버라이드를 강제로 해주어야 한다.
- 상속 받을 클래스 또한 추상 클래스라면 오버라이드를 해주지 않아도 괜찮다.
- 인스턴스화가 금지되어 있다.

#인터페이스(interface)

**인터페이스 == 추상 메소드만 가지는 추상 클래스**

- 모든 메소드가 추상 메소드이다.
- 필드를 가지지 않는다.
- 인터페이스에 선언된 메소드는 자동적으로 public abstract.
- 필드는 public static final이 된다.

public interface Creature {
public abstract void run( );
public PI = 3.14; //public static final이 생략되어 있음
}

#인터페이스의 구현(implement)

public class Hero implements Attackable {
protected String name;
protected int hp;
}

- 같은 인터페이스를 구현한 클래스들은 공통 메소드를 구현하도록 강제.
- 어떤 클래스가 인터페이스를 구현하고 있다면 적어도 그 인터페이스에 정의된 메소드를 가지고 있음이 보증.

**여러 인터페이스를 구현할 수 있다.**
public class Hero implements Attackable, Moveable {

Attackable만 쓸 건지, Moveable만 쓸 건지 선택이 가능하다.
둘 다 쓰는 것도 물론 가능.

- 인터페이스간의 상속도 가능하다.

public interface Human extends Creature {

- 상속과 구현을 동시에 사용할 수 있다.

public class Hero extends character implements Attackable