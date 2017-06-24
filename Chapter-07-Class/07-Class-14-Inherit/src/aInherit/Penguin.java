package aInherit;

public class Penguin extends Animal { // extends关键字，子类继承父类
	public Penguin(String myName, int myAge) {  // 子类构造方法
		super(myName, myAge); // super关键字，调用父类构造方法
		System.out.println("调用子类Penguin的构造方法");
		super.say(); // super关键字，调用父类成员方法
	}

	public void swim() { // 新增方法
		System.out.println("喜欢游泳");
	}
	
	public static void main(String[] args) {
		Penguin test1 = new Penguin("企鹅", 2); // 实例化子类对象
		test1.swim();
		test1.eat();
		System.out.println("所属类的名称：" + test1.getClass().getName());  // 获得对象所属类的名称
	}

}

/*

### super关键字
- 实现对父类成员的访问

*/