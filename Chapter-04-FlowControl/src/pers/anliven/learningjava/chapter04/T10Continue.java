package pers.anliven.learningjava.chapter04;

public class T10Continue {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue; // 执行下一次循环
			}
			System.out.println(i);
		}
	}

}

/*
 * 
 * continue执行下一次循环
 * continue支持标签功能，可以指定跳出的循环体
 * 
 */