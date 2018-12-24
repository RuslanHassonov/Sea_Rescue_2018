package tools;

import ships.*;

public class ShipFactory extends AbstractFactory{

    private final static int TANKER_ID = 1;
    private final static int FERRY_ID = 2;
    private final static int CRUISESHIP_ID = 3;
    private final static int FISHER_ID = 4;
    private final static int SPEEDBOAT_ID = 5;

    public ShipFactory(String typeFactory) {
        super(typeFactory);
    }

    public static Ship buildShip(int type, Coordinates location, int idNumber) {
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

}
