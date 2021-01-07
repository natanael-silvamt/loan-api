package com.app.loan.model;

public class Modality {
    private String type;
    private Integer rate;

    public Modality(String type, Integer rate) {
        this.type = type;
        this.rate = rate;
    }

    public Modality() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
