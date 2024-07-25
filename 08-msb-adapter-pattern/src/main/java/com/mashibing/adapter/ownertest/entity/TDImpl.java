package com.mashibing.adapter.ownertest.entity;

public class TDImpl implements TD{

    @Override
    public String readTd() {
        return "读取TD";
    }

    @Override
    public void writeTd(String msg) {
        System.out.println(msg);
    }

}
