//print the table of any number using for loop
import java.util.Scanner;
public class ques2loop {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(n * i);
        }
        sc.close();

    }
    
}
