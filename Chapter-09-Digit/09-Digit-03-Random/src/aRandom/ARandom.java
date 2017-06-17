package aRandom;

import java.util.*; //导入java.util包中所有类

public class ARandom {

	// 生成num1~num2之间的随机偶数
	public static int getEvenNum(double num1, double num2) {
		int n = (int) num1 + (int) (Math.random() * (num2 - num1)); // 产生num1~num2之间的随机数
		if (n % 2 == 0) { // 判断随机数是否为偶数
			return n;
		} else
			return n + 1; // 如果是奇数，将结果加1后返回
	}

	// 获取两个字符之间的随机字符
	public static char getRandomChar(char cha1, char cha2) {
		return (char) (cha1 + Math.random() * (cha2 - cha1 + 1));
	}

	public static void main(String[] args) {

		System.out.println("任意一个6~66之间的偶数：" + getEvenNum(6, 66));

		System.out.println("获取任意小写字符（a~z之间的随机字符）：" + getRandomChar('a', 'z'));
		System.out.println("获取任意大写字符（A~Z之间的随机字符）：" + getRandomChar('A', 'Z'));
		System.out.println("获取0到9任意数字字符：" + getRandomChar('0', '9'));

		Random r = new Random(); // 实例化一个java.util.Random类
		System.out.println("随机产生一个整数:" + r.nextInt());
		System.out.println("随机产生一个大于等于0小于10的整数：" + r.nextInt(10));
		System.out.println("随机产生一个布尔型的值：" + r.nextBoolean());
		System.out.println("随机产生一个双精度型的值：" + r.nextDouble());
		System.out.println("随机产生一个浮点型的值：" + r.nextFloat());
		System.out.println("随机产生一个概率密度为高斯分布的双精度值：" + r.nextGaussian());

	}

}

/*
 * 
 * ### 随机数
 * Math.random()方法可以生成大于等于 0.0且小于 1.0的 double值，也可以随机生成字符 -
 * Math.random()方法是以系统当前时间作为随机数生成器的参数，其返回值实际上经过复杂计算后得到的伪随机数
 * 
 * java.util.Random类提供了获取各种数据类型随机数的方法 通过实例化一个java.util.Random类的对象可以创建一个随机数生成器
 * 实例化一个java.util.Random类对象时，Java编译器以系统当前时间作为随机数生成器的种子 - 可以设置随机数生成器的种子
 * 更多信息信息可查阅JDK API文档：包java.util ---》类 Random
 * 
 */