package com.luyenlaptrinh.baitapspringboot.entities;

public class HangHoa {
    private String name;
    private Integer amount;

    private String price;

    public HangHoa() {
    }

    public HangHoa(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public HangHoa(String name, Integer amount, String price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
