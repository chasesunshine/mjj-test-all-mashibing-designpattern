package com.mashibing.strategy.example03.mjj;

import com.mashibing.strategy.example02.Receipt;

public class ReceiptMT1101 implements ReceiptStrategy{
    @Override
    public void algorithm(Receipt receipt) {
        System.out.println("接收到MT1101的回执信息");
        System.out.println("解析回执内容");
        System.out.println("执行业务逻辑A......");
    }
}
