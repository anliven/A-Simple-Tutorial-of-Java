package pers.anliven.learningjava.practices10;

public class P1005 {

	enum Constants {
		AAA, BBB
	}

	public static void test(Constants c) {
		switch (c) {
		case AAA:
			System.out.println("test() AAA");
			break;
		case BBB:
			System.out.println("test() BBB");
			break;
		}
	}

	public static void main(String[] args) {
		P1005.test(Constants.AAA);
		P1005.test(Constants.BBB);
	}

}

// 定义一个枚举类型，使用switch语句获取枚举类型的值。