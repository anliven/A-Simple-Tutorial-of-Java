package pers.anliven.learningjava.practices13;

import java.util.LinkedList;
import java.util.List;

public class P1301 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 100; i++) {
			list.add(new Integer(i));
		}
		list.remove(list.get(10));
		System.out.println("ok");

	}

}

// 将1~100之间的所有正整数存放在一个List集合中，并将集合中索引位置是10的对象从集合中移除。