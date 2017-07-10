package pers.anliven.learningjava.chapter12;

import java.io.File;

public class T04Directory {

	public static void main(String[] args) {

		// 创建目录
		String dirname = "D:/Anliven/Anliven-Code/EclipseProjects/Chapter-12-IO/TestDir";
		File dir = new File(dirname); // File()方法创建一个文件对象
		dir.mkdirs();
		System.out.println("创建TestDir目录 完成");

		// 读取目录
		String dirname2 = "D:/Anliven/Anliven-Code/EclipseProjects/Chapter-12-IO";
		File TestFolder = new File(dirname2); // File()方法创建一个文件对象
		if (TestFolder.isDirectory()) {
			System.out.println("目录：" + dirname2);
			String str[] = TestFolder.list();
			for (int i = 0; i < str.length; i++) {
				File testFolder2 = new File(dirname2 + "/" + str[i]);
				if (testFolder2.isDirectory()) {
					System.out.println("存在目录：" + str[i]);
				} else {
					System.out.println("存在文件：" + str[i]);
				}
			}
		} else {
			System.out.println(dirname2 + " 不是一个目录");
		}

		// 删除目录或文件
		File DelFolder = new File("D:/Anliven/Anliven-Code/EclipseProjects/Chapter-12-IO/TestDir");
		if (DelFolder.exists()) { // exists()方法测试文件或目录是否存在
			deleteFolder(DelFolder); // 调用自定义的删除方法
			System.out.println("未删除目录或文件：" + DelFolder);
		} else {
			System.out.println("目录或文件不存在：" + DelFolder);
		}

	}

	// 定义删除目录或文件的方法
	public static void deleteFolder(File folder) {
		File[] files = folder.listFiles(); // listFiles()方法返回一个抽象路径名数组，表示目录中的文件
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) { // isDirectory()方法测试是否是一个目录
					deleteFolder(f); // 调用自身
				} else {
					f.delete(); // delete()方法删除文件
				}
			}
		}
		folder.delete(); // delete()方法删除目录。
	}

}

/*### java.io.File类
文件和目录路径名的抽象表示形式。 

### 创建目录
mkdirs()方法：创建一个文件夹和它的所有父文件夹。
mkdir()方法：创建一个文件夹，如果指定的路径已经存在，或者整个路径不存在，该文件夹不能被创建。

### 读取目录
isDirectory()方法：测试是否是一个目录。
list() 方法：来提取它包含的文件和文件夹的列表。

### 删除目录或文件
exists()方法：测试文件或目录是否存在。
delete()方法：删除文件或目录。
listFiles()方法：返回一个抽象路径名数组，表示目录中的文件。*/
