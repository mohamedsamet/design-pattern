package app.factory.car;

import app.factory.VehiculeFactory;
import app.factory.models.Vehicule;

public class CarFactory extends VehiculeFactory {

    public Vehicule creates() {
        return new Car();
    }
}
