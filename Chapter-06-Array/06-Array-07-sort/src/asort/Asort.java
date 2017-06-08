package asort;
import java.util.Arrays;

public class Asort {

	public static void main(String[] args) {
		//sort()方法对数组进行排序
		int arr[] = new int[]{23,36,16,8,51};
		Arrays.sort(arr);  //对数组进行排序
		for(int i = 0; i < arr.length; i++){
			System.out.println("数组中的第"+ i +"个元素为：" + arr[i]);
		}
		
        String str[] = new String[]{"C","a","6","c","E","1"}; //初始化一维String数组
		Arrays.sort(str);  //对数组进行排序
		for(int i = 0; i < str.length; i++){
			System.out.println("数组中的字符为：" + str[i]);
		}
	}

}
