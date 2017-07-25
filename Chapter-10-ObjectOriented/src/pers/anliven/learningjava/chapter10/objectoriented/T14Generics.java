package pers.anliven.learningjava.chapter10.objectoriented;

public class T14Generics {

	public static void main(String[] args) {

		Box<String> testStr = new Box<String>("Coin"); // 指定String类型
		System.out.println("testStr: " + testStr.getData());

		Box<Integer> testInt = new Box<Integer>(123); // 指定Integer类型
		System.out.println("testInt: " + testInt.getData());

		Box<Number> testNum = new Box<Number>(789); // 指定Number类型
		System.out.println("testNum: " + testNum.getData());

		System.out.println("testStr class: " + testStr.getClass());
		System.out.println("testInt class: " + testInt.getClass());
		System.out.println(testStr.getClass() == testInt.getClass()); // 实际上是相同的基本类型

		getData(testStr);
		getData(testInt);
		getData(testNum);

		// getUpperNumberData(testStr); // 提示报错
		getUpperNumberData(testInt); // Integer类是Number的子类
		getUpperNumberData(testNum);

		// getUnderNumberData(testStr); // 提示报错
		// getUnderNumberData(testInt); // 提示报错
		getUnderNumberData(testNum);

	}

	public static void getData(Box<?> data) { // 类型通配符
		System.out.println("Show Data : " + data.getData());
	}

	public static void getUpperNumberData(Box<? extends Number> data) { // 类型通配符的上限
		System.out.println("Show Number and Integer Data : " + data.getData());
	}

	public static void getUnderNumberData(Box<? super Number> data) { // 类型通配符的下限
		System.out.println("Show Number Data : " + data.getData());
	}


}

//简单示例：泛型类和方法
class Box<T> { // 泛型类

	private T data;

	public Box() {
	}

	public Box(T data) { // 泛型构造方法
		this.data = data;
	}

	public T getData() { // 泛型成员方法
		return data;
	}

}

/*### 泛型(Generics)
可以简单理解为“具体类型参数化”，将类型定义成参数形式（类型形参），然后在使用/调用时传入具体的类型（类型实参）。
泛型虽然在逻辑上是多个不同的类型，但实际上都是相同的基本类型。
在泛型的定义过程中，常用T、E、K、V等形式的参数表示泛型形参。
具体使用时，可以分为泛型接口、泛型类和泛型方法。
在Java集合类框架中泛型被广泛应用，可以使集合记元素各类型，有效避免“java.lang.ClassCastException”异常。


### 类型擦除
泛型只是作用于代码编译阶段，泛型信息不会进入到运行时阶段。
在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦除。也就是说，成功编译过后的class文件中是不包含任何泛型信息的。

使用泛型类时，虽然传入了不同的泛型实参，但并没有真正意义上生成不同的类型，传入不同泛型实参的泛型类在内存上只有一个，即还是原来的最基本的类型。



### 类型通配符
类型通配符一般是使用“?”代替具体的类型实参。(特别注意:此处是类型实参，而不是类型形参）
在逻辑上，Class<?>是所有Class<具体类型实参>的父类。

类型通配符可以限制类型实参，定义形式：
Class<? extends T> ：上限通配，表示？是T的一个未知子类。
Class<? super T> ：下限通配，表示？是T的一个未知父类。*/