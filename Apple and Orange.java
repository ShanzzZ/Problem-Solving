import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt(); int end = scan.nextInt();
        int apple = scan.nextInt(); int orange = scan.nextInt();
        int applenum = scan.nextInt(); int orangenum = scan.nextInt();
        
        int count_apple=0; int count_orange=0;
        for(int i = 0; i< applenum; i++){
            int A = scan.nextInt();
            int x = A+apple;
            if(x>=start && x<=end)
                count_apple++;
        }
        System.out.println(count_apple);
        
        for(int i = 0; i< orangenum; i++){
            int B = scan.nextInt();
            int y = B+orange;
            if(y>=start && y<=end)
                count_orange++;
        }
        System.out.println(count_orange);
    }
}
		
			
			