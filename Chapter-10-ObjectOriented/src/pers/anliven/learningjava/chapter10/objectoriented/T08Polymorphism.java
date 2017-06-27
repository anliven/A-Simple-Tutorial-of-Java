package pers.anliven.learningjava.chapter10.objectoriented;

public class T08Polymorphism {

	public static void main(String[] args) {

		Animal08 test = new Cat(); // 向上转型
		test.eat(); // 调用 Cat的 eat方法
		Cat test2 = (Cat) test; // 向下转型
		test2.work(); // 调用 Cat的 catchMouse方法

		show(new Cat()); // 以 Cat 对象调用 show 方法
		show(new Dog()); // 以 Dog 对象调用 show 方法

	}

	public static void show(Animal08 x) {
		x.eat();
		if (x instanceof Cat) { // instanceof关键字，判断一个实例对象是否属于一个类
			Cat y = (Cat) x;
			y.work();
		} else if (x instanceof Dog) {
			Dog y = (Dog) x;
			y.work();
		}
	}

}

abstract class Animal08 { // abstract关键字，抽象类
	abstract void eat(); // abstract关键字,抽象方法，没有定义具体实现
}

class Cat extends Animal08 { // extends关键字，子类
	public void eat() { // 成员方法，定义了具体实现
		System.out.println("吃鱼");
	}

	public void work() { // 新增成员方法
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal08 { // extends关键字，子类
	public void eat() { // 成员方法，定义了具体实现
		System.out.println("吃肉");
	}

	public void work() {
		System.out.println("看家");
	}
}

/*
 * 
 * ### 多态（Polymorphism）
 * 
 * 将父类特征应用于子类对象，也就是通过使用不同的实例来完成不同的操作
 * 子类除了继承有父类的特征，还具有其他的自身特征
 * 多态存在的三个必要条件：继承、重写、向上转型（父类引用指向子类对象）
 * 多态的实现方式：重写、接口、抽象类和抽象方法
 * 
 * 多态的实现依赖于抽象类和接口 - 
 * 父类通常被定义为抽象类，只给出方法的标准，而不给出实现的具体流程 -
 * 子类中定义方法的具体实现，这样只要实例化子类对象就可以调用相应的方法
 * 
 * 多态有助于形成统一的编程风格，使程序具备良好的扩展性和可维护性
 * 
 */