package product.Knowledge.design.behavior.observer.observers;

public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察－－－１－－接受到消息");
    }
}
