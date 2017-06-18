package abasics; //声明该类所在的包为abasics,package为包的关键字

import java.util.Date; //导入java.util包中的Date类，用来封装当前的日期和时间

public class Abasics { // 声明一个名为Abasics的public类

	static String str1 = "你好,"; // 在Basics类中声明并赋值一个名为str1的全局变量（成员变量）
	static final double PI = 3.14; // 声明常量PI并赋值，如不赋值则报错
	static int age = 23; // 声明成员变量age并赋值
	static int times = 3; // 定义成员变量times并赋值

	public static void main(String[] args) { // 声明main()方法
		String str2 = "Java!"; // 在main()方法中声明并赋值一个名为str2的局部变量
		System.out.println(str1 + str2); // 打印字符串

		Date nowtime = new Date(); // 初始化Date对象
		System.out.println("当前时间：" + nowtime.toString()); // 使用toString()函数显示日期时间

		final int number = 123; // 声明常量number并赋值
		age = 20; // 再次对变量age进行赋值
		int times = 4; // 定义局部变量times并赋值

		System.out.println("常量PI的值为：" + PI); 
		System.out.println("number的值为:" + number);
		System.out.println("age的值为：" + age);
		System.out.println("times的值为：" + times); 

	}

}

/*
 * 
 * ### 包声明 
 * 通过package关键字声明包
 * 
 * ### 导入API类库 
 * 通过import关键字导入相关的类.
 * 
 * ### 主方法 
 * main()方法是类体中的主方法，含有main()方法的类称为主类。该方法从“{”号开始，至“}”号结束。
 * main()方法是程序开始执行的位置。 
 * main()方法必须声明为"public static void"，分别是main()方法的权限修饰符、静态修饰符和返回值修饰符。 
 * "String[] args"是一个字符串类型的数组，是main()方法的参数。
 * 
 * ### 变量 
 * 全局变量（成员变量）：声明在类中,独立于方法之外的变量。全局变量是类的属性，也称为类变量，使用 static关键字声明。
 * 局部变量：声明在类的方法中，是方法的属性。 
 * 实例变量：独立于方法之外的变量，不用static关键字修饰。
 * 
 * ### 大小写 
 * Java是区分大小写的，并且代码中的所有标点符号都是英文字符。
 * 
 * ### 注释
 * 可读性第一，添加适量注释来提高程序的可读性和可维护性，注释一般占程序代码总量的20%~50%。
 * Java提供3种注释方法：单行注释，多行注释，文档注释。
 * 在多行注释中可以嵌套单行注释，但不可以嵌套多行注释。
 * 文档注释内容会被Javadoc文档工具读取作为Javadoc文档内容。
 * 
 */