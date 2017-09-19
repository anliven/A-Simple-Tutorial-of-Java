package pers.anliven.learningjava.chapter10;

class Animal { // 父类
	private String name;

	public Animal(String myName) { // 父类Animal的构造方法
		name = myName;
	}

	public void say() { // 父类成员方法
		System.out.println("我是" + name);
	}
}

class Tiger02 extends Animal { // extends关键字，子类继承父类
	public Tiger02(String myName) { // 子类构造方法
		super(myName); // super关键字，调用父类构造方法
	}

	public void run() { // 新增方法
		System.out.println("喜欢奔跑");
	}
}

public class T02ConverObjectType {
	public static void main(String[] args) {

		// 向上转型
		Animal test = new Tiger02("老虎"); // 实例化对象，并将子类对象看作是父类对象 --- 向上转型
		test.say();
		// test.run(); // 向上转型后，此时被看作父类对象，无法调用子类的方法
		System.out.println(test.getClass().getName()); // 获得对象所属的类名称

		// 向下转型
		Tiger02 test2 = (Tiger02) test; // 使用显式类型转换将父类对象看作是子类对象 --- 向下转型
		test2.say();
		test2.run(); // 此时作为子类对象，可以调用子类的方法
		System.out.println(test2.getClass().getName()); // 获得对象所属的类名称

	}

}

/*
 * 
 * ### 对象类型的转换 ---向上转型
 * 将一个父类的引用指向一个子类对象，也就将子类对象看作父类对象，是从具体的类到较抽象类的转换
 * 向上转型会丢失子类特有的方法,但是overriding父类方法的子类方法有效
 * 隐式/自动类型转换，是小类型到大类型的转换，无风险
 * 
 * ### 对象类型的转换 ---向下转型
 * 当向上转型发生后，将无法调用子类特有的方法。但是当需要调用子类特有的方法时，可以通过将父类再转换为子类来实现
 * 必须使用显示类型转换（将父类对象强制转换为子类对象）
 * 强制类型转换，是大类型到小类型的转换，有风险
 * 
 */
