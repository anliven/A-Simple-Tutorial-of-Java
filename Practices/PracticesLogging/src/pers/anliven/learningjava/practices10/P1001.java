package pers.anliven.learningjava.practices10;

public class P1001 {
	public void p() {
		System.out.println("父类.p()");
	}

	public void s() {
		System.out.println("父类.s()");
	}

	public static void main(String[] args) {

		P1001 u = new S1001();
		u.p();
		u.s();

	}

}

class S1001 extends P1001 {
	public void s() {
		System.out.println("子类.s()");
	}
}

// 编写一个父类，包含两个成员方法，在子类中覆盖第二个方法；
// 创建子类对象并且将其向上转型到基类，然后调用第二个方法。