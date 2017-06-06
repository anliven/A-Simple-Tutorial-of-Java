package astartsends;

public class Astartsends {

	public static void main(String[] args) {
		//判断字符串的开始与结尾
		String str = "We are students!";
		boolean s = str.startsWith("We");
		System.out.println("字符串是否以'We'开始：" + s);
		System.out.println("字符串是否以'!'结束：" + str.endsWith("!"));
	}

}

/* startsWith方法 --- 判断当前字符串是否以指定内容开始,返回值为boolean类型。
 * endsWith方法 --- 判断当前字符串是否以指定内容结束,返回值为boolean类型。
 */