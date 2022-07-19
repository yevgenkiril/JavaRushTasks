package com.javarush.task.pro.javaLessons.sameAsTask1;

import java.util.Objects;

public class Plant {
    private Status status;
    private String name;
    private int quantity;

    public Plant(Status status, String name, int quantity) {
        this.status = status;
        this.name = name;
        this.quantity = quantity;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return quantity == plant.quantity && status == plant.status && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, name, quantity);
    }

    @Override
    public String toString() {
        return
                "status=" + status +
                        ", name='" + name + '\'' +
                        ", quantity=" + quantity +
                        '}';
    }

}
