package aReverseSort;

public class AReverseSort {
	
    public static void main(String[] args) {
        int[] array = {8,63,4,24,1,3,15};
        AReverseSort sorter=new AReverseSort();
        
        System.out.println("原数组内容：");  
        showArray(array);
        
        System.out.println("直接选择排序后的数组内容：");  
        SelectSort(array);  //调用排序方法将数组排序
        showArray(array);  
        
        System.out.println("反转排序后的数组内容：");  
        sorter.ReverseSort(array); //调用排序方法将数组排序,这里是将已经排序的数组内容做反转排序。
        showArray(array);  
    }  

    public static void SelectSort(int[] array){
    	//直接选择排序
        int index;
        for(int i=1;i<array.length;i++){
            index = 0;
            for(int j=1;j<=array.length-i;j++){
                if (array[j]>array[index]){
                    index = j;
                }
            }
            int temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index] = temp;
        }
    }
    
    public void ReverseSort (int[] array){
    	//反转排序
        int len = array.length;
        for(int i=0;i<len/2;i++){
            int temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
    }
    
    public static void showArray(int[] array) {
        for(int i:array){
            System.out.print(" ->"+i);
        }
        System.out.println();
    }
    
}  