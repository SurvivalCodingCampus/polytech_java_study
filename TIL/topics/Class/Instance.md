# 9차시 인스턴스 기본조작

- 모든 클래스는 `Object` 클래스의 **메서드**를 가짐
- Object 타입 변수에는 모든 인스턴스를 대입 가능(**다형성**)

### Object 클래스의 대표 메서드

- toString() : 문자열 표현을 얻음
- equals() : 비교
- hashCode() : 해시값을 얻음

### Set, Map의 동작 원리

- Set, Map 계열은 요소를 검색할 때 `equals()` 보다 비용이 싼 `hashCode()` 비교를 사용
- `List`는 순차 검색이라 느림
- 특징
    1. 모든 객체는 **해시값**을 가진다
    2. **동일한 객체는 항상 같은 해시값**을 가진다.
    3. 하지만, **같은 해시값이라고 항상 동일한 객체는 아니다.**

## `hashCode()` 목적

- 객체를 해시 기반 컬렉션(HashSet, HashMap 등)에 저장할 때, 객체의 고유 식별자 역할(예: 주민번호)
- `equals()`가 같으면 `hashCode()`도 같아야 해서, 두 메서드는 반드시 일관성 있게 구현해야 함
- 타이틀과 날짜가 같다면 동일 객체로 판단

```csharp
 @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return this.title.equals(book.title) && this.publishDate.equals(book.publishDate);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + publishDate.hashCode();
        return result;
    }
```

## 정렬이 수행될 객체의 기준 정하기

- Collections.sort() 메서드의 선언은 다음과 같음

    ```csharp
    public static <T extneds Comparable<? super T> void sort(List<T> list)
    ```

- 정렬 규칙을 정하기 위한 `Comparable` 인터페이스

    ```csharp
    public interface Comparable<T> {
    	public int compareTo(T o);
    }
    ```

- 정렬 대상은 반드시 `Comparable`를 **구현해**야됨

    ```csharp
    public class Account implements Comparable<Account>
    {
    	int number;
    	@Override
    	public int compareTo(Account obj) {
    		if(this.number < obj.number) {
    			return -1;
    		}
    		if(this.number > obj.number) {
    			return 1;
    		}
    		return 0;
    	}
    }
    ```

- **익명 클래스** 사용 방법(`Comparator`)

    ```csharp
    Collections.sort(numbers, new Comparator<Integer>({
    	@Override
    	public int compareTo(Integer o1, Integer o2){
    		return o1 - o2;
    	}
    });
    System.out.println(numbers);
    ```

- 31을 곱하는 이유:
    - 소수를 곱하여 코드 분포를 균일하게 하여 충돌을 줄임.
    - 31은 컴퓨터 연산에 최적화

## 얕은 복사(**Shallow Copy**)

- 객체 자체는 **새로 생성되지만**, 객체 내의 참조 타입 필드(다른 객체에 대한 참조)는 **원본과 동일한 객체를 참조**
- 즉, 중첩된 객체는 복사되지 않고 **주소만 복사**
- **원본 객체의 참조 타입 필드를 변경**하면 복사본의 **해당 필드도 함께 변경**

```csharp
Hero h1 = new Hero("홍길동");
Hero h2 = h1;

h2 == h1? -> true;
```

- 한마디로 지갑 하나를 공유하여 두명의 사람이 같이 사용

### 깊은 복사(Deep Copy)

- 객체 자체뿐만 아니라, 객체 내의 모든 참조 타입 필드(중첩된 객체들)까지도 재귀적으로 완전히 새로 **생성하여 복사**
- 원본 객체와 복사본 객체는 **완전히 독립적**
- 한쪽을 변경해도 다른 쪽에는 영향을 주지 않음

```csharp
public Book clone() {
        Book book = new Book(this.title, this.publishDate, this.comment);
        return book;
}
```

- 지갑을 공유하지 않음
