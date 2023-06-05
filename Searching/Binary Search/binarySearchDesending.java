//binary search in decendingly sorted array

class BinarySearch{
	
	static int binarySearch(int[] arr,int target){
		int start = 0;
		int end = arr.length-1;

		while(start<=end){
			int mid = start + (end-start)/2;
			if(arr[mid] == target){
				return mid;
			}
			if(target>arr[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int[] arr = {100,90,70,50,30,20,12,1,-1};
		int target = 50;
		System.out.println(binarySearch(arr,target));
	}
}
