import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[]arr = new int[n*n];
		for(int i = 0; i < n*n; i++){
			arr[i] = scan.nextInt();
			}
		
	    int sumA=0; int sumB=0;
	    for(int i = 0; i < n; i++){
             sumA += arr[(n*i)+i];
             sumB += arr[(n*i)+(n-i-1)];
        }
			
			int sum = Math.abs(sumA-sumB);
			System.out.println(sum);
	}
}
			
			
			
			
		
		