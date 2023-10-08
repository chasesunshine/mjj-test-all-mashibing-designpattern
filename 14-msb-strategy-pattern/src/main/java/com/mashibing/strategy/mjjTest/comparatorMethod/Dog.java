package com.mashibing.strategy.mjjTest.comparatorMethod;

public class Dog{

    public int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
