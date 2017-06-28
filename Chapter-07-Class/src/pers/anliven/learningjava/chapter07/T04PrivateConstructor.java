package pers.anliven.learningjava.chapter07;

public class T04PrivateConstructor {

	private T04PrivateConstructor() { // 私有构造方法：private修饰构造方法
		System.out.println("调用私有构造方法");
	}

	static public T04PrivateConstructor mytest() { // 创建静态方法，返回本类实例对象
		return new T04PrivateConstructor();
	}

	public static void main(String[] args) {
		T04PrivateConstructor test = new T04PrivateConstructor();
		T04PrivateConstructor test2 = T04PrivateConstructor.mytest();
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