package keven.com.nullobject.interf;



/**
 * Nullable是空对象的相关操作接口。因为在空对象模式中，对象为空会被包装成一个Object，
 * 成为Null Object，该对象会对原有对象的所有方法进行空实现
 * 这是一个使用范例，通过这种模式，我们不再需要进行对象的判空操作，而是可以直接使用对象，
 * 不必担心NPE（NullPointerException）的问题。
 *
 * */
public interface Nullable {
    boolean isNoll();
}
