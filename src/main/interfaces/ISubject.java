package main.interfaces;

/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

import main.ships.Ship;

public interface ISubject {
    void registerObserver(Observer newObserver);
    void removeObserver(Observer toBeRemovedObserver);
    void notifyObservers();

}
