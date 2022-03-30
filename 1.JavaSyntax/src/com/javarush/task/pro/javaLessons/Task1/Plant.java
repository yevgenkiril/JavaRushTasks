package com.javarush.task.pro.javaLessons.Task1;

import java.util.ArrayList;

public class Plant {
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private Status status;
    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plant(Status status, String name, int quantity) {
        this.status = status;
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return
                "status=" + status +
                        ", name=" + name +
                        ", quantity=" + quantity;
    }
}


