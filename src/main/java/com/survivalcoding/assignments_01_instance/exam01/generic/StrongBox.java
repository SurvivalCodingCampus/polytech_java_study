package com.survivalcoding.assignments_01_instance.exam01.generic;
//1.금고 클래스에 담을 인스턴스 타입은 미정(인스턴스 생성시 결정)
//2. 금고에 1개의 인스턴스만 담을 수 있음
//3. put() 메서드로 인스턴스를 저장하고 get() 메서드로 인스턴스를 얻을 수 있음
//4. get()으로 얻을 때는 별도의 타입 캐스팅을 사용하지 않아도 되도록 해야함

//StrongBox 클래스에 열쇠의 종류를 나타내는 열거형 KeyType을 정의하고, StrongBox 클래스를 수정
//열쇠의 종류를 생성자로 받아 저장하는 필드 추가
//각 형쇠는 사용횟수의 한도가 정해져 있다
//PADLOCK(1,024회), BUTTON(10,000회), DIAL(30,000회), FINGER(1,000,000회)

public class StrongBox<E> {
    public enum KeyType {
        PADLOCK(1024),
        BUTTON(10000),
        DIAL(30000),
        FINGER(1000000);

        private final int limit;

        KeyType(int limit) {
            this.limit = limit;
        }

        public int getLimit() {
            return limit;
        }
    }

    private E data;
    private KeyType keyType;
    private int usageCount = 0;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(E data) {
        this.data = data;
    }

    //금고에서 get() 메서드를 호출할 때마다 사용횟수를 카운트하고 각 열쇠의 사용횟수에 도달하기 전에는 null을 리턴.
    // 사용횟수에 도달하면 금고 안의 물건을 꺼낼 수 있다
    public E get() {
        usageCount++;
        if (usageCount >= keyType.getLimit()) {
            return this.data;
        }
        return null;
    }
}
