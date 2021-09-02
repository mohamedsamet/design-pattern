package app.abst.factory.chair;

import app.abst.factory.interfaces.Chair;

public class CustomChair implements Chair {

    @Override
    public void startProduction() {
        System.out.println("start custom chair production");
    }

    @Override
    public void assemble() {
        System.out.println("assemble custom chair");

    }

    @Override
    public int getPrices() {
        return 99;
    }
}
