package pers.anliven.learningjava.chapter14;

public class T01getName {

	public static void main(String[] args) {

		TestClass tc = new TestClass(); // 创建TestClass实例
		tc.print();
		
		// 获取对象的类型名称
		System.out.println(tc.getClass()); // getClass()方法
		System.out.println(tc.getClass().getName()); // getName()方法
	}
}

class TestClass {
	public void print() {
		System.out.println("This is a test!");
	}

}

/*### 反射(Reflection)
反射能够让运行在JVM的程序检测和修改运行时的行为,在运行状态中，对于任意一个类或对象,都能够获取其方法和属性.
通过反射机制,还可以完成反编译(从.class逆向到.java).
反射是框架中常用的方法.


### Class对象
在Java中,一切皆对象. 可以简单理解为有两种对象：实例对象和Class对象.
实例对象可以利用new关键字得到,而Class对象是JVM生成,用来保存对应类的信息.

在一个类被编译成.class时，编译器同时也创建了一个对应的Class对象并保存在.class文件中.
JVM的类加载机制，在需要的时候(懒加载)将.class文件和对应的Class对象加载到内存中.

所有的Class对象其实都是类java.lang.Class的实例, 因此可以把Class对象看成一般的实例对象.


### getClass()方法与getName()方法
继承自java.lang.Object的getClass()方法: 返回此 Object 的运行时类.
java.lang.Class的getName()方法: 以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称.*/