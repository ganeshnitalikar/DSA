class Minimum{
	static int minIndex(int[] arr){
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i<arr.length; i++){
			if(arr[i]<ans){
				ans = arr[i];
			}
		}
		return ans;
	}
	public static void main(String args[]){
		int[] arr = {10,20,30,40,50};
		System.out.println(minIndex(arr));
	}
}
