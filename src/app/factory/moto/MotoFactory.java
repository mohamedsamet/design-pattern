package app.factory.moto;

import app.factory.VehiculeFactory;
import app.factory.models.Vehicule;

public class MotoFactory extends VehiculeFactory {

    public Vehicule creates() {
        return new Moto();
    }
}
