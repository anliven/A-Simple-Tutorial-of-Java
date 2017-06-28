package pers.anliven.learningjava.chapter04;

public class T06DoWhile {

	public static void main(String args[]) {

		int a = 100;
		while (a == 60) { // while循环语句，先判断条件是否成立，再执行循环体
			System.out.println("ok1");
			a--;
		}

		int b = 100;
		do { // do...while循环语句，先执行一次循环后，再判断条件是否成立
			System.out.println("ok2");
			b--;
		} while (b == 60); // 注意，此处结尾有分号
	}

}