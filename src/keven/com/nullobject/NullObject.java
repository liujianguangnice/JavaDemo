package keven.com.nullobject;


import keven.com.nullobject.interf.DependencyBase;

/**
*  这是空对象，对原有对象的行为进行了空实现。
* */
public class NullObject implements DependencyBase {

    @Override
    public void Operation() {
        System.out.println("我是空对象对原对象的空实现");
    }

    @Override
    public boolean isNoll() {
        return false;
    }
}
