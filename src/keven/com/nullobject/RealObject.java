package keven.com.nullobject;


import keven.com.nullobject.interf.DependencyBase;

/**
 *
 *  这是该对象的真实类，实现了业务行为接口DependencyBase。
 * */
public class RealObject implements DependencyBase{

    public RealObject() {
        System.out.println("RealObject创建");
    }

    @Override
    public void Operation() {
        System.out.println("我是真实对象对原对象的空实现");
    }


    @Override
    public boolean isNoll() {
        return false;
    }
}
