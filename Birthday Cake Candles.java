import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		long[]arr = new long[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		
		long height = 1;
		for(int i = 0; i < n; i++){
			if(arr[i]>height)
				height = arr[i];
		}
		
		int sum = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == height)
				sum++;
		}
		System.out.println(sum);
	}
}
			