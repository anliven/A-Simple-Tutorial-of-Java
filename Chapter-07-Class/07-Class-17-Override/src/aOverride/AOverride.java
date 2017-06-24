package aOverride;

public class AOverride {
	public static void main(String[] args) {
		Tiger test = new Tiger(); // 实例化子类对象
		test.say();
		test.eat();
		System.out.println("所属类的名称：" + test.getClass().getName()); // 获得对象所属类的名称
	}
}

class Animal { // 父类
	public void say() { // 父类成员方法
		System.out.println("我是老虎");
	}

	public void eat() { // 父类成员方法
		System.out.println("正在进食");
	}
}

class Tiger extends Animal { // extends关键字，子类继承父类
	public void eat() { // 重写父类方法
		System.out.println("正在吃肉");
	}
}

/*

### 重写(Override)
- 外壳不变，核心重写。在子类重新编父类的可访问方法, 但返回值和形参都不能改变
- 子类可以根据需要，重新实现父类的方法和定义自己的行为
- 重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常
- 子类重写父类方法时，不能降低方法的修饰权限范围
- 声明为final或static的方法不能被重写

*/
