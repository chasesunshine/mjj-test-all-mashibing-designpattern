package com.mashibing.adapter.ownertest.entity;

public class SDImpl implements SD{

    @Override
    public String readSd() {
        return "读取SD";
    }

    @Override
    public void writeSd(String msg) {
        System.out.println(msg);
    }

}
