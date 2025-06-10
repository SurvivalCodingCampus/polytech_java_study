## 1. JDK(Java Development Kit)
- javac: 자바 소스코드(.java)를 바이트코드(.class)로 바꾸는 컴ㅁ파일러

## 2. JVM(Java Virtual Machine)
- 자바 바이트코드를 실행하는 가상 컴퓨터
- OS가 실행하지 않고 실제로 실행시키는 것은 이 JVM

### .class & 바이트코드
- .java를 javac로 컴파일하면 .class 파일이 만들어짐
- JVM이 이해할 수 있는 중간 언어
- CPU나 OS에 직접 의존하지 않고 JVM에 맞춰저 생성되기에 시스템에 상관없이 항상 동일한 바이트코드로 컴파일됨
  - 바이트코드 + JVM
    - 운영체제별로 각기 다른 JVM 구현체가 제공되지만,
    - 바이트코드는 항상 동일하게 컴파일이 됨