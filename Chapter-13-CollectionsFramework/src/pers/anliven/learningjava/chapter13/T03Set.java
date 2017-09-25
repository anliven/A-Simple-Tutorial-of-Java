package pers.anliven.learningjava.chapter13;

import java.util.*;

public class T03Set {

	public static void main(String[] args) {
		
		// HashSet实现类
		Set<String> testSet = new HashSet<String>(); // 声明为Set类型，并通过HashSet实现类来实例化
		testSet.add("AAA");
		testSet.add("EEE");
		testSet.add("kkk");
		testSet.add("111");
		testSet.add("333");
		System.out.println("未排序: " + testSet);
		System.out.println("遍历集合：");
		Iterator<String> it = testSet.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断是否有下一个元素
			String str = (String) it.next(); // 获取集合中元素
			System.out.println(str);
		}
		
		// TreeSet实现类
		TreeSet<String> testSet2 = new TreeSet<String>(testSet); // 声明为TreeSet类型，并通过TreeSet实现类来实例化
		System.out.println("已排序: " + testSet2);
		System.out.println("第一个元素: " + testSet2.first() + " 最后一个元素: " + testSet2.last());
		System.out.println("小于FFF的最大元素: " + testSet2.lower("FFF")); // 返回小于某元素的最大元素，注意FFF并不存在set中
		System.out.println("大于111的最小元素: " + testSet2.higher("111")); // 返回大于某元素的最小元素
		System.out.println("子集：" + testSet2.subSet("111", "EEE"));
		System.out.println("子集：" + testSet2.headSet("AAA")); // 返回小于某元素（不包括此元素）的子集
		System.out.println("子集：" + testSet2.tailSet("AAA")); // 返回大于某元素（包括此元素）的子集

	}

}

/*### 集（Set）
- Set是元素不按特定方式排序的无序集合，不能包含重复对象
- 常用实现类有HashSet（哈希集）和TreeSet
- 某些实现类能对set中的对象按特定方式排序，例如TreeSet类
- 对set中成员的访问和操作是通过set中对象的引用来进行，所以集中不能有重复对象

### 常用实现类HashSet和TreeSet的区别
- HashSet类，实现了Set接口，由哈希表支持，可以使用null元素
- TreeSet类，实现了Set接口和java.util.SortedSet接口，可以使用comparator()比较器对集合中的对象排序
- HashSet和TreeSet本质上分别是通过HashMap和TreeMap来实现*/