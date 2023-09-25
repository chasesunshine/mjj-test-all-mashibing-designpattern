package com.mashibing.command.example01;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 * @author spikeCong
 * @date 2022/10/20
 **/
@Data
public class Order {

    /**
     * 餐桌号码
     */
    private int diningTable;

    /**
     * 存储菜名和份数
     */
    private Map<String,Integer> foodMenu = new HashMap<>();
}
