package pers.anliven.learningjava.chapter07;

public class T10CompareObject {

	public static void main(String[] args) {
		String str1 = new String("abc"); // new关键字调用构造方法创建String型对象str1，分配内存地址
		String str2 = new String("abc");
		// str1和str2是不同对象实体的引用，虽然内容相同，但内存地址不同
		System.out.println("str1==str2的运算结果为：" + (str1 == str2));
		System.out.println("str1.equals(str2)的运算结果为：" + (str1.equals(str2)));

		String str3 = str1; // 将str1对象引用赋予str3
		// str3和str1是同一个对象实体的不同的引用，内容相同，内存地址也相同，可以理解为str3和str1代表同一个对象实体。
		System.out.println("str1==str3的运算结果为：" + (str1 == str3));
		System.out.println("str1.equals(str3)的运算结果为：" + (str1.equals(str3)));
	}

}

/*
 * 
 * ### 对象比较 
 * equals()方法：比较两个对象引用的内容是否相等  
 * “==”运算符：比较两个对象引用的内存地址是否相等
 * 
 */