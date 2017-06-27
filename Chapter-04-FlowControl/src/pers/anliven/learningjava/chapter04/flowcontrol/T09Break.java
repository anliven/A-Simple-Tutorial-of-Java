package pers.anliven.learningjava.chapter04.flowcontrol;

public class T09Break {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			if (i == 3) {
				break; // 跳出当前循环体
			}
		}
		System.out.println("---end---");

		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 5; j++) {
				if (j == 4) {
					break;
				}
				System.out.print("  >>>" + "i=" + i + ",j=" + j);
			}
		}
		System.out.println("  ---end---");

		Loop: for (int x = 1; x < 3; x++) { // 定义循环体的标签名
			for (int y = 1; y < 5; y++) {
				if (y == 4) {
					break Loop; // break语句可以跳出指定标签名的循环
				}
				System.out.print("  >>>" + "x=" + x + ",y=" + y);
			}
		}
		System.out.println("  ---end---");

	}

}

/*
 * 
 * 使用break语句可以跳出当前循环体， 从而中断当前循环。 
 * 对于嵌套循环，break语句只能跳出包含它的那一层循环。
 * 
 */