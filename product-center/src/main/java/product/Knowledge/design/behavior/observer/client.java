package product.Knowledge.design.behavior.observer;

import product.Knowledge.design.behavior.observer.BeObserved.ConcreteSubject;
import product.Knowledge.design.behavior.observer.BeObserved.Subject;
import product.Knowledge.design.behavior.observer.observers.Observer;
import product.Knowledge.design.behavior.observer.observers.Observer1;
import product.Knowledge.design.behavior.observer.observers.Observer2;

public class client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        subject.AddObserver(observer1);
        subject.AddObserver(observer2);
        subject.dosomthing();
    }
}
