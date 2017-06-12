package aSelectSort;

public class ASelectSort {

	public static void main(String[] args) {
		int[] array = {8,63,4,24,1,3,15};
		ASelectSort sorter = new ASelectSort();
		
        System.out.println("原数组内容：");  
        sorter.showArray(array);
        System.out.println("直接选择排序后的数组内容：");  
		sorter.sort(array);  //调用排序方法将数组排序
        sorter.showArray(array);  
	}
	
	public void sort(int[] array){
		//直接选择排序
		int index;
		for (int i=1;i<array.length;i++){
			index = 0;
			for (int j=1;j<=array.length-i;j++){
				if (array[j]>array[index]){
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index] = temp;
		}
	}
	
	public void showArray(int[] array){
		for(int i:array){
			System.out.print(" ->"+i);
		}
		System.out.println();
	}
}