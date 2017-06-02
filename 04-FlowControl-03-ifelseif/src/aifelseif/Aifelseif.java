package aifelseif;

public class Aifelseif {
	
	public static void main(String args[]) {
		int x = 20;
		if (x > 30) {
			System.out.println("a的值大于30");
		} else if (x > 10) { // 判断变量x是否大于10
			System.out.println("a的值大于10，但小于30");
		} else if (x > 0) { // 判断变量x是否大于0
			System.out.println("a的值大于0，但小于10");
		} else {
			System.out.println("a的值小于0");
		}
	}
	
}