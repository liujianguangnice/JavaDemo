package keven.com.nullobject;

import keven.com.nullobject.interf.DependencyBase;
import keven.com.nullobject.interf.Nullable;

/**
 * author:81486
 * Data:2019/1/24 18:09
 * Description:通过工厂调用方式来进行空对象的调用
 *
 *
 */
public class Factory {


    public static DependencyBase get(Nullable dependencyBase) {
        if (dependencyBase == null) {
            return new NullObject();
        }
        return new RealObject();
    }


}
