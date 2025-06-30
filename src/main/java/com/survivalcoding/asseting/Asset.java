package com.survivalcoding.asseting;

public abstract class Asset {

    private String name;

    public Asset(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
