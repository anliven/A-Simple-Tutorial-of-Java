package pers.anliven.learningjava.chapter10;

class OuterClass { // 外部类
	private int i;

	public OuterClass(int i) { // 外部类的构造方法
		this.i = i;
	}

	public void outGetI() { // 外部类的成员方法
		new PrivateInnerClass().printPrivateI();
		System.out.println("调用外部类的成员方法");
	}

	private class PrivateInnerClass { // private成员内部类
		public void printPrivateI() { // private成员内部类的成员方法
			System.out.println(i);
			System.out.println("调用private成员内部类的成员方法");
		}
	}

	public class PublicInnerClass { // public成员内部类
		private int i = 66666; // 成员内部类的成员和其外部类的成员重名，以成员内部类为准

		public void printPublicI() { // public成员内部类的成员方法
			System.out.println(i);
			System.out.println("调用public成员内部类的成员方法");
		}
	}

	private static final String str = "test";

	public static class staticInnerClass { // 静态内部类

		public void notStaticPrint() { // 静态内部类的非静态成员方法
			System.out.println("调用静态内部类的非静态成员方法-" + str);
		}

		public static void staticPrint() { // 静态内部类的静态成员方法
			System.out.println("调用静态内部类的静态成员方法-" + str);
		}
	}

}

public class T09InnerClass {

	public static void main(String[] args) {
		final int x = 12345;

		// 示例：成员内部类
		OuterClass testOuter = new OuterClass(x); // 生成外部类的实例对象
		testOuter.outGetI(); // 调用外部类的成员方法
		OuterClass.PublicInnerClass testInner = testOuter.new PublicInnerClass(); // 生成成员内部类的实例对象
		testInner.printPublicI();
		// OuterClass.PrivateInnerClass testPrivateInner = testOuter.new PrivateInnerClass(); // 提示错误，不可见

		// 示例：静态内部类
		OuterClass.staticInnerClass.staticPrint(); // 直接调用静态内部类的静态方法
		OuterClass.staticInnerClass testStaticInner = new OuterClass.staticInnerClass();
		testStaticInner.notStaticPrint(); // 通过静态内部类的实例对象调用非静态方法

		// 示例：局部内部类
		class PartClass { // 局部内部类，定义在main方法中
			public void printPart() { // 局部内部类的成员方法
				System.out.println("调用局部内部类的成员方法-" + x);
			}
		}
		PartClass testPartClass = new PartClass(); // 局部内部类的实例对象
		testPartClass.printPart(); // 调用局部内部类的成员方法

	}

}

/*
### 内部类
内部类是在一个类的内部再定义的类。
内部类分为四种：成员内部类、局部内部类、匿名内部类、静态内部类。
编译生成的class文件名称会区分外部类和内部类。


### 成员内部类
成员内部类依赖于外部类而存在，也就是说要创建成员内部类的对象，必须先创建一个外部类的对象。
成员内部类中不能定义静态方法。
成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
如果成员内部类的成员和其外部类的成员重名，则以成员内部类为准。
如果要访问外部类的同名成员，可通过“外部类.this.成员变量”和“外部类.this.成员方法”的形式。

在外部类中访问成员内部类的成员，必须先创建成员内部类的对象，再通过指向这个对象的引用来访问。
声明为public的成员内部类对外可见，也就是说外部可以调用public成员内部类的public方法。
声明为private的成员内部类对外不可见，也就是说外部不能调用private成员内部类的public方法。


### 静态内部类
静态内部类是用static修饰的内部类
静态内部类只能访问其外部类的静态成员与静态方法
访问静态内部类的静态方法，不需要通过实例对象，和普通的类一样，直接“.”出来。
访问静态内部类的非静态方法，必须通过一个静态内部类的实例对象。


### 特别注意实例化对象的区别
1. 成员内部类：外部类.内部类 xxx = 外部实例对象.new 内部类()
2. 静态内部类：外部类.内部类 xxx = new 外部类.内部类()


### 局部内部类
局部内部类是定义在一个方法或者特定作用域里面的类
局部内部类没有访问修饰符
局部内部类要访问外部的变量或对象的引用必须是用final修饰的
*/

