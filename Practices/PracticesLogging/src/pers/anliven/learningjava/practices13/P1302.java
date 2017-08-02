package pers.anliven.learningjava.practices13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1302 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // HashSet是Set的子接口
		set.add("a");
		set.add("c");
		set.add("A");
		set.add("a");
		set.add("C");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("A");
		list.add("a");
		list.add("C");
		System.out.println(set);
		System.out.println(list);
	}

}

// 分别向Set集合和List集合中添加"A,a,c,C,a"5个元素，观察重复值“a”能否重复在List集合和Set集合中添加。