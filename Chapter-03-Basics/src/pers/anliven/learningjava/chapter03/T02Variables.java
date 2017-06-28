package pers.anliven.learningjava.chapter03;

public class T02Variables {

	static final double PI = 3.14; // 声明final变量PI作为成员变量并赋值
	static int age = 23; // 声明成员变量age并赋值
	static int times = 3; // 定义成员变量times并赋值

	public static void main(String[] args) {

		final int number; // 声明常量number
		number = 123; // 对常量进行赋值
		age = 20; // 再次对变量进行赋值

		System.out.println("常量PI的值为：" + PI);
		System.out.println("赋值后number的值为:" + number);
		System.out.println("int型变量age的值为：" + age);

		int times = 4; // 定义局部变量times
		System.out.println("times的值为：" + times);
	}

}

/*
 * 
 * ### 标识符
 * 标识符用来作为标识的有效字符序列，严格区分大小写。
 * 标识符由任意顺序的字母、下划线、美元符号和数字组成，并且第一个字符不能是数字。
 * 标识符不能是Java中的保留关键字。
 * 
 * ### 关键字
 * 关键字是Java语言中已经被赋予特定意义的单词或字符序列。
 * 
 * ### 声明变量
 * 变量的命名必须是合法的标识符
 * 变量命名遵循原则：必须是有效的标识符；变量名不能重复；应选择有意义的单词作为变量名
 * 不建议使用中文或其他语言文字作为变量名
 * 
 * ### 声明常量
 * 常量constant也被称为final变量
 * 常量在整个程序中只能被赋值一次
 * 当定义的final变量属于成员变量时，必须在定义时就赋值，否则将会编译出错
 * 
 * ### 变量的有效范围 
 * 也称为作用域，是指程序代码能够访问该变量的区域，超出该作用域，则会编译出错
 * 根据作用域的不同，变量可分为成员变量（包含静态变量、实例变量）和局部变量
 * 
 * 静态变量（全局变量，类变量）：使用 static关键字声明在类中,独立于方法之外的变量，是类的属性。
 * 实例变量：声明在类中,独立于方法之外的变量，不用static关键字修饰。
 * 局部变量：声明在类的方法中，是方法的属性，只在当前代码块中有效。
 * 
 * 可以“类名.静态变量”的方式在其他类中使用静态变量。
 * 
 * 局部变量可以与成员变量的名字相同，但在包含局部变量的代码块中，同名的成员变量将失效。
 * 
 */