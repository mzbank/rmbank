package product.Knowledge.design.behavior.observer.observers;

public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者---2--接受到消息");
    }
}
