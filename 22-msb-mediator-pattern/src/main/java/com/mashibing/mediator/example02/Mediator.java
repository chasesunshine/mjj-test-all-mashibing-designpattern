package com.mashibing.mediator.example02;

/**
 * 抽象中介者
 * @author spikeCong
 * @date 2022/10/21
 **/
public abstract class Mediator {
    //中介知晓 房租出租人和承租人的信息
    protected HouseOwner houseOwner;  //房主

    protected Tenant tenant;  //租房者

    //创建联络方法
    public abstract void contact(String message, Person person);

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }
}
