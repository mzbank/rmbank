package product.Knowledge.design.behavior.observer.BeObserved;

import product.Knowledge.design.behavior.observer.observers.Observer;

import java.util.Vector;

public abstract class Subject {
    Vector<Observer> observers = new Vector<>();

    public void AddObserver(Observer observer){
        observers.add(observer);
    }
    public void DelObserver(Observer observer){
        observers.remove(observer);
    }
    protected void NotifyObserver(){
        for (Observer observer :
                observers) {
            observer.update();
        }
    }
    public abstract void dosomthing();
}
