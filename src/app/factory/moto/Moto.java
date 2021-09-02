package app.factory.moto;

import app.factory.models.Vehicule;

public class Moto implements Vehicule {

    @Override
    public void startEngine() {
        System.out.println("Start Moto Engine");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble Moto");

    }

    @Override
    public void buildInterior() {
        System.out.println("Build Moto interior");
    }
}
