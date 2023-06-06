class Ceiling {

	static int ceiling(int[] arr , int target){
		int start = 0 ;
		int end = arr.length-1;
		if(target>arr[end]){
			return -1;
		}
		while(start<=end){
			int mid = start + (end-start)/2;
			if(arr[mid] == target){
				return mid;
			}
			if(arr[mid]>target){
				end = mid-1;
			}
			if(arr[mid]<target){
				start = mid+1;
			}
		}
		return start;
	}

	public static void main(String args[]){
		int[] arr = {10,20,30,40,50};
		int target = 35;
		System.out.println(ceiling(arr,target));
		System.out.println(ceiling(arr,55));
	}
}
