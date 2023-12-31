package com.mashibing.chain.example03;

import com.mashibing.chain.example02.AuthInfo;
import com.mashibing.chain.example02.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/16
 **/
public class Level3AuthLink extends AuthLink {

    public Level3AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);

        if(null == date){
            return new AuthInfo("0001","单号: "+ orderId," 状态: 待三级审核人审批", levelUserName);
        }

        AuthLink next = super.getNext();

        if(next == null){
            return new AuthInfo("0000","单号: "+ orderId," 状态: 三级审批完成", "审批人: " + levelUserName);
        }

        return next.doAuth(uId,orderId,authDate);
    }
}
