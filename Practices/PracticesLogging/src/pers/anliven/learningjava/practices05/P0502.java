package pers.anliven.learningjava.practices05;

public class P0502 {

	public static void main(String[] args) {
		String str = new String("Hello world!");
		String str2 = new String("Hello Java!");
		String newstr = str.substring(1, 5);
		String newstr2 = str2.substring(1, 5);
		if (newstr.equalsIgnoreCase(newstr2)) {
			System.out.println("子字符串相同");
		} else {
			System.out.println("子字符串不相同");
		}
	}

}

// 分别截取两个字符串的部分内容，然后忽略大小写比较，如果相同则输出“子字符串相同”，否则输出“子字符串不同”。