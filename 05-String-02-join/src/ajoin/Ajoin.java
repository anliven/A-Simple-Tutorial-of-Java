package ajoin;

public class Ajoin {

	public static void main(String args[]) {
		//连接其他数据类型
		int booktime = 1;
		float practice = 1.5f;
		System.out.println("每天" + booktime + "小时看书；"
				+ practice + "小时练习");  //将字符串、整型、浮点型变量相连接，并输出结果
		
		//运算符优先级
		System.out.println("每天" + booktime + "小时看书；"
				+ (practice + booktime) + "小时练习");  //将字符串、整型、浮点型变量相连接，并输出结果
	}

}

/* 字符串连接其他数据类型，会自动调用toString()方法，将其他类型数据转换成字符串形式，然后参与连接。
 * 字符串连接，遵守运算符优先级。
 */