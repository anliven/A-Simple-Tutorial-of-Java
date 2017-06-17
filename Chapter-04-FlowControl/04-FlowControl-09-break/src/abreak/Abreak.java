package abreak;

public class Abreak {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			if (i == 6) {
				break;  //跳出当前循环体
			}
		}
		System.out.println("---end---");
	}

}

/*

- 使用break语句可以跳出switch语句，可以跳出当前循环体， 从而中断当前循环。
- 对于嵌套循环，break语句只能跳出包含它的那一层循环。

*/