/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: CoastGuard class that represents an emergency service in list emergency services
 */

package main.emergencyService;

import main.tools.Coordinates;
import main.tools.Identification;

public class CoastGuard extends EmergencyService {

    private Identification coastGuardID;

    public CoastGuard(Coordinates rescueLocation, int coastGuardID){
        super(rescueLocation);
        this.coastGuardID = new Identification("CGD-" + String.valueOf(coastGuardID));
    }

    public Identification getIdentification() {
        return coastGuardID;
    }

    public double getSize() {
        return 0;
    }

    public double getCapacity() {
        return 0;
    }
}
