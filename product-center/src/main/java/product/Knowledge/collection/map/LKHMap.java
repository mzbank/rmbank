package product.Knowledge.collection.map;

import product.Knowledge.collection.list.User;

import java.util.LinkedHashMap;
import java.util.Map;

public class LKHMap {

    public static void main(String[] args) {
        Map<String, User> map = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put("sdf"+i, new User("sdfre"+i,"sdfeb"));
        }
        
        System.out.println(map);
    }
}
