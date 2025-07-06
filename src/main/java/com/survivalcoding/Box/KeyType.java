package com.survivalcoding.Box;

abstract public class KeyType implements getCnt {
    protected final int maxCnt;
    protected int currentCnt = 0;

    public KeyType(int maxCnt) {
        this.maxCnt = maxCnt;
    }

    public void use() {
        ++currentCnt;
    }

    public boolean unlock() {
        return currentCnt >= maxCnt;
    }

    public abstract int getUseCnt();
}
