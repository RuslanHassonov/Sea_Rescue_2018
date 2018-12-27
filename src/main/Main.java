/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: main application, launches app
 */
package main;

import controlTower.ControlTower;
import emergencyService.EmergencyService;
import ships.Ship;
import tools.Randomizer;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Ship> listOfShips;
    private static ArrayList<EmergencyService> listOfEmergencyServices;
    private static ArrayList<ControlTower> listOfControlTowers;

    public static void main(String[] args) {
        listOfShips = Randomizer.getShips();
        listOfEmergencyServices = Randomizer.getEmergencyServices();
        listOfControlTowers = Randomizer.getControlTowers();

        for (Ship s : listOfShips){
            System.out.println(s.toString());
        }
    }
}
