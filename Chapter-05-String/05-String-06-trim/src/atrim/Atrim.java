package atrim;

public class Atrim {

	public static void main(String[] args) {
		//去除首尾空格
		String str = "  Hello world!  ";
		System.out.println("字符串内容：" + str + "\n" + "字符串原来的长度：" + str.length());
		System.out.println("去除首尾空格后的内容：" + str.trim() + "\n" + "去除首尾空格后的长度：" + str.trim().length());
	}

}

/* trim()方法 --- 去除字符串首尾的空格
 */