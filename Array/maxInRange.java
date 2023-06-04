class maxInRange{
	
	static int maxRange(int[] arr,int start,int end){
		if(end<start){
			return -1;
		}
		if(arr==null){
			return -1;
		}
		int maxVal = Integer.MIN_VALUE;

		for(int i =start ; i<=end ; i++){
			if(arr[i]>maxVal){
				maxVal = arr[i];
			}	
		}
		return maxVal;
	}

	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		int ans = maxRange(arr,1,3);
		System.out.println(ans);
	}

}
