package pers.anliven.learningjava.chapter07;

public class T09UseObject {

	// int i=47; //定义成员变量
	static int i = 47; // 定义静态成员变量,类的静态变量可以被类的所有对象共享

	public void call() { // 定义成员方法
		System.out.print("调用call()方法：");
		for (i = 0; i < 3; i++) { // 这里的i实际也调用了类的静态变量i
			System.out.print(i + " ");
			if (i == 2) {
				System.out.println("\n");
			}
		}
	}

	public T09UseObject() { // 定义构造方法
	}

	public static void main(String[] args) {
		T09UseObject t1 = new T09UseObject(); // 定义对象t1
		T09UseObject t2 = new T09UseObject(); // 定义对象t2
		t2.i = 60; // 不建议使用“对象.静态类成员”的方式调用静态成员
		System.out.println("实例对象t1调用变量i的结果：" + t1.i);
		t1.call();
		System.out.println("实例对象t2调用变量i的结果：" + t2.i);
		t2.call();
	}

}

/*
 * 
 * ### 对象的使用 
 * 使用“对象.类成员”来获取对象的属性和行为 
 * 注意这里的“类成员”一定不是private修饰的 
 * 
 * 不建议使用“对象.静态类成员”的方式调用静态成员，容易混淆静态成员和非静态成员。
 * 
 */