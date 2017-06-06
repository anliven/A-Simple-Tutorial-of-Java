package areplace;

public class Areplace {

	public static void main(String[] args) {
		//字符串替换
		String str = "address";
		String newstr1 = str.replace("a", "A");
		System.out.println("替换字符a, 原字符串为：" + str + "\n" + "替换后的字符串为：" + newstr1);
		
		String newstr2 = str.replace("b", "B");
		System.out.println("替换字符b，原字符串为：" + str + "\n" + "替换后的字符串为：" + newstr2);
		
		String newstr3 = str.replace("d", "D");
		System.out.println("替换字符d, 原字符串为：" + str + "\n" + "替换后的字符串为：" + newstr3);
	}

}

/* replace()方法 --- 将指定字符或字符串替换成新的字符或字符串。 
 * 如果被替换的内容不存在，则将原字符返回。
 * 如果被替换的内容都会被更新为新内容。
 */