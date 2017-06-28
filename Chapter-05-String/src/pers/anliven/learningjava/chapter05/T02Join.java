package pers.anliven.learningjava.chapter05;

public class T02Join {

	public static void main(String args[]) {
		// 字符串连接
		String s1 = new String("Hello");
		String s2 = new String("world!");
		String s = s1 + " " + s2;
		System.out.println(s);

		// 字符串多行书写
		System.out.println("I like " + "\n" + "Java");  // 转义字符换行
		System.out.println("I like " + "Java");

		// 连接其他数据类型
		int booktime = 1;
		float practice = 1.5f;
		System.out.println("每天" + booktime + "小时看书；" 
		+ practice + "小时练习"); // 将字符串、整型、浮点型变量相连接，并输出结果

		// 运算符优先级
		System.out.println("每天" + booktime + "小时看书；" + (practice + booktime) + "小时练习"); // 将字符串、整型、浮点型变量相连接，并输出结果
	}

}

/*
 * “+”运算符可以连接多个字符串，也可以将一句相连的字符串分开在两行上书写。
 * 字符串连接其他数据类型，会自动调用toString()方法，将其他类型数据转换成字符串形式，然后参与连接。 
 * 字符串连接，遵守运算符优先级。
 * 
 */
