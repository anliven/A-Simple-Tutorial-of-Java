package pers.anliven.learningjava.practices08;

public class P0803 {

	public static void main(String[] args) {
		
		Boolean b = new Boolean("ok");
		String str = b.toString();
		System.out.println("ok: " + str);
		
		Boolean b2 = new Boolean("true");
		String str2 = b2.toString();
		System.out.println("true: " + str2);
		
	}

}

// 通过字符型变量创建boolean值，然后将其转换成字符串输出；
// 观察输出后的字符串与创建boolean对象时给定的参数是否相同。