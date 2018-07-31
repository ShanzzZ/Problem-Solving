import java.util.Scanner;

class Solution{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        int[] result = Breaking(arr);
        for(int a: result){
        System.out.print(a+" ");
        }
    }
    
    static int[] Breaking(int[]arr){
        int[]results = new int[]{0,0};
        int max = arr[0]; int min = arr[0];
        
        for(int value:arr){
            if(value>max){
                results[0]++;
                max = value;
            }
            if(value<min){
                results[1]++;
                min = value;
            }
        }
        return results;
    }
}
			
			