import java.util.*;
class Program{
	static int linearSearch(int[] arr,int target){
		if(arr.length==0){
			return -1;
		}
		for(int i = 0 ; i<arr.length; i++){
			int element = arr[i];
			if(element == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50};
		int ans = linearSearch(arr,40);
		System.out.println("Element 40 found at " + ans + " in array " + Arrays.toString(arr));
	}
}
