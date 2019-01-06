
package main.tools;
/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: factory maakt verschillende main.ships aan
 */
import main.ships.*;

public class ShipFactory extends AbstractFactory{

    private final static int TANKER_ID = 1;
    private final static int FERRY_ID = 2;
    private final static int CRUISESHIP_ID = 3;
    private final static int FISHER_ID = 4;
    private final static int SPEEDBOAT_ID = 5;

    public ShipFactory(String typeFactory) {
        super(typeFactory);
    }


    public static Ship buildRandomShip(int type, Coordinates location, int idNumber) {
        Ship ship = null;

        switch (type) {
            case TANKER_ID: {
                ship = new Tanker(location, idNumber);
                break;
            }
            case FERRY_ID: {
                ship = new Ferry(location, idNumber);
                break;
            }
            case CRUISESHIP_ID:{
                ship = new CruiseShip(location, idNumber);
                break;
            }
            case FISHER_ID: {
                ship = new Fisher(location, idNumber);
                break;
            }
            case SPEEDBOAT_ID:{
                ship = new SpeedBoat(location, idNumber);
                break;
            }
        }

        return ship;
    }

    public static Ship buildSpecificShip(String shipName, Coordinates location, int idNumber) {
        Ship newShip = null;

        if ("TANKER".equalsIgnoreCase(shipName)) {
            newShip = new Tanker(location, idNumber);
        } else if ("FERRY".equalsIgnoreCase(shipName)) {
            newShip = new Ferry(location, idNumber);
        } else if ("CRUISE SHIP".equalsIgnoreCase(shipName) || "CRUISESHIP".equalsIgnoreCase(shipName)) {
            newShip = new CruiseShip(location, idNumber);
        } else if ("FISHER".equalsIgnoreCase(shipName)) {
            newShip = new Fisher(location, idNumber);
        } else if ("SPEED BOAT".equalsIgnoreCase(shipName) || "SPEEDBOAT".equalsIgnoreCase(shipName)) {
            newShip = new SpeedBoat(location, idNumber);
        }

        if (newShip == null){
            throw new NullPointerException();
        }

        return newShip;
    }

}
