package com.survivalcoding;

public abstract class IntangibleAsset {
    private String patent;
    private String name;

    IntangibleAsset(String patent, String name){
        setPatent(patent);
        setName(name);
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
