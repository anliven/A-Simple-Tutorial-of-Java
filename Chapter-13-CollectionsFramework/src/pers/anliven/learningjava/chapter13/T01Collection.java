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
- 在Java集合中只存储对象的引用，对象在集合之外。


### 集合与数组的区别
- 集合的长度可变的，存放的都是对象的引用，而非对象本身。可以通过任意类型查找所映射的具体对象。可在多数情况下使用。
- 数组的长度是固定的，存放的是基本类型数据。只能通过类型固定的下标访问元素。不适合在对象数量未知的情况下使用。


### Java集合框架(Java Collections Framework)
Java集合框架是表示和操作集合的统一框架，包含接口、接口的实现类以及工具类，都存放于java.util包中。
具体信息可查看API文档。

Collection接口
- 是最基本的集合接口，声明了集合中常通用的一些方法，定义增删改查的操作。
- 没有直接的实现类，因此不能直接使用。但子接口Set和List，有各自的实现类。
- 构成Collection的单位称为元素。
- List子接口: 序列，有序的集合，元素依据索引位置排序，可以包含重复的元素，按照索引可以精确操作元素。
- Queue子接口 ：队列，存储的元素是排列有序，可以重复。不常用。
- Set子接口: 集，无序的集合，不能包含重复的元素。实现类TreeSet能对元素按特定方式排序。

Map接口
- Map接口是独立的，和Collection接口没有关系。
- 键值对，集合中存放键值对（key-value），键key不能重复，值value可以重复。实现类TreeMap可以根据键值进行排序。

工具类
- java.util.Collections工具类，包含操作集合对象的各种方法。

Comparable接口
- 实现该接口表示：类的实例可以比较大小，可以进行自然排序
- 定义默认的比较规则
- 其实现类需要实现compareTo()方法
- compareTo()方法返回正数表示大，负数表示小，0表示相等

Comparator接口
- 定义临时的比较规则
- 其实现类需要实现compare方法


### Iterator接口
所有的集合类都实现了用于遍历集合元素的Iterator接口，主要方法包括：
- hasNext()：如果仍有元素可以迭代，则返回true
- next()：返回迭代的下一个元素
- remove()：删除当前元素
 

### 遍历集合的方法
1. 一般通过Iterator接口的iterator迭代器来实现
2. 利用Iterator的子接口ListIterator迭代器输出List中的内容
3. for循环和get()方法
4. for-each语句输出数组或集合


### 判断集合中的元素是否相等
- 调用equals()方法和hashcode()方法来判断
- 相等的对象应该有相等的hashcode
- 如果是自定义的类型，需要重写equals()方法和hashcode()方法*/