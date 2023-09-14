package com.mashibing.example01.mjjtest.paychannel;

import com.mashibing.example01.mjjtest.payMethod.PayMethod;

import java.math.BigDecimal;

public interface PayChannel {
    boolean doPay(String uId, String tradeId, BigDecimal amount, PayMethod payMethod);
}
