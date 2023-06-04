import java.util.*;
class MaxIn2DArray{
	static int max(int[][] arr){
		int max = Integer.MIN_VALUE;
		for(int row =0 ; row<arr.length; row++){

			for(int col = 0 ; col<arr[row].length; col++){
				if(arr[row][col]>max){
					max = arr[row][col];
				}
			}

		}
		return max;	
	}
	public static void main(String[] args){
		int[][] arr = {
			{10,20,30,40},
			{50,60,70},
			{80,90},
			{100}
		};
		System.out.println(max(arr));

	}
}
