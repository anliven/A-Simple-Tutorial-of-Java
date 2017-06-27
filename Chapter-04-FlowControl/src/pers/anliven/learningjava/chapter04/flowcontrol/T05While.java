package pers.anliven.learningjava.chapter04.flowcontrol;

public class T05While {

	public static void main(String args[]) {
		int x = 1;
		int sum = 0;
		while (x <= 10) { // while循环语句，先判断条件是否成立，再执行循环体
			sum = sum + x;
			x++;
		}
		System.out.println("sum = " + sum);
	}

}