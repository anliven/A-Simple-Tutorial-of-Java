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
		System.out.println(StrBuf.toString());
		reader.close();// 关闭读取流
		TestInput.close(); // 关闭输入流,释放系统资源

	}

}
