package aAbstract;

public class AAbstract {

	public static void main(String[] args) {

		Man test = new Man("张三", 35);
		test.sex();
		test.work();
		
		String name = test.getName();
		System.out.println(name);

		int age = test.getAge();
		System.out.println(age);

	}

}

abstract class Person { // abstract关键字，抽象类
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract void sex(); // abstract关键字,抽象方法，没有定义具体实现

	public String getName() {
		System.out.println("抽象类的成员方法getName");
		return name;
	}

	public int getAge() {
		System.out.println("抽象类的成员方法getAge");
		return age;
	}

}

class Man extends Person { // extends关键字，子类
	public Man(String name, int age) {
		super(name, age); // super关键字，调用父类构造方法
	}

	public void sex() { // 成员方法，定义了抽象方法的具体实现
		System.out.println("男人");
	}

	public void work() { // 新增成员方法
		System.out.println("养家");
	}
}

/*

### 抽象（Abstract）

- 抽象类：使用abstract关键字定义的类，类中只定义了对象的标准，但没有定义对象的具体信息 
- 抽象类不能实例化对象，必须被继承才能被使用
- 抽象类的成员变量、成员方法和构造方法的访问方式和普通类相同

- 一个类只能继承一个抽象类，而一个类却可以实现多个接口

- 抽象方法：使用abstract关键字定义的方法；方法名后面直接跟一个分号，而不是花括号
- 抽象方法没有方法体，也就是说没有定义具体实现
- 如果类中有一个抽象方法，此类就必须被标记为抽象类

- 实际应用中，父类通常被定义为抽象类，只给出方法的标准（抽象方法），而不给出实现的具体流程
- 子类中实现所有的抽象方法，定义方法的具体实现，这样只要实例化子类对象就可以调用相应的方法
- 任何子类必须重写父类的抽象方法，或者声明自身为抽象类

*/