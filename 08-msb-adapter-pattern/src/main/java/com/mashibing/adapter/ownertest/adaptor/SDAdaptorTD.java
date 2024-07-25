package com.mashibing.adapter.ownertest.adaptor;

import com.mashibing.adapter.ownertest.entity.SD;
import com.mashibing.adapter.ownertest.entity.TDImpl;

public class SDAdaptorTD extends TDImpl implements SD {

    @Override
    public String readSd() {
        return readTd();
    }

    @Override
    public void writeSd(String msg) {
        writeTd(msg);
    }
}
