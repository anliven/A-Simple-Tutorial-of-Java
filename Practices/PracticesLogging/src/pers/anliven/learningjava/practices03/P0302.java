package pers.anliven.learningjava.practices03;

public class P0302 {

	static int age = 29;

	public void sample() {
		int age = 35;
		String name = "Anliven";
		System.out.println("sample():" + "Age:" + age + "Name:" + name);
	}

	public static void main(String[] args) {
		// System.out.println("Name:" + name); // 提示报错
		System.out.println("Age:" + age);
	}

}

// 声明成员变量age和局部变量name，比较两个变量的区别，并添加相应的注释。