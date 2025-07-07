package com.survivalcoding.asset;

import java.time.LocalDate;

public class Patent extends IntangibleAsset {
    private LocalDate expiryDate;

    public boolean isValid() {
        if (expiryDate == null) return false;
        return !expiryDate.isBefore(LocalDate.now());
    }

    public Patent(String name, LocalDate acquiredDate, LocalDate expiryDate) {
        super(name, acquiredDate);
        setExpiryDate(expiryDate);
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        if (expiryDate == null) throw new IllegalArgumentException("Date when will be expired is needed");
        if (expiryDate.isBefore(super.getAcquiredDate()))
            throw new IllegalArgumentException("Expiry date cannot get ahead of its acquired date");
        this.expiryDate = expiryDate;
    }
}
