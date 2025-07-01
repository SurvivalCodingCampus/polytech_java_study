package com.survivalcoding.generic;

public class StrongBox<E> {
    private E instance;
    private int useKeyCount = 0;
    private int keyCount;
    private static final int PADLOCK = 1024;
    private static final int BUTTON = 10000;
    private static final int DIAL = 30000;
    private static final int FINGER = 1000000;

    private final KeyType key;

    public StrongBox(E instance, String key) {
        put(instance);
        this.key = KeyType.valueOf(key);
        switch (this.key) {
            case PADLOCK:
                setKeyCount(getPadlock());
                break;
            case BUTTON:
                setKeyCount(getButton());
                break;
            case DIAL:
                setKeyCount(getDial());
                break;
            case FINGER:
                setKeyCount(getFinger());
                break;
            default:
                throw new IllegalArgumentException("존재하지 않는 KeyType 입니다.");
        }
    }

    public E getInstance() {
        if (getUseKeyCount() <= getKeyCount()) {
            setUseKeyCount(getUseKeyCount() + 1);
            return null;
        } else return instance;
    }

    private void put(E instance) {
        this.instance = instance;
    }

    public int getUseKeyCount() {
        return useKeyCount;
    }

    private void setUseKeyCount(int useKeyCount) {
        this.useKeyCount = useKeyCount;
    }

    public int getPadlock() {
        return PADLOCK;
    }

    public int getButton() {
        return BUTTON;
    }

    public int getDial() {
        return DIAL;
    }

    public int getFinger() {
        return FINGER;
    }

    public KeyType getKey() {
        return this.key;
    }

    public int getKeyCount() {
        return keyCount;
    }

    private void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }
}
