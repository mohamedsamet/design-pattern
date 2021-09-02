package app.abst.factory.coffetable;

import app.abst.factory.interfaces.CoffeTable;

public class CoffeeTableRoyal implements CoffeTable {

    @Override
    public void startProduction() {
        System.out.println("start coffee table royal production");
    }

    @Override
    public int getPrices() {
        return 203;
    }
}
