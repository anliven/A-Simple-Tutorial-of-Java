package afor;

public class Afor {

	public static void main(String[] args) {
		//for循环遍历数组
		int arr[][] = new int[][]{{1},{2,3},{4,5,6}};
		for(int x = 0; x < arr.length; x++){
			for(int y = 0; y < arr[x].length; y++){
				System.out.print(arr[x][y]);
			}
			System.out.println();
		}
	}

}