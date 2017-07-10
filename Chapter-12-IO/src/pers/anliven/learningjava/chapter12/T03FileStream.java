package pers.anliven.learningjava.chapter12;

import java.io.*;

public class T03FileStream {

	public static void main(String[] args) throws IOException {

		File Test = new File("test.txt"); // File()方法创建一个文件对象
		FileOutputStream TestOutput = new FileOutputStream(Test); // 构建FileOutputStream对象,文件不存在会自动新建
		OutputStreamWriter writer = new OutputStreamWriter(TestOutput, "UTF-8"); // 创建使用指定字符集的
																					// OutputStreamWriter对象
		writer.append("中文输入"); // append()方法添加指定字符序列添加到此 writer缓冲区
		writer.append("\r\n");
		writer.append("English");
		writer.close(); // 关闭写入流
		TestOutput.close();// 关闭输出流,释放系统资源

		FileInputStream TestInput = new FileInputStream(Test);
		InputStreamReader reader = new InputStreamReader(TestInput, "UTF-8");
		StringBuffer StrBuf = new StringBuffer();
		
		while (reader.ready()) {
			StrBuf.append((char) reader.read()); // 转成char加到StringBuffer对象中
		}
		System.out.println(StrBuf.toString()); // toString()方法返回此序列中数据的字符串表示形式
		reader.close();// 关闭读取流
		TestInput.close(); // 关闭输入流,释放系统资源

	}

}

/*### 读写文件
FileInputStream类是java.io.InputStream的子类，用于从文件读取数据。
FileOutputStream类是java.io.OutputStream的子类，用于创建文件和向文件中写数据。
如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。

### OutputStreamWriter类
是Writer类的子类 是字符流通向字节流的桥梁：可使用指定的字符集将要写入流中的字符编码成字节。 

### InputStreamReader类
是Reader类的子类，是字节流通向字符流的桥梁，使用指定的字符集读取字节并将其解码为字符。
readLine()方法从标准输入读取一个字符串。
read()方法从标准输入读取一个字符，并把该字符作为整数值返回。

### StringBuffer类
java.lang.StringBuffer类是线程安全的可变字符序列，类似于String的字符串缓冲区。
可通过方法调用可以改变该序列的长度和内容。

### 详细信息
详细信息可查看JDK文档。*/