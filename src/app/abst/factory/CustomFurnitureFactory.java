package app.abst.factory;

import app.abst.factory.chair.CustomChair;
import app.abst.factory.coffetable.CoffeeTableLow;

public class CustomFurnitureFactory implements FurnitureFactory {

    @Override
    public CustomChair createChair() {
        return new CustomChair();
    }

    @Override
    public CoffeeTableLow createCoffeTable() {
        return new CoffeeTableLow();
    }
}
