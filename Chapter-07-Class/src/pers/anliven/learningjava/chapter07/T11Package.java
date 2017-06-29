package pers.anliven.learningjava.chapter07; // package关键字指定包名

import java.util.Date; // import 关键字，导入java.util包中的Date类，用来封装当前的日期和时间
//import java.util.*; // import 关键字，导入java.util包中的所有类
import static java.lang.Math.max; // 导入静态成员方法
import static java.lang.Math.PI; // 导入静态成员变量
import static java.lang.System.out;

public class T11Package {

	public static void main(String[] args) { // 声明main()方法

		Date nowtime = new Date(); // 初始化Date对象
		System.out.println("当前时间：" + nowtime.toString()); // 使用toString()函数显示日期时间
		
		out.println("5和8的较大值为：" + max(5,8)); // 直接使用已经导入的静态成员
		out.println("PI值为：" + PI); // 直接使用已经导入的静态成员
		
	}

}

/*
 * ### 类包 
 * 类包是Java中管理类文件的机制，不同的类放置在对应的类包中
 * 在类中使用package关键字指定包名，package表达式必须是程序的第一行非注释代码 
 * Java包的名称必须全部使用小写字母
 * 
 * 一个完整的类名是包名和类名的组合。 
 * 每个类都隶属于一个类包，同一类包中的类必须不同名，就可以有效避免同名类冲突。
 * 同一个包中的类互相访问时，可以不指定包名。
 * 
 * 为保障每个Java Package命名的唯一性，避免包名冲突，一般使用具有唯一性的域名作为包名称的前缀。
 * 
 * ### 导入包 
 * 使用import关键字导入包，可以导入指定包中具体的类，也可以使用*字符导入指定包中的所有类。
 * 如果指定包中有子包，需要单独引用子包里的类。
 * 在程序中，如果使用其他包中的同名类，则必须指定完整的全名格式类名。
 * 
 * ### 导入静态成员
 * 使用import static关键字导入静态成员
 * 
 */