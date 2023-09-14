package com.mashibing.example01.mjjtest.paychannel;

import com.mashibing.example01.mjjtest.payMethod.PayMethod;

import java.math.BigDecimal;

public class ZhifubaoChannel implements PayChannel {
    @Override
    public boolean doPay(String uId, String tradeId, BigDecimal amount, PayMethod payMethod) {
        System.out.println("支付宝渠道支付开始......");
        payMethod.method();
        return true;
    }
}
