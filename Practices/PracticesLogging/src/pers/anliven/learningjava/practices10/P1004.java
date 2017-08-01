package pers.anliven.learningjava.practices10;

public class P1004 {

	static class In {
		void test() {
			System.out.println("test()");
		}
	}

	public static void main(String args[]) {
		P1004.In t = new In();
		t.test();
	}

}

// 编写一个静态内部类，在主方法中创建内部类的实例。