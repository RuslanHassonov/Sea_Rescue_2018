/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

package controlTower;

import interfaces.IIdentification;
import interfaces.ILocation;
import tools.Coordinates;

public abstract class ControlTower implements ILocation, IIdentification {

    protected Coordinates towerLocation;

    public ControlTower(Coordinates towerLocation) {
        this.towerLocation = towerLocation;
    }

    @Override
    public Coordinates getLocation() {
        return towerLocation;
    }

    @Override
    public String toString() {
        return "Location => " + getLocation().toString() + "\nIdentification: - " + getIdentification()+"\n";
    }
}
