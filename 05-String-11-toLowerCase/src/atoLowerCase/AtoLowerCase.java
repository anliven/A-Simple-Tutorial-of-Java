package atoLowerCase;

public class AtoLowerCase {

	public static void main(String[] args) {
		//字母大小写转换
		String str = new String("abc-888-DEF");
		String newstr1 = str.toLowerCase();
		String newstr2 = str.toUpperCase();
		
		System.out.println("原字符串为：" + str);
		System.out.println("小写转换后为：" + newstr1 + "\n" + "大写转换后为：" + newstr2);
	}

}

/* toLowerCase()方法 --- 将字符串转换为小写。
 * toUpperCase()方法 --- 将字符串转换为大写。
 * 大小写转换时，数字或非字符不受影响。
 */