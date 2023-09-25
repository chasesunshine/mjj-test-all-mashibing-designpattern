package com.mashibing.mediator.example02;

import com.mashibing.mediator.example02.person.Person;

/**
 * 具体的中介者-中介机构
 * @author spikeCong
 * @date 2022/10/21
 **/
public class MediatorStructure extends Mediator {

    @Override
    public void contact(String message, Person person) {
        if(person == houseOwner){
            //如果是房主,则租房者获得信息
            tenant.getMessage(message);
        }else{
            //如果是租房者,则房租获得信息
            houseOwner.getMessage(message);
        }
    }
}
