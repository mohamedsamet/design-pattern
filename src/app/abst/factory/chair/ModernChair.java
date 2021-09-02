package app.abst.factory.chair;

import app.abst.factory.interfaces.Chair;

public class ModernChair implements Chair {

    @Override
    public void startProduction() {
        System.out.println("start modern chair production");
    }

    @Override
    public void assemble() {
        System.out.println("assemble modern chair");

    }

    @Override
    public int getPrices() {
        return 150;
    }
}
