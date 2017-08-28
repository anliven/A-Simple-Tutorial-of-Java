package pers.anliven.learningjava.chapter07;

public class T05StaticMethod {
	static public void show() { // 定义类的静态方法
		System.out.println("调用静态方法");
	}

	public static void main(String[] args) {
		T05StaticMethod.show(); // 通过“类.静态方法”的方式调用类的静态方法，无需创建类的对象
	}

}

/*
 * 
 * ### 静态方法 
 * 使用static修饰的方法，称为静态方法或类方法。
 * 以“类.静态方法”的方式调用，无需创建类的对象。
 * 
 * 在普通成员方法中，可以直接访问同类的静态变量和非静态变量；
 * 在静态方法中，可以直接调用同类中的静态成员，但不能直接调用非静态成员，需要通过对象来访问非静态方法；
 */
