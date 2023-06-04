import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
class UserDefined{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows In Array ");
		//int row = Integer.parseInt(br.readLine());
		int row = sc.nextInt();
		System.out.println("Enter Cols In Array ");
		//int col = Integer.parseInt(br.readLine());
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i = 0 ; i< row ; i++){
		System.out.println("Enter Elements In Row : "+ i);
			for(int j = 0 ; j< col ;j++){
				//arr[i][j] = Integer.parseInt(br.readLine());
				arr[i][j] = sc.nextInt();
			}	
		}

		System.out.println(Arrays.deepToString(arr));
	}
}
