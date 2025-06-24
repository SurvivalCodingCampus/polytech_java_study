package com.survivalcoding.Asseting;

public abstract class Asset {

    private String name;

    Asset(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
