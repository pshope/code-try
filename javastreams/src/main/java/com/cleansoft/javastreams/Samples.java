package com.cleansoft.javastreams;

import java.util.ArrayList;
import java.util.List;

public class Samples {

    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("red", 10.00));
        toys.add(new Toy("red", 20.00));
        toys.add(new Toy("blue", 10.00));

        Double sum = toys.stream()
                .filter(t -> "red".equals(t.getColor()))
                .mapToDouble(Toy::getPrice)
                .sum();
        System.out.println(sum);
    }
}

class Toy {
    private String color;
    private Double price;

    public Toy(String color, Double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
