package main.interfaces;

/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

public interface ISubject {
    void registerObserver(IObserver newObserver);
    void removeObserver(IObserver toBeRemovedObserver);
    void notifyObservers();

}
