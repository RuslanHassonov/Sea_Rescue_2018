package ships;

import tools.Coordinates;
import tools.Identification;

public class Fisher extends Ship {

    private Identification fisherID;
    public Fisher(Coordinates shipLocation, int shipID){
        super(shipLocation);
        fisherID = new Identification("FSH-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return fisherID;
    }
}
