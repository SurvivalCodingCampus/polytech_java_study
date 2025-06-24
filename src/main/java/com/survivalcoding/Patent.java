package com.survivalcoding;

import java.time.LocalDate;

public class Patent extends IntangibleAsset{
    private LocalDate expiryDate;

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        if (expiryDate == null) throw new IllegalArgumentException("Date when will be expired is needed");
        this.expiryDate = expiryDate;
    }
}
