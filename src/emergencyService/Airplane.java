package emergencyService;

import tools.Coordinates;
import tools.Identification;

public class Airplane extends EmergencyService{

    private Identification planeID;

    public Airplane(Coordinates rescueLocation, int planeID){
        super(rescueLocation);
        this.planeID = new Identification("ARP-" + String.valueOf(planeID));
    }

    @Override
    public Identification getIdentification() {
        return planeID;
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
