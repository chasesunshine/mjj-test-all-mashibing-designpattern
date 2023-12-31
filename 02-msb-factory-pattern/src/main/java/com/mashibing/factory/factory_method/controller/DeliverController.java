package com.mashibing.factory.factory_method.controller;

import com.mashibing.factory.factory_method.factory.FreeGoodsFactoryMap;
import com.mashibing.factory.factory_method.factory.impl.DiscountFreeGoodsFactory;
import com.mashibing.factory.factory_method.factory.FreeGoodsFactory;
import com.mashibing.factory.factory_method.factory.impl.SmallGiftFreeGoodsFactory;
import com.mashibing.factory.simple_factory.entity.AwardInfo;
import com.mashibing.factory.simple_factory.entity.ResponseResult;
import com.mashibing.factory.simple_factory.service.IFreeGoods;


/**
 * 发放奖品接口
 * @author spikeCong
 * @date 2022/9/9
 **/
public class DeliverController {

    //发放奖品
    public ResponseResult awardToUser(AwardInfo awardInfo){

        //根据类型获取具体工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardTypes());

        //从工厂类中获取对应实例
        IFreeGoods iFreeGoods = goodsFactory.getInstance();

        System.out.println("==========工厂方法模式=============");
        ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
        return responseResult;
    }
}


// 老写法
//public class DeliverController {
//
//    /**
//     * 按照类型的不同发放商品
//     */
//    public ResponseResult awardToUser(AwardInfo awardInfo){
//
//        FreeGoodsFactory freeGoodsFactory = null;
//
//        if(awardInfo.getAwardType() == 1){
//
//            freeGoodsFactory = new DiscountFreeGoodsFactory();
//        }else if(awardInfo.getAwardType() == 2){
//
//            freeGoodsFactory = new SmallGiftFreeGoodsFactory();
//        }
//
//        IFreeGoods freeGoods = freeGoodsFactory.getInstance();
//
//        System.out.println("=====工厂方法模式========");
//        ResponseResult result = freeGoods.sendFreeGoods(awardInfo);
//
//        return result;
//    }
//
//}