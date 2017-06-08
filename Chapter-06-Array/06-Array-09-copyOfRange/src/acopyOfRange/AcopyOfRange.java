package acopyOfRange;
import java.util.Arrays;

public class AcopyOfRange {

	public static void main(String[] args) {
		//cpoyOfRange()方法复制数组的指定长度到一个新数组
		int arr[] = new int[]{1,2,3,4,5,6};
		int newarr1[] = Arrays.copyOfRange(arr,3,9);  //复制数组
		for(int i = 0; i < newarr1.length; i++){
			System.out.println("新数组中的第"+ i +"个元素为：" + newarr1[i]);
		}
		
        String str[] = new String[]{"a","b","c","d","e"};
		String newarr2[] = Arrays.copyOfRange(str,3,9);  //复制数组
		for(int i = 0; i < newarr2.length; i++){
			System.out.println("数组中的字符为：" + newarr2[i]);
		}
	}

}

/* 如果新数组长度大于原数组长度，整型数组用0填充，char型数值用null填充。 
 * 开始索引formIndex必须在0至数组长度之间。
 * 如果结束索引toIndex大于数组长度，系统会根据复制数组类型来填充，整型数组用0填充，char型数值用null填充。
 */