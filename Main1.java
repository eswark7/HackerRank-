//Question 2
/*Task
Given an integer, , print its first  multiples. Each multiple  
(where ) should be printed on a new line in the form: N x i = result.
(2 x 1 = 2)*/
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int N=scan.nextInt();
        for(int i=1;i<=10;i++){
            int result=N*i;
            System.out.println(N+" x "+i+" = "+result);        
        }
    }
}
