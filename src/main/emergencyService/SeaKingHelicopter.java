/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: SeaKingHelicopter class that represents an emergency service in list emergency services
 */
package main.emergencyService;

import main.tools.Coordinates;
import main.tools.Identification;

public class SeaKingHelicopter extends EmergencyService{

    private Identification seaKingID;

    public SeaKingHelicopter(Coordinates rescueLocation, int seaKingID){
        super(rescueLocation);
        this.seaKingID = new Identification("SKH-" + String.valueOf(seaKingID));
    }

    public SeaKingHelicopter() {
    }

    public Identification getIdentification() {
        return seaKingID;
    }

    public double getSize() {
        return 0;
    }

    public int getCapacity() {
        return 0;
    }
}
