import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            
            if(n % 2 == 0)
                System.out.println((int) (Math.pow(2, n/2)*2) -1);
            else
                System.out.println((int) ((Math.pow(2, (n-1)/2)*2) -1)*2);
        }
    }
}
		
			