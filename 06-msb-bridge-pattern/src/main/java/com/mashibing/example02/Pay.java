package com.mashibing.example02;

import com.mashibing.example02.paymode.IPayMode;

import java.math.BigDecimal;

/**
 * 支付抽象类
 * @author spikeCong
 * @date 2022/9/26
 **/
public abstract class Pay {

    //桥接对象
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
