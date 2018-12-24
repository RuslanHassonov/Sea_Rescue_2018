package main;

import ships.Ship;
import tools.Randomizer;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Ship> listOfShips;

    public static void main(String[] args) {
        listOfShips = Randomizer.getShips();

        for (Ship s : listOfShips){
            System.out.println(s.toString());
        }
    }
}
