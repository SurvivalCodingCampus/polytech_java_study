package com.survivalcoding.generic;

public class StrongBox<E> {
    private E data; // 저장할 데이터
    private final KeyType keyType; // 열쇠 종류
    private int useCount;// 현재까지의 열쇠 사용 횟수 >> 외부 접근 필요 없으니 getter/setter 필요 x
    

    // 4-2-02) 생성자 : StrongBox를 만들 때 열쇠의 종류를 생성자로 받아 저장하는 필드 추가
    public StrongBox(KeyType keyType) {
        this.keyType = keyType; // 전달받은 열쇠 종류 저장
        this.useCount = 0; // 초기 사용 횟수는 0

    }

    //데이터 저장 메서드
    public void put(E data) {
        this.data = data;

    }

    private int limit(KeyType keyType) {
        switch (keyType) {
            case PADLOCK:
                return 1024;
            case BUTTON:
                return 10000;
            case DIAL:
                return 30000;
            case FINGER:
                return 1000000;
            default:
                throw new IllegalArgumentException("Unknown key type: " + keyType);

        }
    }

    // 데이터를 꺼내는 메서드
    public E get() {
        useCount++; // get() 메서드 호출할 때마다 사용 횟수 카운드

        // 사용 횟수가 열쇠 한도를 넘었거나 넘으면 데이터 반환
        if (useCount > limit(keyType)) {
            return data;
        } else {
            return null;// 각 열쇠의 사용 횟수에 도달 전에는 null 값 리턴
        }

    }

    //현재 설정된 열쇠 종류 반환 메서드
    public KeyType getKeyType() {
        return keyType;
    }
}
