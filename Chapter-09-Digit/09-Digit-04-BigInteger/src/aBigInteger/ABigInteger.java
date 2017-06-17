package aBigInteger;

import java.math.*;

public class ABigInteger {

	public static void main(String[] args) {

		BigInteger bigNumber = new BigInteger("8"); // 实例化一个BigInteger类的大数字对象

		System.out.println("加法操作：" + bigNumber.add(new BigInteger("2")));
		System.out.println("减法操作：" + bigNumber.subtract(new BigInteger("2")));
		System.out.println("乘法操作：" + bigNumber.multiply(new BigInteger("2")));
		System.out.println("除法操作：" + bigNumber.divide(new BigInteger("2")));

		System.out.println("取商：" + bigNumber.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println("取余数：" + bigNumber.divideAndRemainder(new BigInteger("3"))[1]);

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
 * ### BigInteger类 
 * 支持任意大小的整数值； 具有多种构造函数；提供众多操作方法
 * 注意bigNumber.divideAndRemainder()方法，结果是以数组的形式返回，第一个值为做除法的商，第二个值为做除法的余数
 * 
 */