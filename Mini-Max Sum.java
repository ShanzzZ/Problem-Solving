import java.util.Scanner;

class Solution{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int[]arr = new int[5];
		for(int i=0; i<5; i++){
			arr[i] = scan.nextInt();
		}
		int min = 10^9;
		int max = 1;
		for(int j=0; j<5;j++){
			if(min>arr[j])
				min = arr[j];
			if(max<arr[j])
				max = arr[j];
		}
		int result = 0;
		for(int i=0;i<5;i++){
			result += arr[i];
		}
		
		System.out.print(result-max);
        System.out.print(" ");
        System.out.print(result-min);
	}
}
				
		
		