package product.Knowledge.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AList {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName("zs"+i);
            user.setPassword("235");
            list.add(user);
        }
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i>0){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
//        Collections.sort(list, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                int i = o1.getName().compareTo(o2.getName());
//                if (i>0){
//                    return -1;
//                }else {
//                    return 1;
//                }
//            }
//        });
        System.out.println(list);
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getName().equals("zs55")){
                iterator.remove();
            }
        }

        System.out.println(list);
        list.add(new User("zs67","235"));
        System.out.println(list);

        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!userArrayList.contains(list.get(i))){
                userArrayList.add(list.get(i));
            }
        }
        System.out.println(userArrayList);
    }


}
