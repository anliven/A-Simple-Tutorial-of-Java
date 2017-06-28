package pers.anliven.learningjava.chapter07;

public class T04Test {

	public static void main(String[] args) {
		// Aconstructor05 test=new Aconstructor05(); //无法在本类外部使用，将会提示报错。
		T04PrivateConstructor test3 = T04PrivateConstructor.mytest(); // 创建对象，但不是以new实例化的方式创建对象
	}

}

/*
 * 
 * ### 私有构造方法 
 * 使用private关键字修饰的构造方法 
 * 无法在本类外部使用,也就无法使用new关键字实例化 
 * 可用来控制对象的生成
 * 
 */