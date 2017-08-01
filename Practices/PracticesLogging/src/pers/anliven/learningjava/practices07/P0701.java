package pers.anliven.learningjava.practices07;

class UseCase {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class P0701 extends UseCase {

	public static void main(String[] args) {
		UseCase u = new UseCase();
		u.setName("P0701");
		System.out.println(u.getName());

	}

}

// 编写一个类：
// 定义private成员变量；
// 定义两个成员方法，分别为此成员变量赋值和获取这个成员变量的值；
// 其他类继承该类时，能够获取该类成员变量的值。