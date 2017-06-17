package aforeach;

public class Aforeach {

	public static void main(String args[]) {
		int arr[] = { 7, 10, 1 };
		System.out.println("一维数组中的元素分别为：");
		for (int x : arr) {  //foreach语句遍历数组
			System.out.println(x);
		}
	}

}

/*

- foreach语句是for语句的特殊简化版本
- foreach语句中的元素变量，不必进行初始化

*/