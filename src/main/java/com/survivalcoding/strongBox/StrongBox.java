package com.survivalcoding.strongBox;

public class StrongBox<T> {
    private T content;
    private KeyType keyType;

    private int triedCount = 0;

    public StrongBox() {

    }

    public StrongBox(KeyType keyType) {
        setKeyType(keyType);
    }

    public StrongBox(T content, KeyType keyType) {
        put(content);
        setKeyType(keyType);
    }

    // getter setter
    // keyType
    public void setKeyType(KeyType keyType) {
        if (this.keyType == null) this.keyType = keyType;
    }

    public KeyType getKeyType() {
        return this.keyType;
    }

    // StrongBox's Content
    public void put(T content) {
        if (this.content == null) this.content = content;
    }

    public T get() {
        triedCount++;

        if (keyType == null || triedCount <= keyType.getThreshold()) {
            return null;
        }

        return this.content;
    }
}
