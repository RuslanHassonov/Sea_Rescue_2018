/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: CoastGuard class that represents an emergency service in list emergency services
 */

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
