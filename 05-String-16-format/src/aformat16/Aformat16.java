package aformat16;

public class Aformat16 {

	public static void main(String[] args) {
		//常规类型的格式化
		String str1 = String.format("%b", 5>9);  //结果被格式化为小写的布尔类型
		String str2 = String.format("%B", 8>6);  //结果被格式化为大写的布尔类型 
		System.out.println("5大于9，正确吗：" + str1);
		System.out.println("8大于6，正确吗：" + str2);
		
		String str3 = String.format("%h", "ABC");  //结果被格式化为小写的散列码，"%H"表示大写
		System.out.println("字符串ABC的散列码为：" + str3);
		
		String str4 = String.format("%s", 10/3);  //结果被格式化为小写的字符串类型，"%S"表示大写
		System.out.println("10/3的结果为：" + str4);
		
		String str5 = String.format("%x", 19);  //结果被格式化为小写的十六进制数，"%X"表示大写
		System.out.println("19转化十六进制数为：" + str5);

	}

}

/* 了解常规类型转换符
 */