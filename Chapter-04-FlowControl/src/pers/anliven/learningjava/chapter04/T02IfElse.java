package pers.anliven.learningjava.chapter04;

public class T02IfElse {

	public static void main(String args[]) {
		int math = 100;
		int english = 100;

		if (math > 60) { // if...else语句
			System.out.println("数学及格");
		} else {
			System.out.println("数学没及格");
		}

		if (english > 60) { // if...else语句
			System.out.println("英语及格");
		} else {
			System.out.println("英语没及格");
		}

		int a = 123, b = 0, c = 0;
		if (a > 0)
			b = a;
		else
			b = -a;

		c = a > 0 ? a : -a; // 用三元运算符对语句进行简化
		System.out.println("a值为：" + a + " b值为：" + b + " c值为：" + c);
	}

}

/*
 * 
 * if..else语句可以使用三元运算符对语句进行简化，并且有一个返回值。
 * 
 */
