package keven.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        List<User> list1 = new ArrayList<User>();
        List<User> list2 = new ArrayList<User>();
        for (int i = 0; i < 100000; i++) {
            list1.add(new User(i,"test"+i));
        }
        for (int i = 0; i < 500000; i++) {
            list2.add(new User(i,"test"+i));
        }

        getDiffrent1(list1,list2);
        getDiffrent2(list1,list2);
        getDiffrent3(list1,list2);
    }

    private static List<User> getDiffrent1(List<User> list1, List<User> list2) {
        // diff 存放不同的元素
        List<User> diff = new ArrayList<User>();
        // 开始查找的时间，用于计时
        long start = System.currentTimeMillis();
        for (User user : list1) {
            if (!list2.contains(user)) {
                diff.add(user);
            }
        }
        // 计时
        System.out.println("方法1 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
        return diff;
    }

    private static List<User> getDiffrent2(List<User> list1, List<User> list2) {
        long start = System.currentTimeMillis();
        list1.retainAll(list2);// 返回值是boolean
        System.out.println("方法2 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
        return list1;
    }


    private static List<User> getDiffrent3(List<User> list1, List<User> list2) {
        List<User> diff = new ArrayList<User>();
        long start = System.currentTimeMillis();
        Map<User, Integer> map = new HashMap<User, Integer>(list1.size() + list2.size());
        // 将List1元素放入Map，计数1
        for (User string : list1) {
            map.put(string, 1);
        }
        // 遍历List2，在Map中查找List2的元素，找到则计数+1；未找到则放入map，计数1
        for (User user : list2) {
            Integer count = map.get(user);
            if (count != null) {
                map.put(user, ++count);// 此处可优化，减少put次数，
                continue;
            }
            map.put(user, 1);
        }
        for (Map.Entry<User, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                diff.add(entry.getKey());
            }
        }
        System.out.println("方法3 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
        return diff;
    }



}
