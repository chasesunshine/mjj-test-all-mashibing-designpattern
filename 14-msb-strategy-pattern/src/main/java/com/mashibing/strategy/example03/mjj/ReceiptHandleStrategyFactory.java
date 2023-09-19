package com.mashibing.strategy.example03.mjj;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂类
 * @author spikeCong
 * @date 2022/10/13
 **/
public class ReceiptHandleStrategyFactory {

    public ReceiptHandleStrategyFactory() {
    }

    //使用Map集合存储策略信息,彻底的消除if...else
    private static Map<String, ReceiptStrategy> strategyMap;

    //初始化具体策略,保存到map集合
    public static void init(){
        strategyMap = new HashMap<>();
        strategyMap.put("MT1101",new ReceiptMT1101());
        strategyMap.put("MT2101",new ReceiptMT2101());
//        try {
//            SAXReader reader = new SAXReader();
//            String file = "D:\\allWorkSpace\\ideaWorkSpace\\mjjOwner\\mjj-test-all-mashibing-designpattern\\msb-strategy-pattern-14\\src\\main\\resources\\config.xml";
//
//            Document document = reader.read(file);
//            Node node = document.selectSingleNode("/confing/className");
//            String className = node.getText();
//            Class clazz = Class.forName(className);
//            ReceiptHandleStrategy strategy = (ReceiptHandleStrategy) clazz.newInstance();
//            strategyMap.put("MT1101",strategy);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }

    //根据回执类型,获取对应的策略对象
    public static ReceiptStrategy getStrategy(String receiptType){
        return strategyMap.get(receiptType);
    }
}
