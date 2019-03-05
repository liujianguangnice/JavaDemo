package keven.com.singlemodel;

/**
 * author:81486
 * Data:2019/3/5 11:20
 * Description:
 * 懒汉式与饿汉式的根本区别在与，在类内，在方法外还是方法内创建自己的对象。
 * 并且声明对象都需要私有化，构造方法都要私有化，这样外部才不能通过 new 对象的方式来访问。
 *
 * 饿汉式的话是声明并创建对象(因为他饿)， private static SingletonHungry instance = new SingletonHungry();
 * 懒汉式的话只是声明对象，在调用该类的 getinstance() 方法时才会进行 new 对象。
 *
 *
 * 懒汉式（我需要面包你就给我new一个，类似懒加载，不需要时不加载），线程不安全，没有加线程锁synchronized,加锁会影响效率
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
