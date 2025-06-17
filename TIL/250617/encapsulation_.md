# 캡슐화(encapsulation)

- 개발자의 잘못된 접근에 대한 제어 방법을 제공
- 현실세계와 동일하게 프로그래밍 하려는 제어 방법

클래스를 사용해서 인스턴스를 이용 현실세계를 객체 지향 프로그램으로 자유롭게 개발 가능
** 그러나 휴먼 에러가 발생. **


# 접근지정자(access modifier)

- private -자기 자신의 클래스
- public - 모든 클래스
- protected - 상속 받은 자식 클래스랑 자기 클래스까지


<멤버에 관한 엑세스 지정의 정석>

필드는 전부 private
메소드는 전부 public


<클래스에 관한 엑세스 지정의 정석>

클래스는 보통 public



읽을 수는 있게, 수정은 못하게
# getter / setter


 - getter 읽기 전용을 구현할 때 사용
 - setter 쓰기 전용을 구현할 때 사용

  모든 필드를 private로 지정해 다른 클래스의 접근을 막고
  메소드를 통해서 접근하도록 해줌.


마우스 우클릭 시 generate가 뜨는데 이후 getter/setter 자동 생성이 가능하다.




public void setName(String name) {
        this.name = name;

        if(name == null){
            throw new IllegalArgumentException("지팡이의 이름은 null일 수 없습니다.");
        }
    }


 throw new IllegalArgumentException를 통해 잘못된 입력을 했을 시 알림을 보낸다.

     @Test
     @DisplayName("마법사와 지팡이의 이름은 null일 수 없다")
     void Wand_Wizard_tests2(){

         //given(준비)
         Wand wand = new Wand(null, 0);
         Wizard wizard = new Wizard(null, 0,0);

         //tnen
         assertThrows(IllegalArgumentException.class, ()->{
             wand.setName(null);
         });

         assertThrows(IllegalArgumentException.class, ()->{
             wizard.setName(null);
         });
     }

     테스트 결과가 초록색으로 나와야 잘못 입력했음을 확인.


# UML

~ : protected
+ : public
- : private

시스템의 구조, 관계 등을 시각적으로 표현하기 위한 '통합 모델링 언어'.


     