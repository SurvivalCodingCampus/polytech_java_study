# 제10장 캡슐화 (Encapsulation)

## 1. 캡슐화 개요

캡슐화는 객체 지향 프로그래밍에서 실수로 속성을 덮어쓰거나 잘못된 조작을 하는 휴먼 에러(human error)를 방지하기 위한 개념입니다.

### 문제점 예시
- 여관 클래스에서 Hero의 hp를 -100으로 설정하는 오류
- 왕 클래스에서 Hero의 die() 메서드를 직접 호출하는 문제

## 2. 접근 지정자 (Access Modifier)

### 멤버에 대한 액세스 제어

| 제한 범위 | 명칭 | 설정 방법 | 접근 가능한 범위 |
|----------|------|----------|-----------------|
| 제한이 엄격 | private | `private` | 자기 자신의 클래스 |
| | package private (default) | (아무것도 안 씀) | 자신과 같은 패키지에 소속된 클래스 |
| | protected | `protected` | 자신과 같은 패키지에 소속되던지, 자신을 상속받은 자식 클래스 |
| 제한이 느슨 | public | `public` | 모든 클래스 |

### 클래스에 대한 액세스 제어

| 이름 | 기술 방법 | 접근 가능한 범위 | 제한 |
|------|----------|-----------------|------|
| package private | (아무것도 쓰지 않음) | 자신과 같은 패키지에 소속된 클래스 | 엄격 |
| public | `public` | 모든 클래스 | 느슨 |

### 비 public 클래스의 특징
1. 클래스의 이름은 소스 파일명과 달라도 됨
2. 1개의 소스 파일에 여러 개 선언해도 됨

## 3. 캡슐화의 정석

### 멤버에 관한 액세스 지정의 정석
- **필드는 전부 private**
- **메소드는 전부 public**

### 클래스에 대한 액세스 지정의 정석
- **별다른 이유가 없으면 public**

## 4. Getter와 Setter

메소드를 경유한 필드 조작 방법

- **getter**: 읽기 전용을 구현할 때 사용
- **setter**: 쓰기 전용을 구현할 때 사용

모든 필드를 private로 지정해 다른 클래스로부터 접근이 안 되도록 막고, 메소드를 통해서 접근하도록 클래스를 설계하는 것이 기본입니다.

### 예시 코드
```java
public class Hero {
    private String name;
    
    // getter 메소드
    public String getName() {
        return name;
    }
    
    // setter 메소드
    public void setName(String name) {
        this.name = name;
    }
}
```

## 5. Getter/Setter의 메리트

1. **Read Only, Write Only 필드의 실현**
2. **필드의 이름 등, 클래스의 내부 설계를 자유롭게 변경 가능**
3. **필드로의 액세스를 검사 가능**

### 값의 타당성 검사 예시
```java
public void setName(String name) {
    if (name == null) {
        throw new IllegalArgumentException("이름은 null이 아니어야 함");
    }
    if (name.length() <= 1) {
        throw new IllegalArgumentException("이름이 너무 짧음");
    }
    if (name.length() >= 8) {
        throw new IllegalArgumentException("이름이 너무 김");
    }
    this.name = name;
}
```

## 6. 예외 테스트

특정 테스트가 예외가 발생되어야 하는 것을 테스트할 때:
```java
assertThrows(IllegalArgumentException.class, () -> {
    cleric.pray(5);
});
```

## 7. 캡슐화에 대한 생각

- **개발자의 잘못된 접근에 대한 제어 방법을 제공**
- **현실세계와 동일하게 프로그래밍 하려는 제어 방법**

## 8. 정리

### 캡슐화의 개요
- 캡슐화를 하여 멤버나 클래스로의 접근을 제어할 수 있음
- 특히, 필드에 "현실세계에서 있을 수 없는 값"이 들어가지 않도록 제어

### 멤버에 대한 접근 지정
- `private` 지정된 멤버는, 동일 클래스내에서만 접근 가능
- `package private` (아무것도 지정 안된) 지정된 멤버는, 동일 패키지내의 클래스에서만 접근 가능
- `public` 지정된 멤버는, 모든 클래스에서 접근 가능

### 클래스에 대한 접근 지정
- `package private` (연산자 없음)으로 선언된 클래스는, 동일 패키지내의 클래스에서만 접근 가능
- `public` 지정된 클래스는, 모든 클래스에서 접근 가능

### 캡슐화의 정석
- 클래스는 `public`, 메소드는 `public`, 필드는 `private`로 지정
- 필드에 접근하기 위한 메소드로서 getter나 setter를 준비
- setter 내부에서는 인수의 타당성 검사를 수행

