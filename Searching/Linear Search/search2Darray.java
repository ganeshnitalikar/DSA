import java.util.*;
class SearchIn2DArray{
	
	static int[] search(int[][] arr , int target){
		for(int row=0; row<arr.length; row++){

			for(int col=0; col<arr[row].length; col++){
				if(arr[row][col]==target){
					return new int[]{row,col};	
				}
			}
		}
		return new int[]{-1,-1};
	}

	public static void main(String[] args){
		int[][] arr = {
			{10,20,30,40},
			{50,60,70},
			{80,90},
			{100}
		};
		System.out.println(Arrays.toString(search(arr,40)));
	}
}
