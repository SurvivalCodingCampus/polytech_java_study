package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WandTest {
    @Test
    @DisplayName("이름이 3문자 이상")
    public void setName(String name)
    {
        if(name == null)
        {
            throw new IllegalArgumentException("이름이 null이 아니어야함");
        }
        if(name.length() < 3)
        {
            throw new IllegalArgumentException("이름이 3문자 이상이어야함");
        }
        this.name = name;
    }

    @Test
    public void setPower(double power)
    {
        if(power < 0.5)
        {
            throw new IllegalArgumentException("마력이 너무 작음");
        }
        if(power > 100)
        {
            throw new IllegalArgumentException("마력이 너무 큼");
        }
        this.power = power;
    }

    @Test
    public void getMp(int Mp)
    {
        if(Mp < 0)
        {
            throw new IllegalArgumentException("Mp는 0이상");
        }
        this.Mp = Mp;
    }
}
