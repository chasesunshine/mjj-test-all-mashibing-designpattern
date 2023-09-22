package com.mashibing.visitor.example01.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 抽象商品父类
 * @author spikeCong
 * @date 2022/10/18
 **/
@AllArgsConstructor
@Data
@NoArgsConstructor
public abstract class Product {

    private String name; //商品名

    private LocalDate produceDate; //生产日期

    private double price; //商品价格
}
