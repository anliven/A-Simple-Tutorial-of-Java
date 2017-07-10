package pers.anliven.learningjava.chapter12;

public class T02ConsoleOutput {

	public static void main(String[] args) {

		int a;
		a = 'A';
		System.out.write(a); // write(int b)方法， 将 低八位字节写到流中
		System.out.write('\n');
		// System.out.close(); // 关闭流

		System.out.print(a + "\n");
		System.out.println(a);

		String b;
		b = "aaa bbb ccc";
		System.out.print(b + "\n");
		System.out.println(b);

	}

}

/*java.io.PrintStream类是OutputStream类的子类，其中的write()、print()和println()等方法可以完成控制台输出。
java.io.PrintStream类永远不会抛出IOException；而是通过checkError()方法刷新流并检查其错误状态。
write()方法不经常使用，因为 print()和 println()方法用起来更为方便。*/