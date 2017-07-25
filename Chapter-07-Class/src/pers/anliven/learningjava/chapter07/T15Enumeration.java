package pers.anliven.learningjava.chapter07;

enum ColorTest {
	RED("红色", 1), YELLO("黄色", 2), GREEN("绿色", 3); // 定义enum实例以分号结束，之后可以声明自定义方法
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	private ColorTest(String name, int index) {
		this.name = name;
		this.index = index;
	}

	// 覆盖枚举的toString()方法
	@Override
	public String toString() {
		return this.index + "_" + this.name;
	}

	// 普通方法
	public static String getName(int index) {
		for (ColorTest c : ColorTest.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}

	// get set 方法
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

// 实现接口

interface Behaviour {
	void print();

	String getInfo();
}

enum TestColor2 implements Behaviour {
	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	private TestColor2(String name, int index) {
		this.name = name;
		this.index = index;
	}

	// 接口方法
	@Override
	public String getInfo() {
		return this.name;
	}

	// 接口方法
	@Override
	public void print() {
		System.out.println(this.index + ":" + this.name);
	}
}

// 使用接口组织枚举
interface Food {
	enum Coffee implements Food {
		BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
	}

	enum Dessert implements Food {
		FRUIT, CAKE, GELATO
	}
}

public class T15Enumeration {
	enum Signal {
		RED, YELLOW, GREEN;
	};
	// 不 使用“ public static fianl”方式定义常量，通过枚举将相关的常量分组，并且有更多的方法

	// 在switch语句使用枚举，能让代码可读性更强
	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
