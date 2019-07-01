package product.Knowledge.collection.map;

import product.Knowledge.collection.list.User;

import java.util.HashMap;
import java.util.Map;

public class HMap {
    public static void main(String[] args) {
        Map<String, User> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(null,new User("zs","sdfe"));
            map.put("sdf"+i,new User("zs","sdfui"));
        }
        User sdf5 = map.remove("sdf5");
        System.out.println(sdf5);
    }
}
