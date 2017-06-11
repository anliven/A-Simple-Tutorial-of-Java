package afill06;
import java.util.Arrays;

public class Afill06 {

	public static void main(String[] args) {
		//fill()方法填充替换数组元素
		int arr[] = new int[]{1,2,3,4,5};
		Arrays.fill(arr,1,2,6);  //填充替换指定索引范围的值
		for(int i = 0; i < arr.length; i++){
			System.out.println("数组中的第"+ i +"个元素为：" + arr[i]);
		}
		
        String str[] = new String[]{"a","b","c","d"}; //初始化一维String数组
		Arrays.fill(str,1,2,"e");  //填充替换指定索引范围的值
		for(int i = 0; i < str.length; i++){
			System.out.println("数组中的字符为：" + str[i]);
		}
	}

}

/* 如果指定替换部分的开始索引fromIndex和结束索引toIndex一致，则填充范围为空。
 * 指定索引位置不能大于或等于数组的长度，否则会报错java.lang.ArrayIndexOutOfBoundsException。
 */
