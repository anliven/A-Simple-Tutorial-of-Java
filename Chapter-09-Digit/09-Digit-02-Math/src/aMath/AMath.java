package aMath;

public class AMath {

	public static void main(String[] args) {

		// 数学常量
		System.out.println("Math.PI的值：" + Math.PI);
		System.out.println("Math.E的值：" + Math.E);

		// 三角函数方法
		System.out.println("90度的正弦值：" + Math.sin(Math.PI / 2));
		System.out.println("0度的余弦值：" + Math.cos(0));
		System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
		System.out.println("2的平方根与2商的反弦值：" + Math.asin(Math.sqrt(2) / 2));
		System.out.println("2的平方根与2商的反余弦值：" + Math.acos(Math.sqrt(2) / 2));
		System.out.println("1的反正切值：" + Math.atan(1));
		System.out.println("120度的弧度值：" + Math.toRadians(120.0));
		System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));

		// 指数函数方法
		System.out.println("e的平方值：" + Math.exp(2));
		System.out.println("以e为底2的对数值：" + Math.log(2));
		System.out.println("以10为底2的对数值：" + Math.log10(2));
		System.out.println("4的平方根值：" + Math.sqrt(4));
		System.out.println("8的立方根值：" + Math.cbrt(8));
		System.out.println("2的2次方值：" + Math.pow(2, 2));

		// 取整函数方法
		System.out.println("返回第大于等于参数的整数：" + Math.ceil(5.2));
		System.out.println("返回第小于等于参数的整数：" + Math.floor(5.2));
		System.out.println("返回与参数最接近的整数：" + Math.rint(2.5));
		System.out.println("将参数加上0.5后返回最接近的整数：" + Math.round(3.3f));
		System.out.println("将参数加上0.5后返回最接近的整数，并将结果强制转换为长整型：" + Math.round(3.3));

		// 最值，绝对值
		System.out.println("5和8中的较大者:" + Math.max(5, 8));
		System.out.println("5.5和5中的较小者：" + Math.min(5.5, 5));
		System.out.println("-8的绝对值：" + Math.abs(-8));

	}

}

/*
 * 
 * ### 数学运算
 * Math类中提供了众多static形式的数学方法，也提供了常用的数学常量 
 * 通过“Math.数学方法”形式调用 
 * 使用数学方法，需要特别注意参数值和返回值的数据类型和精确度 
 * 提供的常用数学常量其实是一个近似值
 * 
 * 更多信息信息可查阅JDK API文档：包java.lang ---》类 Math
 * 
 */