import java.util.Scanner;

class Solution{
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += scan.nextLong();
        }
        
        System.out.print(sum);
        scan.close();    
    }
}


			
		