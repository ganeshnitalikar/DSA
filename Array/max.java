import java.util.*;
class Max{
	static int max(int[] arr ){
		int max = Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;

	}

	public static void main(String args[]){
		int[] arr = {10,20,30,40,50};
		int ans = max(arr);
		System.out.println("MAX OF ARRAY " + Arrays.toString(arr) +"  is"+ans); 
	}
}
