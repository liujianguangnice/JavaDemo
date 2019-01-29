package keven.com.nullobject;

import keven.com.nullobject.interf.DependencyBase;

/**
 * author:81486
 * Data:2019/1/24 18:19
 * Description:
 */
public class Client {

    private static DependencyBase dependencyBase;

    private static void test() {
        System.out.println("1");
        Factory.get(dependencyBase).Operation();
    }

    public static void main(String[] args) {
        test();
    }




}
