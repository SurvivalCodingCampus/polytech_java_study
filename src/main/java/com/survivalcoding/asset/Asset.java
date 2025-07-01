package com.survivalcoding.asset;

public abstract class Asset {
    private String name;

    protected Asset(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        this.name = name;
    }
}
