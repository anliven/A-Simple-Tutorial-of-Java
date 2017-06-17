package aBigDecimal;

import java.math.*;

public class ABigDecimal {

	public static void main(String[] args) {

		BigDecimal bigNumber = new BigDecimal(-7.5); // 实例化一个BigDecimal类的大数字对象

		System.out.println("加法操作：" + bigNumber.add(new BigDecimal("8.9")));
		System.out.println("减法操作：" + bigNumber.subtract(new BigDecimal("8.9")));
		System.out.println("乘法操作：" + bigNumber.multiply(new BigDecimal("8.9")));
		System.out.println("除法操作：" + bigNumber.divide(new BigDecimal("3.0")));

		System.out.println("取商：" + bigNumber.divideAndRemainder(new BigDecimal("3.0"))[0]);
		System.out.println("取余数：" + bigNumber.divideAndRemainder(new BigDecimal("3.0"))[1]);

		System.out.println("做2次方操作：" + bigNumber.pow(2));
		System.out.println("取相反数操作：" + bigNumber.negate());

	}

}

/*
 * 
 * ### 大数字操作类
 * 大数字操作类用于高精度计算；java.math.BigInteger类针对大整数；java.math.BigDecimal类针对大小数
 * 更详细信息可以查看JDK API文档：包java.math---》类 BigInteger 和 类BigDecimal
 * 
 * ### BigDecimal类 
 * 支持任意精度的定点数； 具有多种构造函数；提供众多操作方法 
 * 注意在除法除不尽的情况下，BigDecimal类divide()方法有多种设置来完成对末位小数点的处理
 * 
 */