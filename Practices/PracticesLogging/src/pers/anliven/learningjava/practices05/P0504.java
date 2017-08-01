package pers.anliven.learningjava.practices05;

public class P0504 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("StringBuilder test ");
		for (int i = 1; i <= 10; i++) {
			str.append(i);
		}
		System.out.println(str.toString());
	}

}

// 使用字符串生成器，将字符串str追加数字1~10。