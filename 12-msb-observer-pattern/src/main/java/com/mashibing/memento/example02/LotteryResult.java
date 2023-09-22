package com.mashibing.memento.example02;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * 开奖结果封装类
 * @author spikeCong
 * @date 2022/10/12
 **/
@Data
@AllArgsConstructor
public class LotteryResult {

    private String uId; //用户id

    private String msg; //摇号信息

    private Date dateTime; //业务时间

    @Override
    public String toString() {
        return "LotteryResult{" +
                "uId='" + uId + '\'' +
                ", msg='" + msg + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
