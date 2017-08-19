package pers.anliven.learningjava.chapter06;

public class T01Single {

	public static void main(String[] args) {
		// 创建并初始化一维数组
		int day[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; //// 声明并初始化一维int数组
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "月有" + day[i] + "天 ; ");
		}

		String str[] = { "a", "b", "c", "d" }; // 初始化一维String数组(声明数组、分配空间和赋值)
		// String str[] = new String[]{"a","b","c","d"}; //初始化一维String数组
		for (int i = 0; i < str.length; i++) { // 数组名.length, 用于获取数组的长度
			System.out.println("字符：" + str[i]);
		}
		
		int scores[] = new int[5];
		scores[0] = 86;
		scores[1] = 91;
		scores[2] = 98;
		for (int score:scores) { // for-each语句 
			System.out.println("分数：" + score);
		}

		int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
		int max = nums[0]; // 假定最大值为数组中的第一个元素
		int min = nums[0]; // 假定最小值为数组中的第一个元素
		double sum = 0;// 累加值
		double avg = 0;// 平均值
		for (int i = 0; i < nums.length; i++) { // 循环遍历数组中的元素
           if(nums[i]>max){ // 如果当前值大于max，则替换max的值
               max = nums[i];
           }
            if(nums[i]<min){ // 如果当前值小于min，则替换min的值
               min = nums[i];
           }
        sum = sum + nums[i]; // 累加求和
		}
       avg = sum/nums.length; // 求平均值
       System.out.println("数组中的最大值：" + max);
       System.out.println("数组中的最小值：" + min);
       System.out.println("数组中的平均值：" + avg);
	}

}

/*
 * 数组是具有相同数据类型的一组数据的集合。 
 * 根据数组的维数可分为一维数组、二维数组等。
 * 
 * 声明数组的语法：“数据类型[ ] 数组名”或者“数据类型 数组名[ ]”
 * 
 * 数组中元素都是通过下标来访问的，一维数组的下标是从0开始。
 * 在声明数组时，可以赋值或指定数组长度，但不能同时赋值和指定数组长度。
 * 
 */