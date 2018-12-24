package emergencyService;

import tools.Coordinates;
import tools.Identification;

public class CoastGuard extends EmergencyService {

    private Identification coastGuardID;

    public CoastGuard(Coordinates rescueLocation, int coastGuardID){
        super(rescueLocation);
        this.coastGuardID = new Identification("CGD-" + String.valueOf(coastGuardID));
    }

    @Override
    public Identification getIdentification() {
        return coastGuardID;
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
