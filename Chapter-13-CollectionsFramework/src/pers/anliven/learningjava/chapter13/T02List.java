package pers.anliven.learningjava.chapter13;

import java.util.*;

public class T02List {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 声明为List类型，然后通过ArrayList实现类来实例化集合
		list.add("a"); // add()方法，将指定的对象添加到集合
		list.add("b");
		list.add("c");
		list.add("111");
		System.out.println("获取指定索引位置的元素：" + list.get(2)); // get()方法，获得指定索引位置的元素
		list.set(3, "d"); // set()方法，将集合中指定索引位置的对象修改为指定的对象
		list.remove(2); // remove()方法，将指定索引位置的元素从集合中移除
		System.out.println("集合中的元素分别为：");
		for (int j = 0; j < list.size(); j++) { // 循环遍历集合
			System.out.println(list.get(j));
		}
	}

}

/*### 列表（List）
- 有序集合。List中的元素按照索引位置排序，可以有重复元素
- 通过使用索引（元素在集合中位置）来访问元素，集合的索引也是从0开始
- List的常用实现类有ArrayList和LinkedList
- 列表在数据结构中分别表现为：数组和向量、链表、堆栈、队列
- 使用List集合时通常声明为List类型，然后通过不同的实现类来实例化集合

### get()和set()方法
- get()方法，获得指定索引位置的元素
- set()方法，将集合中指定索引位置的对象修改为指定的对象

### 常用实现类ArrayList和LinkedList的区别
- ArrayList类，实现了可变的数组，可以保存所有元素（包括null），随机访问速度快，增删操作效率低
- LinkedList类，采用链表结构保存对象，随机访问速度慢，增删操作效率高*/