package pers.anliven.learningjava.chapter10;

abstract class AAA { // 抽象类
	public abstract void eat();
}

interface BBB { // 接口
	public void eat();
}

class CCC {
	protected void test() { // 这里test定义为protected方法
		System.out.println("调用CCC类的test方法");
	}
}

public class T10InnerClass {

	public static void main(String[] args) {

		// 抽象类实现匿名内部类
		AAA aaa = new AAA() { // 匿名内部类在new关键字后面，隐含实现一个接口或实现一个类。
			public void eat() {
				System.out.println("抽象类实现匿名内部类: 继承一个抽象类并且重写其方法");
			}
		}; // 注意这里有;字符
		aaa.eat();

		// 接口实现匿名内部类
		BBB bbb = new BBB() {
			public void eat() {
				System.out.println("接口实现匿名内部类: 实现一个或多个接口并且实现其方法");
			}
		};
		bbb.eat();

		// 其他用法
		new CCC() { // 使用匿名类继承CCC类
			void callParentTest() { // 在匿名类中定义方法callParentTest()
				super.test(); // 在这个callParentTest()方法内使用super调用父类的方法
			}
		}.callParentTest(); // 调用这个callParentTest()方法
		
	}

}

/*
### 匿名内部类
匿名内部类是没有名字，直接定义的内部类，只能继承抽象类或实现接口。
一般情况下，匿名内部类不需要增加额外的方法，只重写或实现继承的方法。


### 匿名内部类的实现方式
继承一个抽象类并且重写其方法，或者，实现一个或多个接口并且实现其方法。
只能创建匿名内部类的一个实例， 也就是说使用一次。
实现形式为“new <抽象类名或接口名>{<匿名类的实现代码>};”，创建一个匿名内部类的对象。

- 没有构造方法。
- 没有访问修饰符和static修饰符。
- 不能定义任何静态成员、方法和类。

- 局部内部类要访问外部的变量或对象的引用必须是用final修饰的。
- 因为匿名内部类为局部内部类，所以局部内部类的所有限制都对其生效。
- 匿名内部类可用来简化代码编写，常用于多线程的场景，因为实现多线程必须继承Thread类或是继承Runnable接口。


### class文件
匿名内部类编译完成后，将产生以“外部类名$序号”为名称的.class文件，序号以1~n排列，代表1~n个匿名内部类。


### This关键字
当在内部类中使用this关键字时，指的是内部类本身。
如果要访问外部类的成员，可通过“外部类.this.成员变量”和“外部类.this.成员方法”的形式。
*/