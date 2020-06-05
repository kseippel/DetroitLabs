package com.example.springboot.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TotalPrice {

    private BigDecimal total;

    public TotalPrice(Double total) {
        this.total = BigDecimal.valueOf(total).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
