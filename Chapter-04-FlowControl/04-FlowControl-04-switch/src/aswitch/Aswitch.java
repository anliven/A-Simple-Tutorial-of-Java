package aswitch;

public class Aswitch {
	
	public static void main(String args[]) {
		int week = 3;
		switch (week) { //switch多分支语句，实现“多选一”的选择场景
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			default:  //可选语句
				System.out.println("Sorry,I don't Know");
		}
	}
	
}

/*

### switch语句
- switch多分支语句，实现“多选一”的选择场景
- switch语句中的表达式值和常量值，都必须为整型、字符型或字符串类型。
- default语句为可选的
- 如果表达式值不与任何case常量值相同，而且没有default语句，那么switch则不做任何处理。

*/