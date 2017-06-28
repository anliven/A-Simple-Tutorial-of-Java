package pers.anliven.learningjava.chapter04;

public class T07For {

	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) { // 注意这里“i++”是循环后的操作表达式
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println("2到100之间的所有偶数之和为：" + sum);

		for (;;) {
			System.out.println("利用for循环的特殊语法格式，实现无限循环");
			break; // 通过break语句跳出无限循环
		}

	}

}

/*
 * 
 * for循环用来重复执行某条语句，直到某个条件得到满足。
 * 
 */