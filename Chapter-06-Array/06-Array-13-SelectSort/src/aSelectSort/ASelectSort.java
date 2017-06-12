package aSelectSort;

public class ASelectSort {

	public static void main(String[] args) {
		//直接选择排序
		int[] array = {8,63,4,24,1,3,15};
		ASelectSort sorter = new ASelectSort();
		sorter.sort(array);
	}
	

	public void sort(int[] array){
		int index;
		for (int i = 1; i < array.length; i++){
			index = 0;
			for (int j = 1; j <= array.length - i; j++){
				if (array[j] > array[index]){
					index = j;
				}
			}
			int temp = array[array.length - i];
			array[array.length - i] = array[index];
			array[index] = temp;
		}
		showArray(array);
	}
	
	public void showArray(int[] array){
		for(int i:array){
			System.out.println(">" + i);
		}
	}
}