package pers.anliven.learningjava.chapter10.objectoriented;

public class T01Animal { // 父类
	private String name;
	private int age;

	public T01Animal(String myName, int myAge) { // 父类Animal的构造方法
		name = myName;
		age = myAge;
		System.out.println("调用父类Animal的构造方法");
	}

	public void say() { // 父类成员方法
		System.out.println("我是" + age + "岁大的" + name);
	}

	public void eat() { // 父类成员方法
		System.out.println("正在进食");
	}

}
