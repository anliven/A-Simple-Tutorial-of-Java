package pers.anliven.learningjava.chapter10;

public class T03Super {

	public static void main(String[] args) {
		// new subClass().showMessage(); // 此语句作用等同与如下两行语句
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
 * super关键字：实现对父类成员的访问，用来引用当前对象的父类 
 * this关键字：指向自己的引用
 * 
 * 在子类的构造过程中，其实是隐性地使用了super()来调用其父类的构造方法；
 * 如果想在子类中显性地调用父类的构造方法，那么super()必须在子类构造方法的第一行；
 * 
 * 系统默认调用父类的无参构造方法；
 * 如果父类没有无参构造方法，在子类中也没有显性地其父类的构造方法，会导致编译出错；
 * 
 */