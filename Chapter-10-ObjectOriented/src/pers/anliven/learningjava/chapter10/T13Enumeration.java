package pers.anliven.learningjava.chapter10;

enum ColorTest {
	RED("红色", 1), YELLO("黄色", 2), GREEN("绿色", 3); // 以分号结束之后，可以声明自定义成员
	private String name; // 成员变量
	private int index;

	private ColorTest(String name, int index) { // 构造方法
		this.name = name;
		this.index = index;
	}

	@Override
	public String toString() { // 重写枚举的toString()方法
		return this.index + "_" + this.name;
	}

	public static String getName(int index) { // 普通成员方法
		for (ColorTest c : ColorTest.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}

interface Behaviour { // 接口
	void print();

	String getInfo();
}

enum ColorTest2 implements Behaviour { // 实现接口
	BLACK("黑色", 1), WHITE("白色", 2), BLUE("蓝色", 3);
	private String name; // 成员变量
	private int index;

	private ColorTest2(String name, int index) { // 构造方法
		this.name = name;
		this.index = index;
	}

	@Override
	public String getInfo() { // 重写接口方法
		return this.name;
	}

	@Override
	public void print() {
		System.out.println(this.index + ":" + this.name);
	}
}

interface Food { // 使用接口组织枚举
	enum Coffee implements Food {
		BLACK, LATTE, CAPPUCCINO
	}

	enum Dessert implements Food {
		FRUIT, CAKE
	}
}

public class T13Enumeration {

	public static void main(String[] args) {
		
		System.out.println("getName: " + ColorTest.getName(1));
		
		ColorTest green = ColorTest.GREEN;
		System.out.println("Color: " + green);
		System.out.println("toString(): " + green.toString());
		
		green.setName("灰色");
		green.setIndex(4);
		System.out.println("Change: " + green + "-" + green.getIndex() +  "-" + green.getName());
		
		for (ColorTest c : ColorTest.values()) {
			System.out.println("ColorTest: "+ c + " ordinal: " + c.ordinal());
		}
		
		// 接口
		ColorTest2 blue = ColorTest2.BLUE;
		System.out.println("getInfo: " + blue.getInfo());
		blue.print();
	}

}

/*### 枚举特性
- 在switch语句使用枚举，能让代码可读性更强
- 完成enum实例序列定义并以分号结尾之后，可以添加方法和变量
- 可以覆盖枚举的方法，例如：toString()
- 可以像普通类一样实现接口
- 可以使用接口组织枚举

所有的枚举都继承自java.lang.Enum类，所以本质上枚举是一种受限制的类，并且具有自己的方法。
由于Java不支持多继承，所以enum不可以继承其他类，也不能继承另一个enum 。
可以简单地认为enum是一个用来统一管理常量，但不能继承的常规类，可以添加方法和实现接口等。
需要注意的是不可以使用“=”为枚举常量赋值。*/