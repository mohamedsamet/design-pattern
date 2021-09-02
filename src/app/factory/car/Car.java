package app.factory.car;

import app.factory.models.Vehicule;

public class Car implements Vehicule {

    @Override
    public void startEngine() {
        System.out.println("Start Car Engine");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble Car");
    }

    @Override
    public void buildInterior() {
        System.out.println("Build Car interior");
    }
}
