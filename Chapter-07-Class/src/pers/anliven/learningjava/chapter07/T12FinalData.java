package pers.anliven.learningjava.chapter07;

import static java.lang.System.*;

import java.util.*;

final class FinalClass { // final类
	int number = 99;
}

public class T12FinalData {

	final int VALUE_1 = 10; // final成员变量不可更改
	static final int VALUE_2 = 20; // 全局变量
	final int BLANK_VALUE; // 空白final变量

	public T12FinalData() { // 在构造方法中为空白final赋值
		BLANK_VALUE = 10000;

	}

	int test1(final int x) { // 设置final参数，不可改变参数x的值
		// x++; // 将会提示报错
		return x + 1;
	}

	final void test2() { // final方法
		final int i = 7; // 局部变量定义为final，不可改变i的值
		// i++; // 将会提示报错
		System.out.println(i);
	}

	static Random rand = new Random(); // 实例化一个Random类对象
	final int n1 = rand.nextInt(10); // 产生0~10之间的随机数赋予定义为final的n1
	static final int n2 = rand.nextInt(10); // 产生0~10之间的随机数赋予定义为static final的n2

	public static void main(String[] args) {

		T12FinalData data = new T12FinalData();

		// data.VALUE_1 = 30; // 将会提示报错
		// T12FinalData.VALUE_2 = 40; // 将会提示报错
		System.out.println(data.test1(200));
		data.test2();

		T12FinalData data1 = new T12FinalData(); // 实例化一个对象
		out.println("实例化对象调用n1的值：" + data1.n1); // 调用定义为final的n1
		out.println("实例化对象调用n2的值：" + data1.n2); // 调用定义为static final的n2

		T12FinalData data2 = new T12FinalData();
		out.println("重新实例化对象调用n1的值：" + data2.n1);
		out.println("重新实例化对象调用n2的值：" + data2.n2);
		
		FinalClass f = new FinalClass();
		f.number++;
		System.out.println(f.number);

	}

}

/*
 * 
 * ### final变量
 * 使用final关键字定义的数据（常量、对象引用、数组等），都被可以被改变。
 * final关键字定义的变量必须在声明的同时进行赋值操作。
 * 
 * 定义为final的对象引用只能指向唯一恒定地指向一个对象，不可以再指向其他对象，但一个对象本身的值却是可以改变的。
 * 如果要做到真正不可更改，可以声明为static final类型。
 * 
 * Java中全局常量，通常使用public static final修饰，在定义时必须同时赋值。
 * 
 * 
 * ### final方法
 * 定义为final的方法不能被重写，可以防止子类修改该类的定义与实现方式。
 * 执行效率高于非final方法，因为编译时已经静态绑定，不需要运行时再动态绑定。
 * 定义为private的方法隐式地被指定为final类型。
 * 
 * 
 * ### final类
 * 定义为final的类不能被继承。
 * final类中的方法不论是否有final修饰，都被认为是final类型。
 * 
 */
