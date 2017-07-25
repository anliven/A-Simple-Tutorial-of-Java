package pers.anliven.learningjava.chapter07;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.EnumMap;
import java.util.Map;
import java.util.EnumSet;

public class T14Enumeration {

	enum Color { // 定义三个枚举的类型
		RED, GREEN, BLUE;
	};

	enum Size {
		BIG, MIDDLE, SMALL;
	}

	public static void main(String args[]) {
		
		// 遍历枚举
		for (Color c : Color.values()) {
			System.out.println("Color: "+ c + " ordinal: " + c.ordinal());
		}
		// 遍历枚举
		for (Size s : Size.values()) {
			System.out.println("Size: "+ s + " ordinal: " + s.ordinal());
		}
		// 遍历枚举
		for (Color c : Color.values()) { // 输出枚举中的全部内容
			print(c); // 调用自定义print(Color color)方法
		}
		
		// 基本方法
		Color green = Color.GREEN; // 取出绿色
		System.out.println("Color: " + green);
		System.out.println("green name(): " + green.name());
		System.out.println("green getDeclaringClass(): " + green.getDeclaringClass());
		System.out.println("green hashCode(): " + green.hashCode());
		System.out.println("green compareTo Color.GREEN: " + green.compareTo(Color.GREEN));
		System.out.println("green equals Color.GREEN: " + green.equals(Color.GREEN));
		System.out.println("green equals Size.MIDDLE: " + green.equals(Size.MIDDLE));
		System.out.println("green equals 1: " + green.equals(1));
		System.out.format("green == Color.BLUE: %b\n", green == Color.BLUE);

		// 使用Set
		Set<Color> t = new TreeSet<Color>(); // 设置类型
		t.add(Color.GREEN); // 加入绿色
		t.add(Color.RED); // 加入红色
		t.add(Color.BLUE); // 加入蓝色
		Iterator<Color> iter = t.iterator();
		while (iter.hasNext()) {
			System.out.println("Set中的元素为:" + iter.next());
		}

		// 使用EnumMap
		Map<Color, String> desc = null; // 定义Map对象，同时指定类型
		desc = new EnumMap<Color, String>(Color.class); // 实例化EnumMap对象
		desc.put(Color.RED, "红色"); // 增加内容
		desc.put(Color.GREEN, "绿色");
		desc.put(Color.BLUE, "蓝色");
		System.out.println("输出全部内容:");
		for (Color c : Color.values()) {
			System.out.println(c.name() + " --> " + desc.get(c));
		}
		System.out.println("EnumMap输出全部键值:");
		for (Color c : desc.keySet()) {
			System.out.println(c.name());
		}
		System.out.println("EnumMap输出全部内容:");
		for (String s : desc.values()) {
			System.out.println(s);
		}

		// 使用 EnumSet
		EnumSet<Color> esOld = null; // 声明EnumSet对象
		EnumSet<Color> esNew = null;
		System.out.println("EnumSet.copyOf(Color.class)示例:");
		esOld = EnumSet.noneOf(Color.class); // 将枚举的全部类型设置到EnumSet对象之中
		esOld.add(Color.RED); // 增加内容
		esOld.add(Color.GREEN);
		esOld.add(Color.BLUE);
		print(esOld); // 输出集合内容, 调用自定义print(EnumSet<Color> temp)方法
		esNew = EnumSet.copyOf(esOld); // 从已有的集合拷贝过来
		print(esNew); // 输出集合内容, 调用自定义print(EnumSet<Color> temp)方法

	}

	public static void print(Color color) { // 自定义print方法,用于switch输出
		switch (color) { // 直接使用在Switch语句
		case RED: {
			System.out.println("红颜色");
			break;
		}
		case GREEN: {
			System.out.println("绿颜色");
			break;
		}
		case BLUE: {
			System.out.println("蓝颜色");
			break;
		}
		default: {
			System.out.println("未知颜色");
			break;
		}
		}

	}

	public static void print(EnumSet<Color> temp) { // 自定义print方法,用于遍历EnumSet输出
		for (Color c : temp) { // 循环输出内容
			System.out.println(c);
		}
	}

}

/*### 枚举(Enumeration)
- 使用enum关键字修饰，可以定义一个枚举，也可以定义一个Eunm类
- 枚举值默认为从0开始的有序数值
- java.lang.Enum<E> 类是所有枚举类型的公共基本类，已实现Serializable接口和Comparable<E>接口
- 通过枚举可以将相关的常量分组，并且有更多的方法，不用重复使用“ public static fianl”方式定义常量


### 枚举特性
- 在switch语句使用枚举，能让代码可读性更强
- 完成enum实例序列定义并以分号结尾之后，可以添加方法和变量
- 可以覆盖枚举的方法，例如：toString()
- 可以像普通类一样实现接口
- 可以使用接口组织枚举

所有的枚举都继承自java.lang.Enum类，所以本质上枚举是一种受限制的类，并且具有自己的方法。
由于Java不支持多继承，所以enum不可以继承其他类，也不能继承另一个enum 。
可以简单地认为enum是一个用来统一管理常量，但不能继承的常规类，可以添加方法和实现接口等。
需要注意的是不可以使用“=”为枚举常量赋值。


### 枚举的基本方法：
- values()：返回enum实例的数组（元素顺序是声明时的顺序）
- name()：返回实例名
- ordinal()：返回实例声明时的次序，从0开始
- getDeclaringClass()：返回实例所属的enum类型
- equals()：判断是否为同一个对象
- compareTo()：较此枚举与指定对象的顺序
- 可以使用“==”来比较enum实例


### 工具类
java.util.EnumSet和java.util.EnumMap是两个枚举集合。
EnumSet保证集合中的元素不重复；EnumMap中的key是enum类型，而value则可以是任意类型。*/
