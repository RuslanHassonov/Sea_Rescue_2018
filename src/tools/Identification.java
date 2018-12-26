/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
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
