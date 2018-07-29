import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		double pos= 0; double neg= 0; double zero= 0;
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
			
			if(arr[i]>0) pos++;
			else if(arr[i]<0) neg++;
			else zero++;
		}
		
		System.out.println(pos/n);
		System.out.println(neg/n);
		System.out.println(zero/n);
	}
}
		
			
	