/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Airplane class that represents an emergency service in list emergency services
 */
package main.emergencyService;

import main.tools.Coordinates;
import main.tools.Identification;

public class Airplane extends EmergencyService{

    private Identification planeID;

    public Airplane(Coordinates rescueLocation, int planeID){
        super(rescueLocation);
        this.planeID = new Identification("ARP-" + String.valueOf(planeID));
    }


    public Identification getIdentification() {
        return planeID;
    }

    public double getSize() {
        return 0;
    }

    public double getCapacity() {
        return 0;
    }
}
