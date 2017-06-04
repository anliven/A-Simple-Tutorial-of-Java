package aif;

public class Aif {
	
	public static void main(String args[]) {
		int x = 45;
		int y = 12;
		if (x > y) {
			System.out.println("变量x大于变量y");
		}
		if (x < y) 
			System.out.println("变量x小于变量y");  //语句序列中只有一条语句，则可以省略条件语句中的“{}”
	}
	
}

//为了增强程序的可读性，不建议省略条件语句中的“{}”