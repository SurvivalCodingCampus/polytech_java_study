## Java Basic Concepts

1. 철저히 '본인' 기준에 맞춰 Java 수업에서의 기본 개념 내용을 메모하였음

### Class and Instance

- 클래스 _(class)_ : 가상세계 용으로 구체화한 \*오브젝트, ~~붕어빵 틀~~
- 인스턴스 _(instance)_ : 클래스를 활용해 메모리 상에 만들어 낸 것, ~~붕어빵~~  
  `new`, `this`, ..

_\*오브젝트 _(object)_ : 현실 세계의 모든 객체_

### Why class? ≒ Why OOP?

#### "명확성은 안정성을 유도함"

1. 개발자가 이해하기 좋음 : 개발이 고도화될 수록 복잡해지는 구조를 class로 구분하여 명확하게 함
2. 성격에 따른 객체의 분리 : 각 객체가 사용하고 필요로 하는 기능만을 묶어서 구현해, 객체의 용도를 명확히 함

### Convention

- 클래스 _(class)_ : 첫 글자는 대문자 _(Pascal)_  
  `class Hero`, `public class Monster`
- 필드 _(field)_ : 두 번째 단어부터 맨 첫 글자는 대문자 _(Camel)_  
  `int Level`, `List<String> ItemList`, \*`final int flatDamageThunder`
- 메소드 _(method)_ : 두 번째 단어부터 맨 첫 글자는 대문자 _(Camel)_  
  `void attack(int dmg)`, `List<String> getItemList(object player)`

_\*final로 선언된 필드는 불변하는 상수(constant) 필드_

### class as 'Type'

- 클래스를 정의하면, 그 클래스를 **변수처럼 선언하고 사용**이 가능
- 클래스 변수는 그 클래스의 인스턴스를 담을 수 있음

### Using instances

- `new` 키워드를 사용하여 클래스로부터 인스턴스 생성
- `<변수 이름>.<필드 이름>`, `<변수 이름>.<메소드 이름()>`으로 인스턴스의 필드와 메소드를 이용