package pers.anliven.learningjava.chapter13;
import java.util.*;

public class T03Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("EEE");
		set.add("kkk");
		set.add("111");
		set.add("333");
		System.out.println("未排序: " + set);
		
		TreeSet<String> sortedSet = new TreeSet<String>(set);
		System.out.println("已排序: " + sortedSet);
		System.out.println("第一个元素: " + sortedSet.first() + " 最后一个元素: " + sortedSet.last());
		System.out.println("小于FFF的最大元素: " + sortedSet.lower("FFF")); // 返回小于某元素的最大元素，注意FFF并不存在set中
		System.out.println("大于111的最小元素: " + sortedSet.higher("111")); // 返回大于某元素的最小元素
		System.out.println("子集：" + sortedSet.subSet("111", "EEE"));
		System.out.println("子集：" + sortedSet.headSet("AAA")); // 返回小于某元素（不包括此元素）的子集
		System.out.println("子集：" + sortedSet.tailSet("AAA")); // 返回大于某元素（包括此元素）的子集

	}

}

/*### 集（Set）
- 无序集合。Set中的对象不按特定方式排序，不能包含重复对象
- 常用实现类有HashSet和TreeSet
- 某些实现类能对set中的对象按特定方式排序，例如TreeSet类
- 对set中成员的访问和操作是通过set中对象的引用来进行，所以集中不能有重复对象


# 常用实现类HashSet和TreeSet的区别
- HashSet类，有哈希表（实际上是一个HashMap实例）支持，可以使用null元素
- TreeSet类，实现了Set接口和java.util.SortedSet接口，可以使用比较器对集合中的对象排序*/