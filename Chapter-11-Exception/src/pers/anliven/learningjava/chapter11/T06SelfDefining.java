package pers.anliven.learningjava.chapter11;

public class T06SelfDefining {

	public static int function(int a, int b) throws ArithmeticException { // throws关键字，声明可能抛出的异常

		if (b == 0) {
			ArithmeticException e = new ArithmeticException("零不可以作为除数");
			throw e;
		} else {
			int c = a / b;
			return c;
		}
	}

	public static void main(String[] args) {
		try {
			function(5, 0); // 零不可以作为除数,将抛出异常java.lang.ArithmeticException
		} catch (Exception e) { // catch块，处理异常
			System.err.println(e.getMessage());
			e.printStackTrace(); // printStackTrace()方法，在命令行打印异常信息在程序中出错的位置及原因
		}
	}

}

/*
 * java.lang.Throwable类是所有错误或异常的超类。
 * 
 * Throwable(String message)构造方法：构造带指定详细消息的新 throwable。 
 * getMessage()方法：返回此 throwable 的详细消息字符串。
 * 
 * 可以利用Throwable类的构造方法，自定义异常的详细信息
 * 
 */