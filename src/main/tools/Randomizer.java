/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: randomizer	om	collectie eenmalig te genereren
 */
package main.tools;

import main.controlTower.ControlTower;
import main.emergencyService.EmergencyService;
import main.ships.Ship;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    //instance variables
    private static Random random = new Random();
    private static final int MAX_SHIPS = 25;
    private static final int MAX_TOWERS = 10;
    private static final int MAX_EMERGENCYSERVICES = 8;

    //Create Random ships.
    public static ArrayList<Ship> getRandomShips(){
        ArrayList<Ship> listOfShips = new ArrayList<Ship>();

        for (int i = 0; i < 25 + random.nextInt(MAX_SHIPS); i++){
            int randomShipType = getRandomNumberInRange(1, 5);
            listOfShips.add(ShipFactory.buildRandomShip(randomShipType, getRandomLocation(), getRandomIdentificationNumber()));
        }
        return listOfShips;
    }

    //Create Random emergency services.
    public static ArrayList<EmergencyService> getRandomEmergencyServices(){
        ArrayList<EmergencyService> listOfEmergencyServices = new ArrayList<EmergencyService>();

        for (int i = 0; i < 25 + random.nextInt(MAX_EMERGENCYSERVICES); i++){
            int randomEmergencyServiceType = getRandomNumberInRange(1, 3);
            listOfEmergencyServices.add(EmergencyServiceFactory.buildEmergencyService(randomEmergencyServiceType, getRandomLocation(), getRandomIdentificationNumber()));
        }

        return listOfEmergencyServices;
    }

    //Create Random control towers.
    public static ArrayList<ControlTower> getRandomControlTowers(){
        ArrayList<ControlTower> listOfTowers = new ArrayList<ControlTower>();
        for (int i = 0; i < 25 + random.nextInt(MAX_TOWERS); i++){
            listOfTowers.add(ControlTowerFactory.buildTower(getRandomLocation(), getRandomIdentificationNumber()));
        }

        return listOfTowers;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static Coordinates getRandomLocation(){
        double longitude = getRandomNumberInRange(-180, 180);
        double latitude = getRandomNumberInRange(-90, 90);
        return new Coordinates(longitude, latitude);
    }

    public static int getRandomIdentificationNumber(){

        int idNumber = getRandomNumberInRange(0, 999);
        return idNumber;
    }



}
