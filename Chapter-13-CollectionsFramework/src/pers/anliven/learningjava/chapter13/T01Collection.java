package pers.anliven.learningjava.chapter13;

import java.util.*;

public class T01Collection {

	public static void main(String[] args) {
		Collection<String> testList = new ArrayList<>(); // 实例化集合类对象
		testList.add("a"); // add()方法，将指定的对象添加到集合
		testList.add("b");
		testList.add("c");
		testList.add("111");
		testList.remove("b"); // remove()方法，将指定的对象从集合中移除
		System.out.println("当前集合：" + testList);
		System.out.println("当前集合是否为空：" + testList.isEmpty()); // isEmpty()方法，判断集合是否为空
		System.out.println("当前集合中元素的个数：" + testList.size()); // size()方法，获取集合中元素的个数
		Iterator<String> it = testList.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断是否有下一个元素
			String str = (String) it.next(); // 获取集合中元素
			System.out.println(str);
		}

	}

}

/*### 集合
- 集合可以理解为是某一类对象（以某种方式组合到一起的一组对象）的通称。
- 对象的集合，指的是对象引用的集合而不是对象的集合。
- 在Java集合中只存储引用，对象在集合之外。


### Java集合框架(Java Collections Framework)
Java集合框架是表示和操作集合的统一框架，包含接口、实现类以及算法。
常用的集合有3种：set(集）、list(列表）和map(映射)，都存放于java.util包中。
Set、List和Map都是接口，有各自的实现类。其中Set与List继承了Collection接口。


### 集合与数组的区别
集合的长度可变，存放的都是对象的引用，而非对象本身。可在多数情况下使用。
数组的长度是固定的，存放的是基本类型的数据。不适合在对象数量未知的情况下使用。


### Collection接口
- Collection接口是集合继承树中最顶层的接口，声明了集合中常通用的一些方法。
- 构成Collection的单位称为元素。
- Collection接口通常不能直接使用。
- 遍历集合通常通过迭代器iterator()来实现。*/