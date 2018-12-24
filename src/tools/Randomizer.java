package tools;

import ships.Ship;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    //instance variables
    private static Random random = new Random();
    private static final int MAX_SHIPS = 25;
    private static final int MAX_TOWERS = 10;
    private static final int MAX_EMERGENCYSERVICES = 8;

    //fill list of ships with random ships.
    public static ArrayList<Ship> getShips(){
        ArrayList<Ship> listOfShips = new ArrayList<Ship>();

        for (int i = 0; i < 25 + random.nextInt(MAX_SHIPS); i++){
            int randomShipType = getRandomNumberInRange(1, 5);
            listOfShips.add(ShipFactory.buildShip(randomShipType, getRandomLocation(), getRandomIdentificationNumber()));
        }
        return listOfShips;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static Coordinates getRandomLocation(){
        double longitude = getRandomNumberInRange(-180, 180);
        double latitude = getRandomNumberInRange(-90, 90);
        return new Coordinates(longitude, latitude);

    }

    private static int getRandomIdentificationNumber(){

        int idNumber = getRandomNumberInRange(0, 999);
        return idNumber;
    }



}
