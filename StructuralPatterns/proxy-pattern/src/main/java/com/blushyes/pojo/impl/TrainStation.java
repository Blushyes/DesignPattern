package com.blushyes.pojo.impl;

import com.blushyes.pojo.TicketSell;

public class TrainStation implements TicketSell {
    @Override
    public void sell() {
        System.out.println("火车站卖火车票......");
    }
}
