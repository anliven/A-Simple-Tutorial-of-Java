package pers.anliven.learningjava.practices07;

public class P0703 {

	public static void main(String[] args) {
		int lengh = args.length;
		if (lengh == 0) {
			System.out.println("无运行参数");
		} else {
			for (int i = 1; i <= args.length; i++) {
				System.out.println(i);
			}
		}
	}

}

// 根据运行参数的个数决定循环打印变量i值的次数。