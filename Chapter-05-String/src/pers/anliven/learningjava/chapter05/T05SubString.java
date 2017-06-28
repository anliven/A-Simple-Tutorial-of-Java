package pers.anliven.learningjava.chapter05;

public class T05SubString {

	public static void main(String[] args) {
		// 获取子字符串
		String str = "Hello world!";
		String substr1 = str.substring(5);
		System.out.println("指定索引位置开始到结尾的内容为" + substr1);

		String substr2 = str.substring(0, 5);
		System.out.println("指定索引位置之间的内容为：" + substr2);
	}

}

/*
 * substring()方法 --- 利用字符串的下标对字符串进行截取。 字符串的下标从0开始。
 * 
 */
