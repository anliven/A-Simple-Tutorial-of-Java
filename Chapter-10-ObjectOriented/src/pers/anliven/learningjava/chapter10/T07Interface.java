package pers.anliven.learningjava.chapter10;

public class T07Interface {

	public static void main(String[] args) {
		Tiger07 x = new Tiger07();
		x.say();
		x.age();
		x.eat();
		Penguin y = new NorthPenguin();
		y.say();
		y.eat();
		Lion z = new Lion();
		z.say();
		z.lifeTime();
	}

}

// 声明接口
interface Animal07 { // interface关键字，接口是隐式抽象的，声明接口时不必使用abstract关键字
	public void say(); // 接口的方法是隐式抽象的，声明时不需要abstract关键字，但必须被定义为public
	public void eat();
}

interface Biology {
	public void lifeTime();
}

// 实现接口，实现接口的所有方法
class Tiger07 implements Animal07 { // implements关键字
	public static final int age = 3; // 可以省略static和final关键字，接口中定义的任何字段都自动是static和final

	public void say() { // 必须实现接口中所有的方法
		System.out.println("我是老虎");
	}

	public void age() { // 新增方法
		System.out.println(age + "岁");
	}

	public void eat() { // 必须实现接口中所有的方法
		System.out.println("喜欢吃肉");
	}
}

// 实现接口，未实现接口的所有方法
abstract class Penguin implements Animal07 { // implements和abstract关键字，未实现接口的所有方法，因此声明为抽象类
	public void say() { // 没有实现接口中所有的方法
		System.out.println("我是企鹅");
	}
}

class NorthPenguin extends Penguin { // 子类继承抽象类
	public void eat() { // 必须实现接口中所有的方法
		System.out.println("喜欢吃鱼");
	}
}

//实现多个接口
class Lion implements Animal07, Biology  { // 同时实现多个接口（多重继承）
	public void say() { // 必须实现接口中所有的方法
		System.out.println("我是狮子");
	}
	public void eat() { // 必须实现接口中所有的方法
		System.out.println("喜欢吃肉");
	}
	public void lifeTime() { // 必须实现接口中所有的方法
		System.out.println("寿命15年");
	}
}

/*
 * 
 * ### 接口（Interface） 
 * 接口定义了某一批类所需要遵守的规范，规定这些类所必须提供某些方法，是用来被继承、被实现的，修饰符使用public
 * 通过interface关键字定义，接口不是类，没有构造方法，无法被实例化
 * 接口中的所有方法必须是抽象方法，可以看作是纯粹的抽象类 
 * 接口中定义的任何字段都自动是static和final，所以接口中的成员其实只能是 public static final类型
 * 
 * ### 接口的实现 
 * 类使用implements关键字实现接口。在类声明中，Implements关键字放在class声明后面
 * 当类实现接口的时候，类要实现接口中所有的方法。否则，该类必须声明为抽象类 
 * 一个类只能继承一个类，但是能实现多个接口，使用接口可以实现多重继承
 * 一个接口能可以继承多个接口，接口的继承使用extends关键字
 * 类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常
 * 
 * ### 标记接口
 * 最常用的继承接口是没有任何方法和属性的接口，这种接口被称为标记接口
 * 标记接口仅表明它的类属于一个特定的类型，相当于给某个对象做了个标识
 * 标记接口主要用于建立一个公共的父接口和向一个类添加数据类型
 * 
 */