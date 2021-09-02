package app;

import app.abst.factory.CustomFurnitureFactory;
import app.abst.factory.ModernFurnitureFactory;
import app.abst.factory.chair.CustomChair;
import app.abst.factory.coffetable.CoffeeTableRoyal;
import app.factory.moto.MotoFactory;
import app.factory.car.CarFactory;
import app.factory.models.Vehicule;

public class App {
    public static void main(String[] args) {
        System.out.println("Start Java Design Pattern App");
     //   new App().runFactoryMethod();
        new App().runAbstractFactory();
    }

    void runFactoryMethod() {
        Vehicule moto = new MotoFactory().creates();
        moto.startEngine();
        moto.assemble();
        moto.buildInterior();

        Vehicule car = new CarFactory().creates();
        car.startEngine();
        car.assemble();
        car.buildInterior();
    }

    void runAbstractFactory() {
        CoffeeTableRoyal coffeeTableRoyal = new ModernFurnitureFactory().createCoffeTable();
        System.out.println(coffeeTableRoyal.getPrices());
        coffeeTableRoyal.startProduction();

        CustomChair chair = new CustomFurnitureFactory().createChair();
        System.out.println(chair.getPrices());
        chair.startProduction();


    }
}
