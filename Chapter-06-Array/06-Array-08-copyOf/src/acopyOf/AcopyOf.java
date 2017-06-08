package acopyOf;
import java.util.Arrays;

public class AcopyOf {

	public static void main(String[] args) {
		//cpoyOf()方法复制数组至指定长度
		int arr[] = new int[]{1,2,3};
		int newarr1[] = Arrays.copyOf(arr,5);  //复制数组
		for(int i = 0; i < newarr1.length; i++){
			System.out.println("新数组中的第"+ i +"个元素为：" + newarr1[i]);
		}
		
        String str[] = new String[]{"a","b","c","d"};
		String newarr2[] = Arrays.copyOf(str,6);  //复制数组
		for(int i = 0; i < newarr2.length; i++){
			System.out.println("数组中的字符为：" + newarr2[i]);
		}
	}

}

/* 如果新数组长度大于原数组长度，整型数组用0填充，char型数值用null填充。
 */