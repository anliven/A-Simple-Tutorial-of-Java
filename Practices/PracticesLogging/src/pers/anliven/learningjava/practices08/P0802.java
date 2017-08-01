package pers.anliven.learningjava.practices08;

public class P0802 {

	public static void main(String[] args) {
		Character char1 = new Character('h');
		Character char2 = new Character('H');
		boolean b = char1.equals(char2);
		System.out.println(char1+"和"+char2+"是否相等："+b);
		Character char3 = Character.toLowerCase(char1);
		Character char4 = Character.toLowerCase(char2);
		boolean b2 = char3.equals(char4);
		System.out.println(char3+"和"+char4+"是否相等："+b2);
	}

}

// 创建两个Character对象，并通过equals()方法比较它们是否相等；
// 都转换为小写形式，再通过equals()方法比较它们是否相等。