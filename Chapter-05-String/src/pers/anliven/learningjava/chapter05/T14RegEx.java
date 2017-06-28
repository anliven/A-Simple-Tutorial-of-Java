package pers.anliven.learningjava.chapter05;

public class T14RegEx {

	public static void main(String[] args) {
		// 正则表达式
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}"; // 定义要匹配正则表达式
		String str1 = "aaa@";
		String str2 = "aaaaaa";
		String str3 = "123456@abcd.def.com";
		if (str1.matches(regex)) { // 判断字符串变量是否与正则表达式匹配
			System.out.println(str1 + "是合法的E-mail地址格式");
		}
		if (str2.matches(regex)) {
			System.out.println(str2 + "是合法的E-mail地址格式");
		}
		if (str3.matches(regex)) {
			System.out.println(str3 + "是合法的E-mail地址格式");
		}
	}

}

/* 
 * 正则表达式多用于判断语句中，用来检查某一字符串是否满足特定的格式。
 * 
 * 元字符：正则表达式中用来匹配特定格式的字符串
 * 例如：正则表达式中“\\.”表示任意一个字符；“\\d”表示0-9的任何一个数字；“\\w”表示可用作标识符的字符，除了“$”
 * 
 * 可以使用方括号括起来的一组字符串 ，用来匹配特定格式的一个字符。
 * 例如：
 * [^123]代表1、2、 3之外的任何一个字符。
 * [a-f]代表a-f中的任何一个字母。
 * 
 * 限定修饰符：限定元字符出现的次数。
 * 例如：
 * “?”表示0次或1次； “*”表示0次或多次； “+”表示1次或多次
 * “{m}”表示正好出现m次；“{m,}”表示至少出现m次；“{m,n}”表示出现m~n次
 *
 * 特别注意转义字符“\”的使用。
 * 例如，表示普通意义的点字符“.”,必须使用转义字符“\”。
 * 
 */