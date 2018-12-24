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
}
