package ships;

import tools.Coordinates;
import tools.Identification;

public class Ferry extends Ship {

    private Identification ferryID;

    public Ferry(Coordinates shipLocation, int shipID) {
        super(shipLocation);
        ferryID = new Identification("FRY-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return ferryID;
    }
}
