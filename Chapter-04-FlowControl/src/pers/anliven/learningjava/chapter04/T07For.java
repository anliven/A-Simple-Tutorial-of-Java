package pers.anliven.learningjava.chapter04;

public class T07For {

	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) { // 注意这里“i++”是循环后的操作表达式
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println("2到100之间的所有偶数之和为：" + sum);

		for (;;) {
			System.out.println("利用for循环的特殊语法格式，实现无限循环");
			break; // 通过break语句跳出无限循环
		}

	}

}

/*
 * for循环用来重复执行某条语句，直到某个条件得到满足。
 *
 * 括号中的三个表达式必须用 “;” 隔开，三个表达式都可以省略，但 “;” 不能省略
 * 省略“循环变量初始化”，可以在 for 语句之前由赋值语句进行变量初始化操作
 * 省略“循环条件”，将会造成无限循环
 * 省略“循环变量变化”，可以在循环体中进行循环变量的变化
 *
 * 循环条件部分可以使用逻辑运算符组合的表达式，表示复杂判断条件，但一定注意运算的优先级
 * 循环变量初始化和循环变量变化部分，可以是使用 “,” 同时初始化或改变多个循环变量的值
 * 
 */