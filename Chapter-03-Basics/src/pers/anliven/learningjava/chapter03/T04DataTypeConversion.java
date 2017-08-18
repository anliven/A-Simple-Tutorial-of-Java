package pers.anliven.learningjava.chapter03;

public class T04DataTypeConversion {

	public static void main(String[] args) {

		// 隐式类型转换
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte型与float型数据进行运算结果为：" + (mybyte + myfloat));
		System.out.println("byte型与int型数据进行运算结果为：" + mybyte * myint);
		System.out.println("byte型与char型数据进行运算结果为：" + mybyte / mychar);
		System.out.println("double型与char型数据进行运算结果为：" + (mydouble + mychar));

		// 显式类型转换（强制类型转换）
		int a = (int) 123.123;
		long b = (long) 456.456F;
		float c = (float) 'v';
		System.out.println(">a值为：" + a + " >b值为：" + b + " >c值为：" + c);

	}

}

/*
 * 
 * ### 类型转换
 * 
 * 隐式类型转换：低级类型向高级类型转换，系统自动运行
 * byte《short《int《long《float《double
 * 隐式（自动）类型转换的条件：
 * -目标类型能与源类型兼容，如double型兼容int型，但是char型不能兼容int型
 * -目标类型长度大于源类型，如double类型长度为8字节，int类型为4字节，因此double类型变量可以直接存放int类型的数据
 * 
 * 显式类型转换（强制类型转换）：高精度变量的值赋值给低精度的变量
 * 语法：(类型名)待转换的值 
 * 执行显式类型转换时可能会导致精度丢失
 * 
 */