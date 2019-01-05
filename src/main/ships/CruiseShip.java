/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: CruiseShip class that represents a ship in list main.ships
 */
package main.ships;

import main.tools.Coordinates;
import main.tools.Identification;

public class CruiseShip extends Ship {

    private Identification cruiseShipID;

    public CruiseShip(Coordinates shipLocation, int shipID){
        super(shipLocation);
        cruiseShipID = new Identification("CRS-" + String.valueOf(shipID));
    }

    public Identification getIdentification() {
        return cruiseShipID;
    }

    public double getSize() {
        return 0;
    }

    public double getCapacity() {
        return 0;
    }
}
