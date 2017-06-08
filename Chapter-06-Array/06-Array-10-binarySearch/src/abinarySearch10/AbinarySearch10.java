package abinarySearch10;
import java.util.Arrays;

public class AbinarySearch10 {

	public static void main(String[] args) {
		//binarySearch方法在指定数组搜索元素，返回对应元素的索引值
		int arr[] = new int[]{6,33,41,13,9,1};
		Arrays.sort(arr);  //数组排序
		int index1 = Arrays.binarySearch(arr, 13);  //寻找元素的索引位置
		System.out.println("索引位置是："+ index1);
		int index2 = Arrays.binarySearch(arr, 8);  //寻找元素的索引位置
		System.out.println("索引位置是："+ index2);
	}

}

/* 查找之前必须对数组进行排序，利用Arrays.sort()方法。 
 * 如果指定数组包含搜索元素，返回对应元素的索引值；否则返回“-1”或“-插入点”。
 * 插入点是搜索键将要插入数组的索引位置，即第一个大于此键的元素索引。
 */