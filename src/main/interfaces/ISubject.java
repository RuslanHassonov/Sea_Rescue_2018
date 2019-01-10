package main.interfaces;

import main.ships.Ship;

/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

public interface ISubject {
    void registerObserver(Ship newObserver);
    void removeObserver(Ship toBeRemovedObserver);
    void notifyObservers();

}
