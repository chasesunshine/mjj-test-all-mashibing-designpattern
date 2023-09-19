package com.mashibing.strategy.example03.mjj;

import com.mashibing.strategy.example02.Receipt;
import com.mashibing.strategy.example02.ReceiptBuilder;

import java.util.List;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class Client {

    public static void main(String[] args) {

        List<Receipt> receiptList = ReceiptBuilder.getReceiptList();
        ReceiptStrategyContext receiptStrategyContext = new ReceiptStrategyContext();
        receiptList.stream().forEach(
                receipt -> {
                    ReceiptHandleStrategyFactory.init();
                    ReceiptStrategy strategy = ReceiptHandleStrategyFactory.getStrategy(receipt.getType());
                    receiptStrategyContext.setReceiptHandleStrategy(strategy);
                    receiptStrategyContext.handleReceipt(receipt);
                }
        );
    }
}
