package pers.anliven.learningjava.chapter12;

import java.io.*;

public class T01BufferedReader {

	public static void main(String[] args) throws IOException { // 异常抛出

		// 从控制台读取字符
		char testData;
		BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
		// 控制台输入由 System.in完成,这里是将System.in包装在一个BufferedReader对象中来创建一个字符流
		System.out.println("输入字符, 输入‘q’退出：");
		do {
			testData = (char) test.read(); // read()方法从控制台读取一个字符
			System.out.println(testData);
		} while (testData != 'q');
		System.out.println("已退出");

		// 从控制台读取字符串
		String testData2;
		BufferedReader test2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符串，输入‘end’退出：");
		do {
			testData2 = test2.readLine(); // readLine()方法读取一个字符串
			System.out.println(testData2);
		} while (!testData2.equals("end"));
		System.out.println("已退出");

	}

}

/*### java.io包
一个流可以理解为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。
java.io包含有操作输入、输出需要的类,通过数据流、序列化和文件系统提供系统输入和输出。 

### 字符流
java.io.Reader抽象类用于读取字符流。 
java.io.Writer抽象类用于写入字符流。 

### 字节流
java.io.InputStream抽象类是所有字节输入流类的超类。 
java.io.OutputStream抽象类是所有输出字节流类的超类。 


### BufferedReader类
是Reader类的子类，从字符输入流中读取文本，缓冲各个字符。

### InputStreamReader类
是Reader类的子类，是字节流通向字符流的桥梁，使用指定的字符集读取字节并将其解码为字符。
readLine()方法从标准输入读取一个字符串。
read()方法从标准输入读取一个字符，并把该字符作为整数值返回。*/
