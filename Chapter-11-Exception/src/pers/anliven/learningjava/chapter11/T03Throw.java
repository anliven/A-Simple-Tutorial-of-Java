package pers.anliven.learningjava.chapter11;

public class T03Throw {

	public static void main(String[] args) {

		String str[] = new String[] { "aaa", "bbb", "ccc" }; // 初始化一维String数组
		// int x = 2;
		int x = 3;
		if (x > 2) {
			throw new ArrayIndexOutOfBoundsException(); // throw关键字,主动抛出异常
		} else {
			System.out.println("显示str[x]:" + str[x]);
		}

	}

}

/*
 * 
 * ### 抛出异常 
 * 除了标准异常（系统自动抛出异常）之外，throw和throws关键字也可以用于抛出异常。 
 * 处理异常应该交由调用它的上层方法来处理。
 * 如果在函数体内throw抛出了异常，最好throws声明函数可能抛出的异常。
 * 
 * 
 * ### throw关键字 
 * throw用在方法体内，用于主动抛出特定的异常，由方法体内的语句处理 
 * throw实际上是向外抛出了一个异常类的对象实例
 * 
 * 
 * ### throws关键字 
 * throws用在方法声明后面，声明可能抛出的异常，由该方法的调用者来处理
 * throws仅仅表示出现异常的可能性，提示应该捕获这个异常，不一定真正发生 
 * 一个方法可以声明可能抛出多个异常，多个异常之间用逗号隔开
 * 即使没有throws声明可能抛出的异常，也能使用try{...}catch{...}捕获异常
 * 
 */