//Bubble Sort -- Comaprison Sort Method
import java.util.Arrays;
class BubbleSort{

	static void bubbleSort(int[] arr){
		boolean swapped ;
		for(int i = 0 ; i<arr.length; i++){
			swapped = false;
			for(int j = 1; j<arr.length -i ; j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
				if(!swapped) break;
			

		}

	}	

	public static void main(String args[]){
		int[] arr= {3,1,5,4,2};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
