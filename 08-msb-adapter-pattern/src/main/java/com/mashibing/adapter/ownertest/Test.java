package com.mashibing.adapter.ownertest;

import com.mashibing.adapter.ownertest.adaptor.SDAdaptorTD;
import com.mashibing.adapter.ownertest.entity.SD;
import com.mashibing.adapter.ownertest.entity.SDImpl;

public class Test {
    public static void main(String[] args) {
        Compu compu = new Compu();
        SD sd = new SDImpl();
        String read = compu.read(sd);
        System.out.println(read);

        Compu compu1 = new Compu();
        SDAdaptorTD sdAdaptorTD = new SDAdaptorTD();
        String read1 = compu1.read(sdAdaptorTD);
        System.out.println(read1);
    }
}
