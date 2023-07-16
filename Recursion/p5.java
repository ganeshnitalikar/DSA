class SumOfDigit{
	static int sumOfDigit(int n){
		int temp = n ;
		int sum = 0 ;
		while(temp!=0){
			int rem = temp%10;
			sum = sum + rem;
			temp = temp/10;
		}
		return sum;
	}
	static int sumRec(int n ){
		if(n==0){
			return 0;
		}
		return n%10 + sumRecr(n/10);
	}
	public static void main(String[] args){
		System.out.println(sumOfDigit(23483));
		System.out.println(sumRecr(23483));
	}
}
