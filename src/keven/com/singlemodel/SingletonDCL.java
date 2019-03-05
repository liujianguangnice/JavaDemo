package keven.com.singlemodel;

/**
 * author:81486
 * Data:2019/3/5 11:34
 * Description:  懒汉式，双检锁/双重校验锁（DCL，即 double-checked locking）
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class SingletonDCL {
    private volatile static SingletonDCL singleton;
    private SingletonDCL (){}
    public static SingletonDCL getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDCL.class) {
                if (singleton == null) {
                    singleton = new SingletonDCL();
                }
            }
        }
        return singleton;
    }

}
