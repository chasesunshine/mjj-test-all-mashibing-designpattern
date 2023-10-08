package com.mashibing.strategy.mjjTest.comparatorMethod;

public class Cat{
    public int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
