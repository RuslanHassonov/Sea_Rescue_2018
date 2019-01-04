/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: CruiseShip class that represents a ship in list ships
 */
package ships;

import tools.Coordinates;
import tools.Identification;

public class CruiseShip extends Ship {

    private Identification cruiseShipID;

    public CruiseShip(Coordinates shipLocation, int shipID){
        super(shipLocation);
        cruiseShipID = new Identification("CRS-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return cruiseShipID;
    }

    @Override
    public double getSize() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
