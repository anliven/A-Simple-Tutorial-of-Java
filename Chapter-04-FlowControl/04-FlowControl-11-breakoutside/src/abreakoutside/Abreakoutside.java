package abreakoutside;

public class Abreakoutside {

	public static void main(String[] args) {
		Loop: for (int i = 1; i < 3; i++) {  //定义循环体的标签名
			for (int j = 1; j < 5; j++) {
				if (j == 4) {
					break Loop;  //break语句可以跳出指定标签名的循环
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}

}