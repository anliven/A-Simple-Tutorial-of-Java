package pers.anliven.learningjava.chapter14;

public class T02CreateObject {

	public static void main(String[] args) {

		// 获取TestClass2类的一个对象tc2
		Class<?> tc3 = null;
		try {
			tc3 = Class.forName("pers.anliven.learningjava.chapter14.TestClass3"); // forName()方法
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 创建tc2对象所表示类的一个新实例to
		TestClass3 to = null;
		try {
			to = (TestClass3) tc3.newInstance(); // newInstance()方法 // 调用了无参数构造方法
		} catch (Exception e) {
			e.printStackTrace();
		}

		to.print(); // 调用TestClass2类的方法
	}
}

class TestClass3 {

	public void print() {
		System.out.println("This is a test!");
	}

	public TestClass3() {
		System.out.println("none-arg constructor");
	}
}

/*### 创建对象
获取类以后,利用newInstance创建类的对象.
java.lang.Class类的forName(String className)方法: 返回与带有给定字符串名的类或接口相关联的 Class 对象.
java.lang.Class类的newInstance()方法: 创建此 Class 对象所表示的类的一个新实例.*/
