package aforeach;

public class Aforeach {

	public static void main(String[] args) {
		//for each语句遍历数组
		int arr[][] = {{6,5,4},{3,2,1}};  //定义int类型的二维数组
		int i = 0;  //外层循环计数
		System.out.println("数组中的元素分别为：");
		for(int x[] : arr){ //遍历每一行
			i++;
			int j = 0;  //内层循环计数
			for(int y : x){  //遍历每一行的所有元素
				j++;
				if(i==arr.length && j==x.length){  //判断是否是二维数组的最后一个元素
					System.out.print(y);  //输出二维数组的最后一个元素的值
				}
				else
					System.out.print(y + "、");
			}
		}

	}

}

/* 如果一个一维数组中的各个元素仍然是数组，这个数组就是一个二维数组。
 * 二维数组常用于表示表，第一个下标表示元素所在的行，第二个下标表示元素所在的列。
 */