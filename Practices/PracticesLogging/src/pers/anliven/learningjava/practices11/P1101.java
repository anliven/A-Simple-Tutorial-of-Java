package pers.anliven.learningjava.practices11;

public class P1101 {

	public static int count(int m, int n) {
		return m * n;
	}

	public static void main(String[] args) throws Exception {
		try {
			int result = count(12315, 5787);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// 编写计算任意两个数相乘的方法,在主方法中使用try-catch语句捕获可能发生的异常。