import java.util.Scanner;

public class apple {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }
        sc.close();
    }
    
}

//there are conditional statements in java
//1. this is if else condition
//2. else if
//3.break
//4.continue
