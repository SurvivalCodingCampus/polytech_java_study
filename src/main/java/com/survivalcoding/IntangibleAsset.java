package com.survivalcoding;

import java.time.LocalDate;

public abstract class IntangibleAsset extends Asset{
    private LocalDate acquiredDate;

    public LocalDate getAcquiredDate() {
        return acquiredDate;
    }

    public void setAcquiredDate(LocalDate acquiredDate) {
        if (acquiredDate == null) throw new IllegalArgumentException("Date when acquired is needed");
        this.acquiredDate = acquiredDate;
    }
}
