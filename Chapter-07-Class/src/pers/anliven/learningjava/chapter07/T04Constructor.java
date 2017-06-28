package pers.anliven.learningjava.chapter07;

public class T04Constructor {
	int number; // 声明成员变量

	public T04Constructor() { // 无参数构造方法
		this(456); // 使用this关键字调用本类的有参数构造方法。
		System.out.println("调用无参数构造方法，成员变量number此时的值为：" + number);
	}

	public T04Constructor(int x) { // 有参数构造方法
		this.number = x; // 使用this关键字调用本类的成员变量number
		System.out.println("调用有参数构造方法，参数值为：" + x + "成员变量number此时的值为：" + number);
	}

	public static void main(String[] args) {
		T04Constructor test = new T04Constructor();
		T04Constructor test2 = new T04Constructor(123);
	}

}

/*
 * 
 * ### 构造方法 
 * 与类同名，完成对象的创建和初始化 
 * 没有返回值，并且不需要使用void关键字修饰 
 * 一个类中可以存在多个构造方法
 * 
 * 实例化一个类的对象时，类会自动调用构造方法 
 * 在构造方法中可以为成员变量赋值
 * 
 * 如果没有定义构造方法，编译器会自动创建一个默认无参数的构造方法 
 * 如果已经定义了有参数的构造方法，那么创建对象时，就必须输入参数
 * 
 * ### 构造方法中的this关键字 
 * 1. this关键字代码必须放到第一行，否则会编译错误。 
 * 2. 只能通过this调用一次其他的构造方法。
 * 
 */