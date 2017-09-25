package pers.anliven.learningjava.chapter10;

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
可以简单将“泛型”理解为“具体类型参数化”，类型定义成参数形式（类型形参），然后在使用时传入具体的类型（类型实参）。
通过泛型，可以在编译期间进行类型检查和直接按指定类型获取集合元素，有效避免“java.lang.ClassCastException”异常。
泛型集合中，只能添加泛型规定的类型及其子类型的对象，否则会报错。可通过包装类存入基本数据类型（Integer、Long、Boolean）。

泛型可以分为泛型接口、泛型类和泛型方法，常用T、E、K、V等形式的参数表示泛型形参。

使用泛型类时，虽然传入了不同的泛型实参，但并没有真正意义上生成不同的类型，传入不同泛型实参的泛型类在内存上只有一个，即还是原来的最基本的类型。
也就是说，泛型虽然在逻辑上是多个不同的类型，但实际上都是相同的基本类型。


### 类型擦除
泛型只是作用于代码编译阶段，泛型信息不会进入到运行时阶段。
在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦除。也就是说，成功编译过后的class文件中是不包含任何泛型信息的。


### 类型通配符
类型通配符一般是使用“?”代替具体的类型实参。(特别注意:此处是类型实参，而不是类型形参）
在逻辑上，Class<?>是所有Class<具体类型实参>的父类。

类型通配符可以限制类型实参，定义形式：
Class<? extends T> ：上限通配，表示？是T的一个未知子类。
Class<? super T> ：下限通配，表示？是T的一个未知父类。*/