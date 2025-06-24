package com.survivalcoding.Asset;

public class Patent extends IntangibleAsset {
    private String expireDate;

    public Patent(String owner, String name, int price, String expireDate) {
        super(owner, name, price);
        setExpireDate(expireDate);
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
