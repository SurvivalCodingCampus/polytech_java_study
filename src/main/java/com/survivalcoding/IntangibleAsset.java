package com.survivalcoding;

public abstract class IntangibleAsset {
    private String patent;

    IntangibleAsset(String patent){
        setPatent(patent);
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }
}
