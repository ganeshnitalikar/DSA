//agnostic binary Search 
import java.util.*;
class BinarySearch{

	static int binarySearch(int[] arr, int target){
		int start = 0;
		int end = arr.length-1;
		boolean check = arr[start]<arr[end];
		while(start<=end){
			int mid = start + (end-start)/2;

			if(arr[mid]==target){
				return mid;
			}

			if(check){
				if(target<arr[mid]){
					end = mid -1;
				}else{
					start  = mid +1;
				}	
			}else{
				if(target>arr[mid]){
					end = mid-1;
				}else{
					start = mid +1;
				}
			}
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Size Of Array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements Of Array");
		for(int i =0; i<size ; i++){
			arr[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter Element You Want To Search");
		int target = in.nextInt();

		System.out.println(binarySearch(arr,target));
	}

}	
