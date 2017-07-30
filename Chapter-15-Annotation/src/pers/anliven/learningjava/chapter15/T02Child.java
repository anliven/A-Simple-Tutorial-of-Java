package pers.anliven.learningjava.chapter15;

@T02Description("I am class annotation")
public class T02Child implements T01People {

	@Override
	@T02Description("I am method annotation")
	public String name() {
		return null;
	}

	@Override
	public int age() {
		return 0;
	}

	@Override
	public void work() {
		System.out.println("Class:T01Child, Method:work()");
	}
}
