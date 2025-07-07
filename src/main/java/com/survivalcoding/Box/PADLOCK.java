package com.survivalcoding.Box;

public class PADLOCK extends KeyType {
    public PADLOCK() {
        super(1024);
    }

    public int getUseCnt() {
        return currentCnt;
    }
}
