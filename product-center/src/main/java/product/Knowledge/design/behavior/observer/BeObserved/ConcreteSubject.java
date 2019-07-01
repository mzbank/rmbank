package product.Knowledge.design.behavior.observer.BeObserved;

public class ConcreteSubject extends Subject {
    @Override
    public void dosomthing() {
        System.out.println("被观察者方法被调用,,,等待观察者处理消息");
        this.NotifyObserver();

    }
}
