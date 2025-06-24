package com.survivalcoding.Asseting;

public abstract class IntangibleAsset extends Asset {
    private String smell;
    IntangibleAsset(String patent, String name, String smell){
        super(name);
        setSmell(smell);
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
