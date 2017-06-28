package pers.anliven.learningjava.chapter05;

import java.util.Date; //导入Data类

public class T13Format {

	public static void main(String[] args) {
		Date date = new Date(); // 创建Data对象data

		// 日期格式化
		String year = String.format("%ty", date); // 日期格式化转换符"%ty"表示：2位年份。"%tY"表示：4位年份
		String month = String.format("%tm", date); // "%tm"表示：月份
		String day = String.format("%td", date); // "%td"表示：在月份中的第几天
		System.out.println("今天日期是：20" + year + "-" + month + "-" + day);

		// 时间格式化
		String hour = String.format("%tH", date); // 2位数字显示24小时制的小时数
		String minute = String.format("%tM", date); // 2位数字的分钟数
		String second = String.format("%tS", date); // 2位数字的秒数
		System.out.println("当前时间为：" + hour + ":" + minute + ":" + second);
		String timezone = String.format("%tZ", date); // 缩写形式显示时区
		System.out.println("当前时区为：" + timezone);
		String secondsum = String.format("%tQ", date); // 1970-01-01零时零分零秒到现在经过的毫秒数
		System.out.println("1970-01-01零时零分零秒到现在经过的毫秒数：" + secondsum);

		// 常见日期时间组合的格式化
		String nowday = String.format("%tF", date); // "%tF"表示：“年-月-日”格式，4位数字年份。
		String nowtime = String.format("%tT", date); // "%tT"表示：24小时制，显示“时：分：秒”。
		System.out.println("当前日期为：" + nowday);
		System.out.println("当前时间为：" + nowtime);
		String time = String.format("%tc", date); // "%tc"表示：全部的日期和时间信息
		System.out.println("全部的时间信息为：" + time);

		// 常规类型的格式化
		String str1 = String.format("%b", 5 > 9); // 结果被格式化为小写的布尔类型
		String str2 = String.format("%B", 8 > 6); // 结果被格式化为大写的布尔类型
		System.out.println("5大于9，正确吗：" + str1);
		System.out.println("8大于6，正确吗：" + str2);
		String str3 = String.format("%h", "ABC"); // 结果被格式化为小写的散列码，"%H"表示大写
		System.out.println("字符串ABC的散列码为：" + str3);
		String str4 = String.format("%s", 10 / 3); // 结果被格式化为小写的字符串类型，"%S"表示大写
		System.out.println("10/3的结果为：" + str4);
		String str5 = String.format("%x", 19); // 结果被格式化为小写的十六进制数，"%X"表示大写
		System.out.println("19转化十六进制数为：" + str5);
	}

}

/*
 * 了解常用格式化转换符、
 * 日期格式化转换符
 * 时间格式转换符
 * 日期时间组合的格式转换符
 * 常规类型转换符
 * 
 * "%tD"表示：“月/日/年”格式，4位数字年份
 * "%tR"表示：24小时制，显示“时：分”
 * 
 */