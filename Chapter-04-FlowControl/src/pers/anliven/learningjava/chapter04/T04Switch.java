package pers.anliven.learningjava.chapter04;

public class T04Switch {

	public static void main(String args[]) {
		int week = 3;
		switch (week) { // switch多分支语句，实现“多选一”的选择场景
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
		case 5:		
			System.out.println("Working day");
			break;			
		default: // 可选语句
			System.out.println("Sorry,I don't Know");
		}
	}

}

/*
 * 
 * ### switch语句 
 * switch多分支语句，实现“多选一”的选择场景 
 * switch后面小括号中的表达式值和常量值，都必须为整型、字符型或字符串类型
 * case后面的值可以是常量数值或常量表达式，但不能是变量或带有变量的表达式
 * 功能相同的case语句可以合并，只需要在最后一个case语句中指定内容
 * default语句为可选的，可以出现在任意位置，也可以省略
 * 如果表达式值不与任何case常量值相同，而且没有default语句，那么switch则不做任何处理
 * 
 */