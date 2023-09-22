package com.mashibing.visitor.example01.element;

import com.mashibing.visitor.example01.visitor.Visitor;
import lombok.Data;

import java.time.LocalDate;

/**
 * 水果类
 * @author spikeCong
 * @date 2022/10/18
 **/
@Data
public class Fruit extends Product implements Acceptable {

    private double weight;  //重量

    public Fruit(String name, LocalDate produceDate, double price, double weight) {
        super(name, produceDate, price);
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
