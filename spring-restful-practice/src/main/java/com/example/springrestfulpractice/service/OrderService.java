package com.example.springrestfulpractice.service;

import com.example.springrestfulpractice.model.Meal;
import com.example.springrestfulpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orderList;

    public OrderService(){
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("hamburger", 100, "This is delicious"));
        mealList1.add(new Meal("ice_cream", 200, "This is delicious"));

        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("fries", 300, "This is delicious"));
        mealList2.add(new Meal("coca", 400, "This is delicious"));

        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1,"Leo", mealList1));
        this.orderList.add(new Order(2,"Leo", mealList2));
    }

    public List<Order> getAllOrders(){
        return this.orderList;
    }

    public Order getOrderById(int seq){
        for(Order order:this.orderList){
            if(order.getSeq()==seq){
                return order;
            }
        }
        return null;
    }

    public Order createOrder(Order order){
        this.orderList.add(order);
        return order;
    }

    public Order updateOrder(int seq,Order order) {
        for (Order updatedOrder : this.orderList) {
            if (seq == updatedOrder.getSeq()) {
                updatedOrder.setWaiter(order.getWaiter());
                updatedOrder.setTotalPrice(order.getTotalPrice());
                updatedOrder.setMealList(order.getMealList());
                return updatedOrder;
            }
        }
        return null;
    }

    public Order deleteOrder(int seq){
        for(Order deletedOrder:this.orderList){
            if(seq == deletedOrder.getSeq()){
                this.orderList.remove(deletedOrder);
                return deletedOrder;
            }
        }
        return null;
    }
}
