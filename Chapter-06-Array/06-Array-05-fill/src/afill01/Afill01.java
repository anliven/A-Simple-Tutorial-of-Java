package afill01;
import java.util.Arrays;  //导入java.util.Arrays类

public class Afill01 {

	public static void main(String[] args) {
		//fill()方法填充替换数组元素
		int arr1[] = new int[3];
		Arrays.fill(arr1,8);  //使用同一个数值填充
		for(int i = 0; i < arr1.length; i++){
			System.out.println("数组中的第"+ i +"个元素为：" + arr1[i]);
		}
		
		int arr2[][] = new int[2][2]; //声明二维数组
		for(int x = 0; x < arr2.length; x++){
			Arrays.fill(arr2[x],6);  //使用同一个数值填充
			for(int y = 0; y < arr2[x].length; y++){
				System.out.println("数组中第"+ x + "行" + y +"列的元素为：" + arr2[x][y]);
			}
		}
	}

}
