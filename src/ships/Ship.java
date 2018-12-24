package ships;

import interfaces.IIdentification;
import interfaces.ILocation;
import interfaces.IMeasurement;
import interfaces.INavigation;
import tools.Coordinates;

public abstract class Ship implements ILocation, IIdentification, IMeasurement {

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
