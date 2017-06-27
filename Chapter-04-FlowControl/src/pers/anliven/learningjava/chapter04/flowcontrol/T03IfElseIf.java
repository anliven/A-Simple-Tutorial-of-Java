package pers.anliven.learningjava.chapter04.flowcontrol;

public class T03IfElseIf {

	public static void main(String args[]) {
		int x = 20;
		if (x > 30) { // if...else if多分支语句
			System.out.println("a的值大于30");
		} else if (x > 10) {
			System.out.println("a的值大于10，但小于30");
		} else if (x > 0) {
			System.out.println("a的值大于0，但小于10");
		} else {
			System.out.println("a的值小于0");
		}
	}

}
