package com.survivalcoding.Box;

public class DIAL extends KeyType {
    public DIAL() {
        super(30000);
    }

    public int getUseCnt() {
        return currentCnt;
    }
}
