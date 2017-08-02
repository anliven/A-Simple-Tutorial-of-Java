package pers.anliven.learningjava.practices12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1201 {

	public static void main(String[] args) {
		char a[] = "Anliven".toCharArray();
		int n = 0;
		System.out.println(a);
		try {
			// 创建文件
			File out = new File("word.txt");

			// 加密并写入文件
			for (int i = 0; i < a.length; i++) {
				a[i] = (char) (a[i] ^ 'R');
			}
			FileWriter fw = new FileWriter(out);
			fw.write(a, 0, a.length);
			fw.close();

			// 读取密文
			FileReader fr = new FileReader(out);
			char tom[] = new char[10];
			System.out.println("密文：");
			while ((n = fr.read(tom, 0, 10)) != -1) {
				String s = new String(tom, 0, n);
				System.out.println(s);
			}
			fr.close();

			// 读取明文
			fr = new FileReader(out);
			System.out.println("明文：");
			while ((n = fr.read(tom, 0, 10)) != -1) {
				for (int j = 0; j < n; j++) {
					tom[j] = (char) (tom[j] ^ 'R');
				}
				String str = new String(tom, 0, n);
				System.out.println(str);
			}
			fr.close();

			// 删除文件
			out.delete();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// 创建文件，使用字符输入输出流将一段文字加密后存入文件并读取，然后输出加密后的文件。