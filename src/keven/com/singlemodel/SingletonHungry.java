package keven.com.singlemodel;

/**
 * author:81486
 * Data:2019/3/5 11:28
 * Description:饿汉式（需要面包一直在哪里），它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，
 *缺点：类加载时就初始化，浪费内存，容易产生垃圾对象。优点：没有加锁，执行效率会提高。
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry (){}
    public static SingletonHungry getInstance() {
        return instance;
    }
}
