package ships;

import tools.Coordinates;
import tools.Identification;

public class SpeedBoat extends Ship {

    private Identification speedBoatID;

    public SpeedBoat(Coordinates shipLocation, int shipID){
        super(shipLocation);
        speedBoatID = new Identification("SPB-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return speedBoatID;
    }
}
