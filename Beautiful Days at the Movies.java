import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); int j = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        int result = Beautiful(i,j,k);
        System.out.println(result);
    }
    static int Beautiful(int i, int j, int k) {
    int count=0;
    for (int x = i; x <= j ; x++){
        int num = x;
        int rNum = 0;

        while (num != 0){
            int quo = num % 10;
            rNum = 10 * rNum + quo;
            num = num / 10;
        }
        int diff = Math.abs(x- rNum);
        if (diff%k==0) count++;
    }
        return count;
    }
}
			
			
		