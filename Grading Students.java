import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0; i<n; i++){
            int temp_grade = scan.nextInt();
            int grade=temp_grade;
            if(temp_grade>=38){
            for(int j=0;j<2; j++){
                temp_grade++;
                if(temp_grade%5==0)
                    grade = temp_grade;
            }
            System.out.println(grade);
            }
            else
            System.out.println(grade);
            }
            
    }
}