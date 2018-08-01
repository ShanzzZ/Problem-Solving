import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        int result = Valleys(s,n);
        System.out.println(result);
    }
    static int Valleys(String s,int n){
        int count=0; int valley=0; 
        for(char c:s.toCharArray()){
        if(c=='U') count++;
        else count--;
        
        if(count==0 && c=='U') valley++;
        }
        return valley;
    }
}
		
	