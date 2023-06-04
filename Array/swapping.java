import java.util.*;
class SwapTwoElments{
    static void swapEle(int[] arr ,int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
	swapEle(nums,0,4);
    }
}
