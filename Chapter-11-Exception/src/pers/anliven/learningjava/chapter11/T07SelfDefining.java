package pers.anliven.learningjava.chapter11;

public class T07SelfDefining {

	public static void main(String[] args) {
		T07SelfDefining testExc = new T07SelfDefining();
		try {
			testExc.test2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test1() throws TestException {
		throw new TestException("One1111111111");
	}

	public void test2() {
		try {
			test1();
		} catch (TestException e) {
			RuntimeException newExc = new RuntimeException("Two2222222222");
			newExc.initCause(e);
			throw newExc;
		}
	}

}

class TestException extends Exception { // 自定义异常类
	private static final long serialVersionUID = 1L;

	public TestException() {
	}

	public TestException(String message) {
		super(message);
	}
}

/*
 * 
 * ### 异常链
 * test1():抛出test1的异常
 * test2():调用test1(),捕获test1的异常，并且包装成运行时异常，继续抛出
 * main方法中，调用test2(),尝试捕获test2()方法抛出的异常
 * 
 * ### 经验与总结
 * 1.处理运行时异常，采用逻辑去合理规避同时辅助try-catch处理；
 * 2.在多重catch块后面，可以加一个catch(Exception)来处理肯能会被遗漏的异常；
 * 3.对于不确定的代码，也可以加上try-catch，处理潜在的异常；
 * 4.尽量去处理异常，切记只是简单的调用printStackTrace()去打印输出；
 * 5.根据具体业务需求和异常类型决定如何处理异常；
 * 6.尽量添加finally语句块去释放占用的资源；
 * 
 */