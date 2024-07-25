package com.mashibing.adapter.ownertest;

import com.mashibing.adapter.ownertest.entity.SD;

/**
 * 电脑类
 * @author spikeCong
 * @date 2022/9/28
 **/
public class Compu {

    public String read(SD sd){
        String data = sd.readSd();
        return data;
    }
}
