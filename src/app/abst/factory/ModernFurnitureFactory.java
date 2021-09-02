package app.abst.factory;

import app.abst.factory.chair.ModernChair;
import app.abst.factory.coffetable.CoffeeTableRoyal;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTableRoyal createCoffeTable() {
        return new CoffeeTableRoyal();
    }
}
