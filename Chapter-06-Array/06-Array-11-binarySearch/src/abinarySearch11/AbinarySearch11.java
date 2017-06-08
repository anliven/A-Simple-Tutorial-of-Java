package abinarySearch11;
import java.util.Arrays;

public class AbinarySearch11 {

	public static void main(String[] args) {
		//binarySearch方法在指定数组搜索元素，返回对应元素的索引值
		String str[] = new String[]{"ab","cd","ef","xy"};
		Arrays.sort(str);  //数组排序
		int index = Arrays.binarySearch(str,0,2,"cd");  //在指定范围寻找元素
		System.out.println("索引位置是："+ index);
	}

}

/* 指定索引位置不能大于或等于数组的长度，否则会报错java.lang.ArrayIndexOutOfBoundsException。
 */