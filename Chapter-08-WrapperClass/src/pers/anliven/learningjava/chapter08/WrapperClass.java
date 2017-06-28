package pers.anliven.learningjava.chapter08;

public class WrapperClass {

	public static void main(String args[]) {
		String str[] = { "11", "22", "33", "44", "55" };
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			int myint = Integer.parseInt(str[i]);// 将数组中的每个元素都转换为int型
			sum = sum + myint;
		}
		System.out.println("数组中的各元素之和是：" + sum);

		// Integer包装类的方法举例
		String str1 = Integer.toString(123); // 获取数字的十进制表示
		String str2 = Integer.toBinaryString(123); // 获取数字的二进制表示
		String str3 = Integer.toHexString(123); // 获取数字的十六进制表示
		String str4 = Integer.toOctalString(123); // 获取数字的八进制表示
		System.out.println("'123'的十进制表示为：" + str1);
		System.out.println("'123'的二进制表示为：" + str2);
		System.out.println("'123'的十六进制表示为：" + str3);
		System.out.println("'123'的八进制表示为：" + str4);

		// int类型转换为String类型
		int m = 456; // 定义int类型变量
		String n = Integer.toString(m); // toString()方法将int类型转换为String类型
		System.out.println("对象n类型为：" + n.getClass()); // getClass()方法获取对象的类型信息

		// 系统自动转换
		int x = 789;
		Integer y = x; // 系统自动转换基本数据类型和对应包装类
		System.out.println("对象y的类型为：" + y.getClass());

		// Integer包装类的常量
		int maxint = Integer.MAX_VALUE; // MAX_VALUE表示int型可取的最大值
		int minint = Integer.MIN_VALUE; // MIN_VALUE表示int型可取的最小值
		int intsize = Integer.SIZE; // SIZE表示以二进制补码形式表示int值的位数
		System.out.println("int类型可取的最大值是：" + maxint);
		System.out.println("int类型可取的最小值是：" + minint);
		System.out.println("int类型的二进制位数是：" + intsize);

		// Boolean包装类
		Boolean b1 = new Boolean(true); // 创建Boolean对象
		Boolean b2 = new Boolean("ok");
		System.out.println("b1：" + b1.booleanValue()); // 将此 Boolean
														// 对象的值作为基本布尔值返回
		System.out.println("b2：" + b2.booleanValue());

		// Character包装类
		Character mychar1 = new Character('A'); // 声明Character对象
		Character mychar2 = new Character('a');
		System.out.println(mychar1 + "是大写字母吗? " + Character.isUpperCase(mychar1)); // 判断是否为大写字母
		System.out.println(mychar2 + "是小写字母吗? " + Character.isLowerCase(mychar2)); // 判断是否为小写字母
	}

}

/*
 * 
 * ### 包装类 
 * java数据类型包含基本类型和引用类型
 * Java中不能定义基本数据类型对象，但每一种基本数据类型都有对应的类，统称为包装类(Wrapper Class)、数据类型类。 
 * 通过包装类可以将基本类型转换为对象来进行处理，并能连接相关的方法。可以理解为包装类提供了基本类型到引用类型的过渡。 
 * 包装类位于Java.lang包
 * 
 * 
 * ### 包装类的主要用途 
 * 对应地将基本类型转换为对象来进行处理 
 * 提供基本数据类型的相关属性和操作方法 
 * 方便数据类型之间的转化
 * 
 * 
 * ### 基本数据类型对应的包装类 
 * - int ---> Integer 
 * - long ---> Long 
 * - short ---> Short
 * - byte ---> Byte 
 * - double ---> Double 
 * - float ---> Float 
 * - boolean ---> Boolean
 * - char ---> Character
 * 
 * 
 * ### Number类 - 
 * 抽象类Number是 BigDecimal、BigInteger、Byte、Double、Float、Integer、Long和 Short 类的超类（父类）。 
 * Number的子类必须提供将表示的数值转换为 byte、double、float、int、long 和 short的方法。 
 * Number类的方法被Number的各子类所实现。
 * 
 * 
 * ### 系统自动转换 
 * JDK1.5之后引入“自动拆装箱”语法 
 * 系统将自动进行基本数据类型和对应包装类的转换，
 * 
 * 
 * ### Integer构造方法 
 * 以Intr型变量作为参数创建Integer对象。实例代码：Integer number=new Integer(7);
 * 以String型变量作为参数创建Integer对象。实例代码：Integer number=new Integer(“7”);
 * 
 * 
 * ### Integer常量 
 * 1. MAX_VALUE:表示int型可取的最大值
 * 2. MIN_VALUE:表示int型可取的最小值 
 * 3. SIZE：表示以二进制补码形式表示int值的位数 
 * 4. TYPE:表示基本类型Class实例
 * 
 * 
 * ### Integer常用方法 
 * Integer.parseInt()方法：将数字字符串转换为int数值 
 * Integer.toString()方法：将int类型转换为对应的String类型  
 * 
 * 
 * 更详细信息可以查看JDK
 * API文档：软件包java.lang---》类Integer
 * 
 */