package aBubbleSort;

public class ABubbleSort {

	public static void main(String[] args) {
		//冒泡排序
		int[] array = {8,63,4,24,1,3,15};
		ABubbleSort sorter = new ABubbleSort();
		sorter.sort(array);

	}
	
	public void sort(int[] array){
		for(int i = 1; i < array.length;i++){
			for(int j=0;j<array.length - i; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		showArray(array);
	}
	
	public void showArray(int[] array){
		for(int i:array){  //foreach语句遍历数组
			System.out.println(">" + i);
		}
		System.out.println();
	}

}
