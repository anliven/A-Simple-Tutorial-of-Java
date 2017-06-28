package pers.anliven.learningjava.chapter05;

public class T10CompareTo {

	public static void main(String[] args) {
		// 按照字典顺序比较字符串
		String str1 = new String("abc");
		String str2 = new String("def");
		String str3 = new String("abc");

		System.out.println("str1内容为：" + str1 + "\n" + "str2内容为：" + str2 + "\n" + "str3内容为：" + str3 + "\n");

		System.out.println("str1对比str2结果为：" + str1.compareTo(str2));
		System.out.println("str2对比str1结果为：" + str2.compareTo(str1));
		System.out.println("str1对比str3结果为：" + str1.compareTo(str3));
	}

}

/*
 * compareTo()方法 --- 基于字符串中各个字符的Unicode值，比较两个字符串。 
 * 小于，则返回一个负整数； 
 * 大于，返回一个正整数；
 * 相等，返回0，此时则表明两个字符串具有相同的字符和长度，也就是说若使用equals()方法则返回true。
 * 
 * compareToIgnoreCase()方法 --- 忽略大小写后，基于字符串中各个字符的Unicode值，比较两个字符串。
 * 
 */