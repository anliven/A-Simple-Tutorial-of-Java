package pers.anliven.learningjava.chapter07;

public class T05StaticCodeBlock {

	{ // 定义非静态代码块
		System.out.println("调用非静态代码块");
	}

	static { // 定义静态代码块
		System.out.println("调用静态代码块");
	}

	public T05StaticCodeBlock() { // 定义构造方法
		System.out.println("调用构造方法");
	}

	public void method() { // 定义成员方法
		System.out.println("调用成员方法");
	}

	public static void main(String[] args) { // 主方法
		T05StaticCodeBlock test = new T05StaticCodeBlock(); // 构造方法在使用new关键字创建对象时，就会执行
		// test.method(); //成员方法只有在被调用的时候才会执行
	}

}

/*
 * 
 * ### 静态代码块 
 * 用static关键字修饰的代码区域，被称为静态初始化块
 * 可以完成类的初始化操作，在类声明时运行
 * 
 * ### 顺序 
 * 静态代码块--》非静态代码块--》构造方法--》成员方法 
 * 静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量
 * 构造方法在使用new关键字创建对象时，就会执行
 * 成员方法只有在被调用的时候才会执行
 * 
 */