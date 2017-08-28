package pers.anliven.learningjava.chapter07;

public class T05Static {
	static public int money = 60;

	public void cost(int i) {
		if (money >= 80) {
			money = money - i;
		} else {
			System.out.println("财务风险");
		}
	}

	public void earn(int i) {
		money += i;
	}

	static int x; // 同一个类的不同实例对象，共用同一静态变量，如果一个对象将其更改，另一个对象的静态变量也会更改。
	int y;

	public void others(int x, int y) {
		T05Static.x = x; // 使用“类名.静态成员”的方式调用静态成员
		this.y = y;
	}

	public static void main(String[] args) {
		T05Static inlet = new T05Static();
		T05Static outlet = new T05Static();
		inlet.earn(100);
		outlet.cost(40);
		System.out.println("当前剩余金额：" + T05Static.money + "万");

		T05Static a = new T05Static();
		T05Static b = new T05Static();
		a.others(1, 2);
		b.others(100, 200);
		System.out.println("a.x的值：" + T05Static.x);
		System.out.println("a.y的值：" + a.y);
		System.out.println("b.x的值：" + T05Static.x);
		System.out.println("b.y的值：" + b.y);
	}

}

/*
 * 
 * ### 静态修饰符static
 * 用static关键字修饰的成员（变量、方法和代码块）称为静态成员，存放在内存的“静态区(内存公共区)”中，和整个程序的生存周期相同。
 * 静态成员属于整个类所有，被类的所有对象所共享。
 * 静态成员属于整个类，当系统第一次使用该类时，就会为其分配内存空间直到该类被卸载才会进行资源回收。
 * 建议使用“类名.静态成员”的方式调用静态成员。
 * 不建议使用“对象.静态类成员”的方式调用静态成员，容易混淆静态成员和非静态成员。
 * 静态成员遵循private、protected和public关键字的约束。
 * 
 * ### 静态变量 
 * 用static关键字修饰。 
 * 类的静态变量可以被类的所有对象共享。
 * 同一个类的不同实例对象，共用同一静态变量，如果一个对象将其更改，另一个对象的静态变量也会更改。
 * 
 */