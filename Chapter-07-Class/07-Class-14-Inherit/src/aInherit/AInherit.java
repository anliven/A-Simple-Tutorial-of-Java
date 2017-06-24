package aInherit;

class Tiger extends Animal { // extends关键字，子类继承父类
	public Tiger(String myName, int myAge) { // 子类构造方法
		super(myName, myAge); // super关键字，调用父类构造方法
		System.out.println("调用子类Tiger的构造方法");
	}

	public void run() { // 新增方法
		System.out.println("喜欢奔跑");
	}

	public void eat() { // 重写父类方法
		System.out.println("正在吃肉");
	}
}

public class AInherit extends Object{ // 可以省略extends Object关键字

	public static void main(String[] args) {
		Tiger test2 = new Tiger("老虎", 1); // 实例化子类对象
		test2.say();
		test2.run();
		test2.eat();
		System.out.println("所属类的名称：" + test2.getClass().getName());  // 获得对象所属类的名称
	}

}


/*

### 继承
- 单继承：一个子类只继承一个父类；使用extends关键字 
- 多重继承：例如A类继承B类，B类继承C类；使用 implements关键字

- 子类继承父类原有的非private的属性和方法
- 子类可以对父类进行扩展,定制自己的属性和方法，或者重写父类中的方法
- 子类重写父类方法时，不能降低方法的修饰权限范围

- 实例化子类对象时，首先要实例化父类对象，也就是说Java编译器会在子类的构造方法中自动调用父类的无参构造方法
- 父类的有参数构造方法只能依赖于super关键字显式地调用

- 确保子类的finalize()方法的最后动作是调用父类的finalize()方法，保证所有对象部分都能够被清理


### java.lang.object类
- Java中所有的类都继承于java.lang.Object类 
- 定义类时可以省略extends Object关键字
- Object类是Java类层中的最高层类，在java.lang包中，不需要 import 
- 如果一个类没有继承关键字修饰，则默认继承java.lang.Object类
- Object类中final类型的方法不能被重写，例如：getClass()、notify()等方法

*/