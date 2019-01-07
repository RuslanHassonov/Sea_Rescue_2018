package main.interfaces;

import main.ships.Ship;

public interface ISubject {
    void registerObserver(Observer newObserver);
    void removeObserver(Observer toBeRemovedObserver);
    void notifyObservers();

}
