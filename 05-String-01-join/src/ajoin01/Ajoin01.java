package ajoin01;

public class Ajoin01 {

	public static void main(String args[]) {
		//字符串连接
		String s1 = new String("Hello");
		String s2 = new String("world!");
		String s = s1 + " " + s2; 
		System.out.println(s);
		
		//字符串多行书写
		System.out.println("I like "
				+ "Java");
		System.out.println("I like " +
		"Java");
		
	}

}

/* “+”运算符可以连接多个字符串，也可以将一句相连的字符串分开在两行上书写。
 */