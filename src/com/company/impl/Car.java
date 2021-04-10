package com.company.impl;

import com.company.api.Costable;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    protected int cost;

    public Car(int wheelCount, int doorsCount, int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;


    }

    @Override
    protected void printInfo() {
        System.out.println("“Транспортное средство: Машина - Количество дверей: " +
                doorsCount +" - Количество колес: " +
                wheelCount +
                '“' + " Цена: " +getCost() + "тыс.$");

    }




    @Override
    public int getCost() {
        return this.cost ;
    }

}
