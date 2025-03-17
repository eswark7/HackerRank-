//Question 1

/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int N = scan.nextInt();
        if (N %2 != 0){
            System.out.println("Weird");
        }
        else{
            if(N %2 == 0 && N >=2 && N <=5 ){
            System.out.println("Not Weird");
            }
            if (N %2 == 0 && N >=6 && N <=20 ){
            System.out.println("Weird");
            }
            if (N%2==0 && N > 20){
            System.out.println("Not Weird");
            }
          }
    }
}
