package pers.anliven.learningjava.practices09;

import java.math.BigDecimal;

public class P0903 {

	static final int location = 10;

	public BigDecimal add(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2); // 调用加法方法
	}

	public BigDecimal sub(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.subtract(b2); // 调用减法方法
	}

	public BigDecimal mul(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.multiply(b2); // 调用乘法方法
	}

	public BigDecimal div(double value1, double value2) {
		return div(value1, value2, location); // 调用自定义除法方法
	}

	public BigDecimal div(double value1, double value2, int x) { // 自定义除法方法,商小数点后保留x位
		if (x < 0) {
			System.out.println("b值必须大于等于0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.divide(b2, x, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args) {
		P0903 b = new P0903();
		System.out.println("两个数字相加结果：" + b.add(-7.5, 8.9));
		System.out.println("两个数字相减结果：" + b.sub(-7.5, 8.9));
		System.out.println("两个数字相乘结果：" + b.mul(-7.5, 8.9));
		System.out.println("两个数字相除结果，结果小数后10位：" + b.div(-7.5, 8.9));
		System.out.println("两个数字相除结果，保留小数后5位：" + b.div(-7.5, 8.9, 5));
	}

}

// 编写一个类，包括任意两个Decimal类型数字的加、减、乘、除运算方法，并且以不同近似处理模式处理商的精度。