/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: randomizer    om	collectie eenmalig te genereren
 */
package main.tools;

import main.controlTower.ControlTower;
import main.controlTower.ControlTowerFactory;
import main.emergencyService.EEmergencyServices;
import main.emergencyService.EmergencyService;
import main.emergencyService.EmergencyServiceFactory;
import main.ships.EShipTypes;
import main.ships.Ship;
import main.ships.ShipFactory;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    //instance variables


    //Create Random ships.
    public static Ship getRandomShips() {
        return ShipFactory.buildAShip(getRandomShipType());
    }

    //Create Random emergency services.
    public static EmergencyService getRandomEmergencyServices() {
        return EmergencyServiceFactory.buildEmergencyService(getRandomEmergencyServiceType());
    }

    //Create Random control towers.
    public static ControlTower getRandomControlTowers() {
        return ControlTowerFactory.buildTower(getRandomLocation(), getRandomIdentificationNumber());
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static Coordinates getRandomLocation() {
        double longitude = getRandomNumberInRange(-180, 180);
        double latitude = getRandomNumberInRange(-90, 90);
        return new Coordinates(longitude, latitude);
    }

    public static int getRandomIdentificationNumber() {

        int idNumber = getRandomNumberInRange(0, 999);
        return idNumber;
    }

    public static String getRandomShipType() {
        return EShipTypes.getRandomShip().toString();
    }

    public static String getRandomEmergencyServiceType() {
        return EEmergencyServices.getRandomEmergencyService().toString();
    }


}
