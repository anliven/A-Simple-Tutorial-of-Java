package pers.anliven.learningjava.practices13;

import java.util.LinkedList;
import java.util.List;

public class P1301 {

	public static void main(String[] args) {
		
		List<Integer> test = new LinkedList<>();
		for (int i = 1; i <= 10; i++) {
			test.add(new Integer(i));
		}
		
		System.out.print("遍历集合：");
		for (int i = 0; i < test.size(); i++) {
			System.out.print("-" + test.get(i));
		}
		System.out.println();
		
		System.out.println("移除前，索引位置是5的元素为：" + test.get(5));
		test.remove(test.get(5));
		System.out.println("移除后，索引位置是5的元素为：" + test.get(5));

	}

}

// 将1~10之间的所有正整数存放在一个List集合中，并将集合中索引位置是5的对象从集合中移除。