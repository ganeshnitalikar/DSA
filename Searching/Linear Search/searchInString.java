class SearchInString{
	static int search(String str,char target){
		if(str.length()==0){
			return -1;
		}
		for(int i = 0; i<str.length(); i++){
			if(target==str.charAt(i)){
				return i;
			}
		}
		return -1;
	}
	static boolean doesExist(String str, char target){
		for(char ch : str.toCharArray()){
			if(ch==target){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		String name = "Ganesh";
		char target = 'e';
		char tar = 'z';

		System.out.println(search(name,target));
		System.out.println(doesExist(name,tar));
	}

}
