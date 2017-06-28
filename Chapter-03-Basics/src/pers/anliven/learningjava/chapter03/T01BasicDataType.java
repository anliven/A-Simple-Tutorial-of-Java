package pers.anliven.learningjava.chapter03;

public class T01BasicDataType {

	public static void main(String[] args) {

		// 整数类型
		byte mybyte = 123; // 声明byte类型变量并赋值
		short myshort = 12345; // 声明short类型变量并赋值
		int myint = 1234567890; // 声明int类型变量并赋值
		int myint2 = 0123; // 声明int类型变量并八进制形式赋值
		int myint3 = 0x123; // 声明int类型变量并十六进制形式赋值
		long mylong = 1234567890123456789L; // 声明long类型变量并赋值
		long result = mybyte + myshort + myint + myint2 + myint3 + mylong;
		System.out.println("整数相加结果为：" + result);

		// 浮点类型
		float myfloat = 123.123f, myfloat2 = 123.123F; // 声明float类型变量并赋值
		double mydouble = 0.7d, mydouble2 = 0.11; // 声明double类型变量并赋值
		System.out.println("单精度浮点数相加结果为：" + (myfloat + myfloat2));
		System.out.println("双精度浮点数相加结果为：" + (mydouble + mydouble2));

		// 字符类型
		char myword = 'a'; // 定义char类型变量并赋值
		int mynumber = 12345; // 定义int类型变量并赋值
		System.out.println("字母a在unicode表中的顺序位置是：" + (int) myword);
		System.out.println("unicode表中的第12345位是：" + (char) mynumber);
		char mychar = '\\'; // 定义char类型变量并赋值“反斜杠字符”
		System.out.println("转义字符示例：" + mychar);

		// 布尔类型
		boolean myboolean = true; // 定义boolean类型变量并赋值
		if (myboolean) {
			System.out.println("布尔值作为判断条件");
		}
		boolean myboolean2 = (8 > 5); // 定义boolean类型变量并赋值
		System.out.println("布尔类型变量的值：" + myboolean2);

	}

}

/*
 * ### 基本数据类型 
 * Java的两大数据类型:基本数据类型（也称为内置数据类型）和引用数据类型。 
 * Java语言的基本数据类型有八种，分别为： 
 * - 数字类型（四个整数类型byte、short、int、long和两个浮点类型float、double。） 
 * - 字符类型char 
 * - 布尔型boolean。
 * 
 * ### 整数类型 
 * 用来存储整数数值，有3种表现形式：十进制、八进制和十六进制。 
 * 八进制必须以数字0开头；十六进制必须以0X或0x开头。 
 * 整数类型根据所占内存大小的不同，分为byte（8位内存空间）、short（16位）、int（32位）、long（64位）四种类型。 
 * 注意整数数据类型变量的取值范围，超出相应范围会报错。 
 * 对于long类型变量，如果赋值超过了int类型值的范围，则需要在数字后加字母“L或l”，表示该数值为长整数。
 * 
 * ### 浮点类型 
 * 根据所占内存大小的不同，分为单精度浮点类型float（32位内存空间）和双精度浮点类型double（64位内存空间）。 
 * float类型必须在小数后面添加字母“F或f”，否则系统会默认为double类型而报错。 
 * double类型可以不在小数后面添加字母“D或d”，因为系统默认将小数认为是double类型。 
 * 特别注意：Java中的简单浮点数类型float和double不能够进行运算，因为系统二进制无法精确表示浮点数。
 * 
 * ### 字符类型 
 * 字符类型char用于存储单个字符，占用16位内存空间。 
 * 使用char关键字定义字符型变量，并且必须以单引号表示。 
 * 依据unicode编码，可以通过显式转换的方式，把字符作为整数对待。 
 * 转义字符是以反斜杠“\”开头的一个或多个字符，表示特定的意义，不同于字符原有的意义。
 * 
 * ### 布尔类型
 * 使用boolean关键字定义布尔类型变量 
 * 布尔类型只有true和false两个值 
 * 布尔值不能与整数类型转换
 * 布尔类型通常被用在流程控制中作为判断条件
 * 
 */
