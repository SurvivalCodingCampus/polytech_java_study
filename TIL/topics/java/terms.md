## 단어와 용어들

### static : 클래스 변수나 메서드를 인스턴스가 아닌 클래스 단위로 공유할 때 사용하는 키워드  
1. **필드**에 `static` 키워드를 사용해 해당 필드를 같은 클래스가 공유
    - 이 `static` 필드는 불러올 때 참조형으로 호출됨
    - 클래스 이름을 이용해 `static` 필드에 접근하기
      ```Java
      Cleric sally = new Cleric("Whitemane", 1050);
      System.out.println(Cleric.money); // 인스턴스 자원이 아닌, 공유 자원에 접근
      ```
    - 인스턴스 없이도 접근이 가능
      ```Java
      System.out.println(Cleric.money); // 공유 자원에 접근
      ```
2. **메서드**에 `static` 키워드를 사용해 해당 메서드를 같은 클래스에서 호출
   ```Java
   public class Cleric{
     static int money = 5000;
     String name;

     static void setRandomMoney(){
       money = new Random.nextInt(5001);
       System.out.println(Cleric.money);
     }
   }
   ```
    - `static` 메서드 안에서는 `static` 한 멤버에만 접근이 가능
      ```Java
      public class Cleric{
        static int money = 5000;
        String name;
 
        static void setRandomMoney(){
          money = new Random.nextInt(5001);
          System.out.println(this.money); // 오류, 인스턴스 객체에 접근하려고 함
        }
      }
      ```

### Class Main
Java 애플리케이션의 진입점(entry point)인 `public static void main(String[] args)` 메서드를 포함하는 클래스  

### System.out.Println()
≒ Console.WriteLine() in C\# 
