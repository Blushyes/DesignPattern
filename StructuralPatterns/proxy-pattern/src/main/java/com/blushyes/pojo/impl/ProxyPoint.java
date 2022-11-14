package com.blushyes.pojo.impl;

import com.blushyes.pojo.TicketSell;

public class ProxyPoint implements TicketSell {
    TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("收取代理费用......");
        trainStation.sell();
    }
}
