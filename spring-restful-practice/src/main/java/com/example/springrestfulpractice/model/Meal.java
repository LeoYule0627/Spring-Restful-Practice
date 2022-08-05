package com.example.springrestfulpractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 使用 Lombok 加入 Getter, Setter, Constructor
@Getter
@Setter
@AllArgsConstructor
public class Meal {
    private String name;
    private int price;
    private String description;

}