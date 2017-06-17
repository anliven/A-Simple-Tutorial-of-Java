package aif;

public class Aif {
	
	public static void main(String args[]) {
		int x = 45;
		int y = 12;
		if (x > y) {  //简单if条件语句
			System.out.println("变量x大于变量y");
		}
		if (x < y) 
			System.out.println("变量x小于变量y");  //语句序列中只有一条语句，则可以省略条件语句中的“{}”
	}
	
}

//为了增强程序的可读性，不建议省略条件语句中的“{}”

/*

### 复合语句
- 以整个块区为单位的语句被称为复合语句，也称为块语句。
- 复合语句由开括号“{”开始到闭括号“}”结束。
- 复合语句中的每个语句都是从上到下被执行。
- 复合语句为局部变量创建了一个作用域，作用域外使用该变量，则会报错。

*/