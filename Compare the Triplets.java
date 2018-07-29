import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[]a = new int[3]; 
		int[]b = new int[3];			
		
		for(int i=0;i<3;i++){
			a[i] = scan.nextInt();
		}
		for(int i=0;i<3;i++){
			b[i] = scan.nextInt();
		}

		int r1=0; 
		int r2=0;
		for(int i=0;i<3;i++){		
			if(a[i] > b[i])  r1++;
			else if(a[i] < b[i])  r2++;
		}
		
		System.out.println(r1+" "+r2);
	}
}
			
		
		
		
		
		
	