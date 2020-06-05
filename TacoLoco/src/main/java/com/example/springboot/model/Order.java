package com.example.springboot.model;

public class Order {

    private Integer veggieTaco;
    private Integer chickenTaco;
    private Integer beefTaco;
    private Integer chorizoTaco;

    public Order(Integer veggieTaco, Integer chickenTaco, Integer beefTaco, Integer chorizoTaco) {
        this.veggieTaco = veggieTaco;
        this.chickenTaco = chickenTaco;
        this.beefTaco = beefTaco;
        this.chorizoTaco = chorizoTaco;
    }

    public Integer getBeefTaco() {
        return beefTaco;
    }

    public Integer getChickenTaco() {
        return chickenTaco;
    }

    public Integer getChorizoTaco() {
        return chorizoTaco;
    }

    public Integer getVeggieTaco() {
        return veggieTaco;
    }

    public void setBeefTaco(Integer beefTaco) {
        this.beefTaco = beefTaco;
    }

    public void setChickenTaco(Integer chickenTaco) {
        this.chickenTaco = chickenTaco;
    }

    public void setChorizoTaco(Integer chorizoTaco) {
        this.chorizoTaco = chorizoTaco;
    }

    public void setVeggieTaco(Integer veggieTaco) {
        this.veggieTaco = veggieTaco;
    }
}
