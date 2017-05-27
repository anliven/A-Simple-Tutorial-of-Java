package basics;    //声明该类所在的包为basics,package为包的关键字
import java.util.Date;    //导入java.util包中的Date类，用来封装当前的日期和时间

public class Basics {    //声明一个名为Basics的public类

	static String str1 = "你好,";    //在Basics类中声明并赋值一个名为str1的全局变量（成员变量）
	static final double PI = 3.14;    // 声明常量PI并赋值，如不赋值则报错
	static int age = 23; // 声明成员变量age并赋值
	static int times = 3; // 定义成员变量times并赋值

	public static void main(String[] args) {    //声明main()方法
		String str2 = "Java!";    //在main()方法中声明并赋值一个名为str2的局部变量
		System.out.println(str1 + str2);    //打印字符串
		
	    Date nowtime = new Date();    //初始化Date对象
	    System.out.println("当前时间："+nowtime.toString());    //使用toString()函数显示日期时间
	    
		final int number = 123; // 声明常量number并赋值
		age = 20; // 再次对变量age进行赋值
		int times = 4; // 定义局部变量times并赋值
		
		System.out.println("常量PI的值为：" + PI); // 将PI的值输出
		System.out.println("number的值为:" +number);//将number的值输出
		System.out.println("age的值为：" + age); // 将age的值输出
		System.out.println("times的值为：" + times); // 将times的值输出

	}

}


//#### 包声明
//通过package关键字声明包

//#### 导入API类库
//通过import关键字导入相关的类.

//#### 主方法
//main()方法是类体中的主方法。该方法从“{”号开始，至“}”号结束。main()方法是程序开始执行的位置。
//main()方法必须声明为"public static void"，它们分别是main()方法的权限修饰符、静态修饰符和返回值修饰符。
//"String[] args"是一个字符串类型的数组，是main()方法的参数。

//#### 变量
//全局变量（成员变量）：声明在类中，独立于方法之外的变量。全局变量是类的属性，也称为类变量，使用 static关键字声明。
//局部变量：声明在类的方法中，是方法的属性。
//实例变量：独立于方法之外的变量，不用static关键字修饰。

