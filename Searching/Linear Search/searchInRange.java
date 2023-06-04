class searchInRange{
	
	static int searchInRange(int[] arr,int start , int end,int target){
		for(int index = start ; index<=end; index++){
			int element = arr[index];
			if(element==target){
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {10,20,30,40,50};
		System.out.println(searchInRange(arr,0,2,20));
	}
}
