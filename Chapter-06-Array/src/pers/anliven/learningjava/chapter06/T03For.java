package pers.anliven.learningjava.chapter06;

public class T03For {

	public static void main(String[] args) {

		// for循环遍历数组
		int arr[][] = new int[][] { { 1 }, { 2, 3 }, { 4, 5, 6 } };
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y]);
			}
			System.out.println();
		}

		// for each语句遍历数组
		int arr2[][] = { { 6, 5, 4 }, { 3, 2, 1 } }; // 定义int类型的二维数组
		int i = 0; // 外层循环计数
		System.out.println("数组中的元素分别为：");
		for (int x[] : arr2) { // 遍历每一行
			i++;
			int j = 0; // 内层循环计数
			for (int y : x) { // 遍历每一行的所有元素
				j++;
				if (i == arr2.length && j == x.length) { // 判断是否是二维数组的最后一个元素
					System.out.print(y); // 输出二维数组的最后一个元素的值
				} else
					System.out.print(y + "、");
			}
		}

	}

}
