package pers.anliven.learningjava.chapter07;

public class T03Test {

	public static void main(String[] args) {
		T03Access book = new T03Access();
		// book.showName("123"); //将会提示报错
		book.showName2("456");
		book.showName3("789");
	}

}

/*
 * 
 * ### 权限修饰符 
 * 使用private、protected和public关键字限定对类、类的成员变量、成员方法的访问。
 * private ： 本类
 * protected ：本类、同包其他类或子类
 * public ：本类、同包其他类或子类、其他包的类或子类
 * 
 */