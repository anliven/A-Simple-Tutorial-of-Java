package pers.anliven.learningjava.practices10;

public abstract class P1002 {
	abstract void testAbstract();

	P1002() { // （1）首先执行父类构造方法
		System.out.println("before");
		testAbstract(); // 如果调用了抽象方法，调用子类覆盖的方法。这里调用子类的testAbstract（）方法
		System.out.println("after");
	}

	public static void main(String[] args) {
		new S1002(); // 实例化子类对象

	}

}

class S1002 extends P1002 {
	private int i = 1; // （2）使成员变量进行初始化

	void testAbstract() {
		System.out.println("testAbstract()： " + i);
	}

	public S1002() { // （3）调用子类构造方法
		System.out.println(i);
	}
}

// 编写一个子类和父类，分别创建构造方法，然后向父类和子类添加成员变量和方法，并总结创建子类对象的顺序。