package aSuper;

public class ASuper {

	public static void main(String[] args) {
		//new subClass().showMessage(); // 此语句作用等同与如下两行语句
		subClass test = new subClass();
		test.showMessage();

	}

}

class superClass {
	int i = 123;
}

class subClass extends superClass {
	int i = 456;

	public void showMessage() {
		System.out.printf("super.i = %d, this.i = %d\n", super.i, this.i);
	}
}

/*

- super关键字：实现对父类成员的访问，用来引用当前对象的父类
- this关键字：指向自己的引用。

*/