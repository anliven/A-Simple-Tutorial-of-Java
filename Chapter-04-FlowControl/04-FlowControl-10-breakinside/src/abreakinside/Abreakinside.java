package abreakinside;

public class Abreakinside {

	public static void main(String[] args) {
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 5; j++) {
				if (j == 4) {
					break;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
	
}

/*

- 使用break语句可以跳出switch语句，可以跳出当前循环体， 从而中断当前循环。
- 对于嵌套循环，break语句只能跳出包含它的那一层循环。

*/