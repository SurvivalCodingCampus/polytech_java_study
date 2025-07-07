public class StrongBox<T> {

    private T item;                    // 저장 아이템
    private final KeyType keyType;    // 잠금 방식
    private int Cost = 0;            // 시도 횟수

    // 잠금 방식 지정
    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    // 아이템 저장 [ Set() 대신 사용 ]
    public void put(T item) {
        this.item = item; // 새 아이템 저장
        this.Cost = 0; // 횟수 초기화
    }

    // 아이템 꺼내기
    public T get() {
        Cost++; // 코스트 상승
        if (Cost >= keyType.getUnlockT()) { // 누적 시도 횟수가 cost 높으면
            return item; // 값을 리턴, 열 수 있게 해줌
        } else {
            return null; // 아닐 경우는 null로 리턴
        }
    }

    // 잠금 해제 조건
    public int getUnlockT() {
        // get()의 호출이 몇번을 필요로 하는지 숫자로 변환
        return keyType.getUnlockT();
    }

    // 열거형 방식 활용
    public enum KeyType {
        PADLOCK(1024),
        BUTTON(10000),
        DIAL(30000),
        FINGER(1000000);

        private final int UnlockT;

        // Unlock 횟수를 함께 저장 하는 생성자
        KeyType(int unlockT) {
            this.UnlockT = unlockT;
        }

        // 외부에서 값을 꺼낼 수 있게 준비
        public int getUnlockT() {
            return UnlockT;
        }
    }
}
