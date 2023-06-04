import java.util.*;
class MinIn2DArray{
	static int min(int[][] arr){
		int min = Integer.MAX_VALUE;
		for(int row = 0 ; row < arr.length; row++){

			for(int col = 0; col<arr[row].length; col++){
				if(arr[row][col]<min){
					min = arr[row][col];
				}
			}
		}
		return min;
	}
	public static void main(String args[]){
		int[][] arr = {
			{10,20,30,40},
			{50,60,70},
			{80,90},
			{100}
		};

		System.out.println(min(arr));
	}
}
