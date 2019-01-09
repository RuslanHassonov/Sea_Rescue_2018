package main.emergencyService;

import java.util.Random;

public enum EEmergencyServices {
    SEA_KING("SEAKING"),
    COAST_GUARD("COASTGUARD"),
    AIRPLANE("AIRPLANE");

    private final String text;

    EEmergencyServices(final String text) {
        this.text = text;
    }

    public static EEmergencyServices getRandomEmergencyService() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    @Override
    public String toString() {
        return text;
    }
}
