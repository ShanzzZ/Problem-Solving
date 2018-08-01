import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		scan.close();
		String result = Calendar(y);
		System.out.println(result);
	}
	
	static String Calendar(int y){
		if(y==1918) return "26.09.1918";
		if(isLeap(y)) return "12.09." + Integer.toString(y);
		else return "13.09." +Integer.toString(y);
	}
	static boolean isLeap(int y){
		if(y%4!=0) return false;
		if(y>1918 && y% 100 == 0 && y% 400 != 0 ) return false;
		return true;
		
	}
}
			
			
			
				
				
			