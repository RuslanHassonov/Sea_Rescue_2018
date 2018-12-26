/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package emergencyService;

import interfaces.IIdentification;
import interfaces.ILocation;
import interfaces.IMeasurement;
import tools.Coordinates;

public abstract class EmergencyService implements ILocation, IIdentification, IMeasurement {

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
        return "Location => " + getLocation().toString() + "\nIdentification: - " + getIdentification()+"\n";
    }
}
