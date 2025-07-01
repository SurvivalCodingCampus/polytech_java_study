package com.survivalcoding;

public enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);


    private final int usageLimit;

    // 생성자
    KeyType(int usageLimit) {
        this.usageLimit = usageLimit;
    }

    // 사용 횟수 제한을 반환하는 메서드
    public int getUsageLimit() {
        return usageLimit;
    }
}
