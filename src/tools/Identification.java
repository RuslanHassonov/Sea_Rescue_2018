package tools;

public class Identification {

    private String identificationNumber;

    public Identification(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return getIdentificationNumber();
    }
}
