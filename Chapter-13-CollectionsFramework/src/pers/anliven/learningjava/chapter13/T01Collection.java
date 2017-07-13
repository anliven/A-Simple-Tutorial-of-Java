package pers.anliven.learningjava.chapter13;

import java.util.*;

public class T01Collection {

	public static void main(String[] args) {
		Collection<String> testList = new ArrayList<>(); // 声明为Collection类型，并通过ArrayList实现类来实例化
		testList.add("a"); // add()方法，将指定的对象添加到集合
		testList.add("b");
		testList.add("c");
		testList.add("111");
		testList.remove("b"); // remove()方法，将指定的对象从集合中移除
		System.out.println("当前集合：" + testList);
		System.out.println("当前集合是否为空：" + testList.isEmpty()); // isEmpty()方法，判断集合是否为空
		System.out.println("当前集合中元素的个数：" + testList.size()); // size()方法，获取集合中元素的个数
		System.out.println("遍历集合：");
		Iterator<String> it = testList.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断是否有下一个元素
			String str = (String) it.next(); // 获取集合中元素
			System.out.println(str);
		}

	}

}

/*### 集合
- 集合可以理解为是某一类对象（以某种方式组合到一起的一组对象）的通称。
- 对象的集合，指的是对象引用的集合，而不是对象的集合。
- 在Java集合中只存储引用，对象在集合之外。


### 集合与数组的区别
集合的长度可变，存放的都是对象的引用，而非对象本身。可在多数情况下使用。
数组的长度是固定的，存放的是基本类型的数据。不适合在对象数量未知的情况下使用。


### Java集合框架(Java Collections Framework)
Java集合框架是表示和操作集合的统一框架，包含接口、实现类以及算法。
常用的集合有3种：set(集）、list(列表）和map(映射)，都存放于java.util包中。
Set、List和Map都是接口，有各自的实现类。
Set与List继承了Collection接口；Map是独立的，和Collection接口没有关系。


### 常用接口简介
- Set: 无序的集合，不能包含重复的元素。实现类TreeSet能对元素按特定方式排序。
- List: 有序的集合，元素依据索引位置排序，可以包含重复的元素，按照索引可以访问元素。
- Map: 集合中存放键值对（key-value），键key不能重复，值value可以重复。实现类TreeMap可以根据键值进行排序。


### Collection接口
- 是最基本的集合接口，声明了集合中常通用的一些方法。
- 没有直接的实现类，因此不能直接使用。但子接口Set和List，有各自的实现类。
- 构成Collection的单位称为元素。


### Iterator接口
所有的集合类都实现了用于遍历集合元素的Iterator接口，主要方法包括：
- hasNext()：如果仍有元素可以迭代，则返回true
- next()：返回迭代的下一个元素
- remove()：删除当前元素
 

### 遍历集合的方法
1. 一般通过Iterator接口的iterator迭代器来实现
2. 利用Iterator的子接口ListIterator迭代器输出List中的内容
3. for循环和get()方法
4. foreach语句输出数组或集合


### 判断集合中的元素是否相等
- 调用equals()方法和hashcode()方法来判断
- 相等的对象应该有相等的hashcode
- 如果是自定义的类型，需要重写equals()方法和hashcode()方法*/