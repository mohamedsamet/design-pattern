package app.abst.factory.coffetable;

import app.abst.factory.interfaces.CoffeTable;

public class CoffeeTableLow implements CoffeTable {

    @Override
    public void startProduction() {
        System.out.println("start coffee table low production");
    }

    @Override
    public int getPrices() {
        return 2;
    }
}
