/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.emergencyService;

import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.IMeasurement;
import main.tools.Actor;
import main.tools.Coordinates;

public abstract class EmergencyService extends Actor implements ILocation, IIdentification, IMeasurement {

    protected Coordinates rescueLocation;

    public EmergencyService(Coordinates rescueLocation) {
        this.rescueLocation = rescueLocation;
    }

    @Override
    public Coordinates getLocation() {
        return rescueLocation;
    }

    @Override
    public String toString() {
        return String.format("-- SOS SERVICE --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getLocation().toString());
    }
}
