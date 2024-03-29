package product.Knowledge.design.behavior.dynamic.Dy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DyObject implements InvocationHandler {

    private Object object;

    public DyObject(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("购书冲动构成中");
        method.invoke(object, args);
        System.out.println("购书需求已完成");
        return null;
    }
}
