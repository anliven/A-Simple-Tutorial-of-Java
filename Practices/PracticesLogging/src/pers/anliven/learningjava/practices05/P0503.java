package pers.anliven.learningjava.practices05;

public class P0503 {

	public static void main(String[] args) {
		String regex = "1[3578]\\d{9}";
		String text = "18602880000";
		if (text.matches(regex)) {
			System.out.println(text + "是合法的手机号");
		}
	}

}

// 使用正则表达式判断字符串是否为合法手机号码。