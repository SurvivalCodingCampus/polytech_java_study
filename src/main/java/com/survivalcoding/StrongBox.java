package com.survivalcoding;

enum KeyType {
    PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);

    private final int limit;

    KeyType(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}

// 금고 클래스
public class StrongBox<B> {
    private B item;
    private final KeyType keyType;
    private int cnt;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.cnt = 0;
    }

    public void put(B item) {
        this.item = item;
        this.cnt = 0;
    }

    //특정 키를 get하면 호출 회수 증가
    public B get() {
        cnt++;
        if (cnt >= keyType.getLimit()) {
            return item;
        } else {
            return null;
        }
    }
}
