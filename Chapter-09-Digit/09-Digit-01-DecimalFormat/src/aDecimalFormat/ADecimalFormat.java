package aDecimalFormat;

import java.text.*; //导入java.text包中所有类

public class ADecimalFormat {

	// 使用实例化对象时设置格式化模式
	static public void sample1(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern); // 实例化DecimalFormat对象
		String output = myFormat.format(value); // 将数字进行格式化
		System.out.println("输入：" + value + " >格式化模板：" + pattern + " >输出：" + output);
	}

	// 使用applyPattern()方法对数字进行格式化
	static public void sample2(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(); // 实例化DecimalFormat对象
		myFormat.applyPattern(pattern); // 调用applyPatten()方法设置格式化模板
		System.out.println("输入：" + value + " >格式化模板：" + pattern + " >输出：" + myFormat.format(value));
	}

	static public void sample3(int pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(); // 实例化DecimalFormat对象
		myFormat.setGroupingSize(pattern); // 设置数字分组
		String output = myFormat.format(value);
		System.out.println("输入：" + value + " >分组大小：" + pattern + " >输出：" + output);
	}

	static public void sample4(double value) {
		DecimalFormat myFormat = new DecimalFormat(); // 实例化DecimalFormat对象
		myFormat.setGroupingUsed(false); // 设置不允许数字分组
		String output = myFormat.format(value);
		System.out.println("输入：" + value + " >输出：" + output);
	}

	public static void main(String[] args) {
		sample1("###,###.###", 123456.789);// 调用静态SimgleFormat()方法
		sample1("00000000.###kg", 123456.789); // 在数字后加上单位
		sample1("000000.000", 123.78); // 按照格式模板格式化数字，不存在的位以0显示

		sample2("#.###%", 0.789); // 将数字转换为百分数形式
		sample2("###.##", 123456.789); // 将小数点后格式化为两位
		sample2("0.00\u2030", 0.789); // 将数字转化为千分数形式

		sample3(2, 123456.789); // 将数字以每两个数字分组
		sample4(123456.789); // 不允许数字进行分组
	}

}

/*
 * 
 * ### 数字格式化
 * Java主要对浮点型数字进行数字格式化 - 使用java.text.DecimalFormat类格式化十进制数字
 * 格式化模板：在DecimalFormat类中使用一些特殊字符，使数字按照一定的字符规则进行匹配
 * 
 * 可以在实例化DecimalFormat对象时传递数字格式 - 也可以通过DecimalFormat对象的applyPattern()方法实现数字格式化
 * 
 * 如果数值绝对值大于0.001并且小于10000000，Java将以常规小数形式表示
 * 如果数据绝对值小于0.001或者大于10000000，Java将以科学计数法表示
 * 
 * setGroupingSize()方法设置格式化数字的分组大小 - setGroupingUsed()方法设置是否对数字进行分组操作
 * 
 * 更多信息可以查看JDK API文档：包java.text---》类 DateFormat
 * 
 */