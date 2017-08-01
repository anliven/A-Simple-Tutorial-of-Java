package pers.anliven.learningjava.practices05;

public class P0501 {

	public static void main(String[] args) {
		String str = new String("Hello Java!");
		String newstr = str.toLowerCase();
		String newstr2 = str.toUpperCase();
		System.out.println("转换小写：" + newstr);
		System.out.println("转换大写：" + newstr2);
	}

}

// 使用String的toUpperCase()方法和toLowerCase()方法来实现大小写的转换。