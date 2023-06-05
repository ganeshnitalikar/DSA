//binary search in ascendingly sorted array


class BinarySearch{
	static int binarySearch(int[] arr ,int target){
		int start = 0 ;
		int end = arr.length -1;

		while(start<=end){
			int mid = start + (end-start)/2;

			if(arr[mid] == target){
				return mid;
			}
			if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int arr[] = {-2,-1,0,4,5,7,23,34,75,86,100};
		int target = 7;
		System.out.println(binarySearch(arr,target));
	}
}
