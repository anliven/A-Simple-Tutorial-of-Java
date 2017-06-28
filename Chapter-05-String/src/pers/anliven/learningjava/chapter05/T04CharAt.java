package pers.anliven.learningjava.chapter05;

public class T04CharAt {

	public static void main(String[] args) {

		String str = "Hello world!";
		char mychar = str.charAt(6); // 获取指定索引位置的字符
		System.out.println("指定索引位置的字符为:" + mychar);
	}

}

/*
 * charAt()方法 --- 返回指定索引处的字符。
 * 
 */