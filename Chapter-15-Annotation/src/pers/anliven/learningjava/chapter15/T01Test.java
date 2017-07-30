package pers.anliven.learningjava.chapter15;

public class T01Test {

	public void test() {
		T01People people = new T01Child();
		people.work();
	}

	@SuppressWarnings("deprecation") // @SuppressWarnings表示忽略警告，这里忽略了deprecation警告
	public void test2() {
		T01People people2 = new T01Child();
		people2.work();
	}

	@T01Description(desc = "i am Color", author = "boy", age = 18) // 使用自定义注解，注意成员数据类型
	public String Color() {
		return "red";
	}

	public static void main(String[] args) {

	}

}

// 使用自定义注解的语法：@<注解名>(<成员名1>=<成员值1>,<成员名1>=<成员值1>,…)