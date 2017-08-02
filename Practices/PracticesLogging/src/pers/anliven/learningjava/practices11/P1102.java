package pers.anliven.learningjava.practices11;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String ErrorMessagr) {
		super(ErrorMessagr);
	}
}

class Student {
	public void speak(int m) throws MyException {
		if (m > 1000) {
			throw new MyException("参数过大");
		}
	}
}

public class P1102 {
	public static void main(String[] args) {
		Student stu = new Student();
		try {
			stu.speak(1500);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}

// 写自定义异常类MyException；
// 编写Student类，该类的speak(int m)方法在参数m大于1000时会抛出MyException对象；
// 编写主类，在主方法中创建Student对象并调用speak()方法。