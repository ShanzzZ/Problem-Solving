import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[]arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n;i++){
			arr[i] = scan.nextInt();
			sum +=arr[i];
		}
		scan.close();
		System.out.println(sum);
	}	
}
			
			
		