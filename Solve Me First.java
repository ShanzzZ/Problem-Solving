import java.util.Scanner;

class Solution{
	public static int solveMeFirst(int a, int b){//Method is independent
		return a+b;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		scan.close();
		
		int sum;
        sum = solveMeFirst(x, y);
        System.out.println(sum);
        
	}
}