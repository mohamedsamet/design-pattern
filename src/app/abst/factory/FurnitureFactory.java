package app.abst.factory;

import app.abst.factory.interfaces.Chair;
import app.abst.factory.interfaces.CoffeTable;

public interface FurnitureFactory {
    Chair createChair();
    CoffeTable createCoffeTable();
}
