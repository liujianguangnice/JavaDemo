package keven.com.hashsetdemo;

import java.util.TreeSet;

/**
 * author:81486
 * Data:2019/3/4 16:37
 * Description:
 * <p>
 * Set集合不包含重复的元素，这是使用Set的主要原因。有三种常见的Set实现——HashSet, TreeSet和LinkedHashSet。什么时候使用它们，使用哪个是个重要的问题。总体而言，如果你需要一个访问快速的Set，你应该使用HashSet；当你需要一个排序的Set，你应该使用TreeSet；当你需要记录下插入时的顺序时，你应该使用LinedHashSet。
 * <p>
 * 1. Set接口
 * Set接口继承了Collection接口。Set集合中不能包含重复的元素，每个元素必须是唯一的。你只需将元素加入set中，重复的元素会自动移除。
 * <p>
 * 2. HashSet vs. TreeSet vs. LinkedHashSet
 * HashSet是采用hash表来实现的。其中的元素没有按顺序排列，add()、remove()以及contains()等方法都是复杂度为O(1)的方法。
 * <p>
 * TreeSet是采用树结构实现(红黑树算法)。元素是按顺序进行排列，但是add()、remove()以及contains()等方法都是复杂度为O(log (n))的方法。它还提供了一些方法来处理排序的set，如first(), last(), headSet(), tailSet()等等。
 * <p>
 * LinkedHashSet介于HashSet和TreeSet之间。它也是一个hash表，但是同时维护了一个双链表来记录插入的顺序。基本方法的复杂度为O(1)。
 */
public class HashSetDemo {
    TreeSet tree = new TreeSet();

}
