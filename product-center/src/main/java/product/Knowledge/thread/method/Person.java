package product.Knowledge.thread.method;

public class Person {

    public synchronized void say(){

            System.out.println("l can speak! " + Thread.currentThread().getName());
    }

    public synchronized void see(){
        System.out.println("l can see! " +Thread.currentThread().getName());
    }

}
