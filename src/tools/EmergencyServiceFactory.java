package tools;

import emergencyService.*;

public class EmergencyServiceFactory extends AbstractFactory {

    private final static int AIRPLANE_ID = 1;
    private final static int COASTGUARD_ID = 2;
    private final static int SEAKING_ID = 3;

    public EmergencyServiceFactory(String typeFactory) {
        super(typeFactory);
    }

    public static EmergencyService buildEmergencyService(int type, Coordinates location, int idNumber) {
        EmergencyService rescue = null;

        switch (type) {
            case AIRPLANE_ID: {
                rescue = new Airplane(location, idNumber);
                break;
            }
            case COASTGUARD_ID: {
                rescue = new CoastGuard(location, idNumber);
                break;
            }
            case SEAKING_ID:{
                rescue = new SeaKingHelicopter(location, idNumber);
                break;
            }
        }

        return rescue;
    }

}
