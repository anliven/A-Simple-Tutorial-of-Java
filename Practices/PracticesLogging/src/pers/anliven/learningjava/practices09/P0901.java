package pers.anliven.learningjava.practices09;

public class P0901 {

	public static double EvenNum(int num1, int num2, int max) {
		System.out.println("将随机生成" + max + "个" + num1 + "到" + num2 + "之间的偶数");
		int sum = 0;
		int count = 0;
		while (true) {
			int tmp = (int) num1 + (int) (Math.random() * (num2 - num1));
			if (tmp != 0 && tmp % 2 == 0) {
				sum += tmp;
				count++;
				System.out.println("第" + count + "个偶数: " + tmp);
			}
			if (count == max) {
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("和为：" + EvenNum(2, 32, 6));
	}

}

// 随机获取2~32之间的6个偶数，并取得这6个偶数的和。