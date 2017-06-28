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
 * 用static关键字修饰的代码区域 
 * 可以完成类的初始化操作，在类声明时运行
 * 
 * ### 顺序 
 * 静态代码块--》非静态代码块--》构造方法--》成员方法 
 * 静态代码块会在非静态代码块之前运行
 * 构造方法在使用new关键字创建对象时，就会执行
 * 成员方法只有在被调用的时候才会执行
 * 
 */