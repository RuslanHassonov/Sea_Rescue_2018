package ships;

import tools.Coordinates;
import tools.Identification;

public class Tanker extends Ship{

    private Identification tankerID;
    private final int TANKER_SIZE = 360; //displayed in m² (square meters)

    public Tanker(Coordinates shipLocation, int shipID){
        super(shipLocation);
        tankerID = new Identification("TNK-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return tankerID;
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
