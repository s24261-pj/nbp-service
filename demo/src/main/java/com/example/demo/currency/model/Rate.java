package com.example.demo.currency.model;

public class Rate {
    public String no;
    public String effectiveDate;
    public float mid;

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public float getMid() {
        return mid;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setMid(float mid) {
        this.mid = mid;
    }
}
