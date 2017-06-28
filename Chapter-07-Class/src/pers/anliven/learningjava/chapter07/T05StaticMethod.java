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
 * 调用类的静态方法，无需创建类的对象。 
 * “类.静态方法”的方式调用。
 * 
 */
