package pers.anliven.learningjava.chapter13;

import java.util.*;

public class T02List {

	public static void main(String[] args) {

		// ArrayList实现类
		List<String> testList = new ArrayList<>(); // 声明为List类型，并通过ArrayList实现类来实例化
		testList.add("a"); // add()方法，将指定的对象添加到集合
		testList.add("a"); // 添加重复对象	
		testList.add("b");
		testList.add("c");
		testList.add("111");		
		System.out.println("获取指定索引位置的元素：" + testList.get(2)); // get()方法，获得指定索引位置的元素
		testList.set(3, "d"); // set()方法，将集合中指定索引位置的对象修改为指定的对象
		testList.remove(2); // remove()方法，将指定索引位置的元素从集合中移除
		System.out.println("是否包含指定元素：" + testList.contains("b")); // contains()方法，如果列表包含指定的元素则返回 true
		System.out.println("集合内容为：" + testList);
		System.out.println("指定元素的索引位置为：" + testList.indexOf("d")); // indexOf()方法，返回首次出现指定元素的索引
		System.out.println("遍历集合：");
		for (int j = 0; j < testList.size(); j++) { // for循环遍历集合
			System.out.println(testList.get(j));
		}

		// LinkedList实现类
		List<String> testList2 = new LinkedList<>(); // 声明为List类型，并通过LinkedList实现类来实例化集合
		for (int i = 0; i <= 5; i++) {
			testList2.add("test" + i);
		}
		System.out.println("集合的元素分别为：" + testList2);
		Collections.reverse(testList2); // 逆序排列
		System.out.println("逆序排列集合元素：" + testList2);
		Collections.shuffle(testList2); // 随机排列
		System.out.println("随机排列集合元素：" + testList2);
		Collections.sort(testList2); // 顺序排列
		System.out.println("顺序排列集合元素：" + testList2);
		System.out.println("获取指定元素的索引位置：" + Collections.binarySearch(testList2, "test2")); // 二分法查找

	}

}

/*### 列表（List）
- List是元素按照索引位置排序的有序集合，可以有重复元素
- 通过使用索引（元素在集合中位置）来访问元素，集合的索引也是从0开始
- List的常用实现类有ArrayList（数组序列，底层是由数组实现的）和LinkedList（链表）
- 列表在数据结构中分别表现为：数组和向量、链表、堆栈、队列
- 使用List集合时通常声明为List类型，然后通过不同的实现类来实例化集合

### get()和set()方法
- get()方法，获得指定索引位置的元素
- set()方法，将集合中指定索引位置的对象修改为指定的对象

### 常用实现类ArrayList和LinkedList的区别
- ArrayList类，基于动态数组的数据结构，可以保存所有元素（包括null），随机访问速度快，增删操作效率低
- LinkedList类，基于链表结构的数据结构，随机访问速度慢，增删操作效率高*/