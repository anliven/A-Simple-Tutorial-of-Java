package astring;

public class Astring {

	public static void main(String[] args) {
		//声明字符串
		String s_0;  //声明字符串变量
		s_0 = "hello";  //初始化字符串变量
		System.out.println(s_0);
		
		//创建字符串
		char a[]={'G','o','o','d'};  //声明字符数组并赋值
		String s_1 = new String(a);  //利用字符数组创建String对象
		System.out.println("s_1:"+s_1);
		String s_2 = new String("Good");  //等价对比		
		System.out.println("s_2:"+s_2);
		
		char b[]={'s','t','u','d','e','n','t'};
		String s_3 = new String(b,2,4);  //提取字符数组的一部分创建String对象
		System.out.println("s_3:"+s_3);
		String s_4 = new String("uden");  //等价对比
		System.out.println("s_4:"+s_4);
	}

}

/* 字符串，多字符连接而成。
 * 通过java.lang包中的String类创建字符串对象。
 * 
 * 字符串必须包含在一对双引号("")之内 ，而且不能作为其他数据类型来使用。
 * 声明字符串变量，必须经过初始化才能使用，否则编译器会报错。
 */