/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.ships;

import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.IMeasurement;
import main.tools.Actor;
import main.tools.Coordinates;

public abstract class Ship extends Actor implements ILocation, IIdentification, IMeasurement {

    protected Coordinates shiplocation;

    public Ship(Coordinates shiplocation) {
        this.shiplocation = shiplocation;
    }

    @Override
    public Coordinates getLocation() {
        return shiplocation;
    }

    @Override
    public String toString() {
        return "Location => " + getLocation().toString() + "\nIdentification: - " + getIdentification()+"\n";
    }


}
