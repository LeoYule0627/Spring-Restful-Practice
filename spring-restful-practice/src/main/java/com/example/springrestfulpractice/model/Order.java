package com.example.springrestfulpractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// 使用 Lombok 加入 Getter, Setter, Constructor
@Getter
@Setter
public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> mealList;

    public Order(int seq, String waiter, List<Meal> mealList) {
        this.seq = seq;
        this.waiter = waiter;
        this.mealList = mealList;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for(Meal meal: this.getMealList()) {
            totalPrice += meal.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {

        this.totalPrice = totalPrice;
    }
}