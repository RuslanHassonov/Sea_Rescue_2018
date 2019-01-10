/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: factory maakt verschillende emergency services aan
 */
package main.emergencyService;

import main.emergencyService.*;
import main.tools.AbstractFactory;
import main.tools.Coordinates;
import main.tools.Randomizer;

public class EmergencyServiceFactory extends AbstractFactory {

    public EmergencyServiceFactory(String typeFactory) {
        super(typeFactory);
    }


    public static EmergencyService buildEmergencyService(String serviceName) {
        EmergencyService emergencyService = null;

        if ("AIRPLANE".equalsIgnoreCase(serviceName)) {
            emergencyService = new Airplane(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        } else if ("COAST GUARD".equalsIgnoreCase(serviceName) || "COASTGUARD".equalsIgnoreCase(serviceName)) {
            emergencyService = new CoastGuard(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        } else if ("SEA KING".equalsIgnoreCase(serviceName) || "SEAKING".equalsIgnoreCase(serviceName)) {
            emergencyService = new SeaKingHelicopter(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        }


        if (emergencyService == null){
            throw new NullPointerException();
        }

        return emergencyService;
    }

}
