package pers.anliven.learningjava.chapter11;

public class T02TryCatch {

	public static void main(String args[]) {

		try {
			String str[] = new String[] { "aaa", "bbb", "ccc" }; // 初始化一维String数组
			System.out.println("显示str[3]:" + str[3]);
		} catch (ArrayIndexOutOfBoundsException e) { // 实例化异常类的对象，e是此对象引用名称
			System.out.println("抛出异常 :" + e);
			e.printStackTrace(); // printStackTrace()方法，在命令行打印异常信息在程序中出错的位置及原因
		} finally {
			System.out.println("finally块内容");
		}

	}

}

/*
 * 
 * ### 捕获异常 
 * 无论代码是否发生异常，都可以使用try{...}catch{...}捕获异常。
 * try块中包含需要捕获异常的代码，也称为保护代码；catch块声明捕获异常类型和处理异常。
 * 
 * 
 * ### 捕获异常 过程简述
 * 1. 当保护代码块中发生异常时，try后面的catch块就会被检查执行
 * 2. 如果发生的异常包含在catch块中，系统会自动实例化Exception类型的对象（Exception e）， e是此对象引用名称
 * 3. 然后e调用异常类中指定的方法，例如：e.printStackTrace()
 * 
 * 
 * ### 多重捕获
 * 一个try块后面跟随多个catch块。
 * 如果保护代码中发生异常，异常会被依次抛给跟随的多个catch块，直到异常被捕获或者通过所有的catch块。
 * 多个catch块的顺序：先捕获子类的异常，再捕获父类的异常，否则会报错。
 * 
 * 
 * ### finally关键字 
 * finally块包含try/catch块之后执行的代码。无论是否发生异常，finally块中的代码总会被执行。
 * finally块并非强制性要求。 
 * finally块中的代码，一般是可以运行清理类型等收尾善后性质的语句。
 * 
 * 
 * ### 异常方法 
 * 熟悉Throwable类的主要方法 
 * 了解两个主要的子类：IOException类和RuntimeException类
 * 例如：printStackTrace()方法是在命令行打印异常信息在程序中出错的位置及原因
 * 
 */