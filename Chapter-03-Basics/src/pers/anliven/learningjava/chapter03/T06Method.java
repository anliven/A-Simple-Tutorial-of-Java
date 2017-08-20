package pers.anliven.learningjava.chapter03;

import java.util.Arrays;

public class T06Method {

	public void print() { // 自定义方法，无参无返回值,void
		System.out.println("Hello Method!");
	}

	public void print(int id) { // 方法的重载
		System.out.println("ID:" + id);
	}

	public int testReturn() { // 自定义方法，无参有返回值
		int a = 555;
		int b = 333;
		int sum = a + b;
		return sum;
	}

	public void testAvg(int arg1, int arg2) { // 自定义方法，带参无返回值
		int avg = (arg1 + arg2) / 2;
		System.out.println("Avg：" + avg);
	}

	public int testNum(int[] scores) { // 自定义方法，带参有返回值
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		return scores.length; // 返回数组中元素的个数
	}

	public static void main(String[] args) {
		T06Method test = new T06Method(); // 创建类的对象
		test.print(); // 对象名.方法名()，在main方法中调用自定义方法
		test.print(123);
		int n = test.testReturn();
		System.out.println("Return:" + n);
		test.testAvg(96, 89);
		int[] scores = { 79, 52, 98, 81 };
		int count = test.testNum(scores);
		System.out.println("Number:" + count);

	}

}

/*
 * 定义语法：
 * <访问修饰符> <返回值类型> <方法名>(参数列表){
 *     <方法体>
 * }
 * 
 * 方法体放在一对大括号中，实现特定的操作
 * 方法名一般采用第一个单词首字母小写，其它单词首字母大写的形式
 * 
 * - 访问修饰符：方法允许被访问的权限范围，可以是public、protected、private，也可以省略；
 * - 返回值类型：指定返回值的类型，并且在方法体中使用return 语句返回值；如果不返回任何值，则指定为void；
 * - 方法名：定义的方法的名字，必须使用合法的标识符
 * - 参数列表：传递给方法的参数列表，多个参数间以逗号分隔，每个参数由参数类型和参数名组成，以空格隔开
 * 
 * - 参数可以是任意的基本类型数据或引用类型数据
 * - 形参:定义方法时的参数，需要传入的参数个数和类型
 * - 实参:调用方法时的参数，传递给方法真正被处理的值
 * - 实参必须传入，数量、类型、顺序必须与形参一一对应，但不需要指定数据类型
 * 
 * - 调用带返回值方法时一般都会接收其返回值并进行处理
 * - 使用return返回值，返回类型就不能为void
 * - 返回值只能有一个，不能返回多个值，其类型必须兼容
 * 
 * 根据方法是否带参、是否带返回值，分为四类：
 * - 无参无返回值方法
 * - 无参带返回值方法
 * - 带参无返回值方法
 * - 带参带返回值方法
 * 
 * 方法的重载
 * 同一个类中包含了两个或两个以上方法名相同，但方法参数的个数、顺序或类型不同的方法
 * 当调用被重载的方法时，Java根据参数的个数和类型来判断调用，完全匹配的方法将被执行
 * 方法的重载与方法的修饰符或返回值没有关系
 * 
 */