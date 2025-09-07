import java.util.Scanner;

public class equal {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter a : ");
    int a = sc.nextInt();

    System.out.println("Enter b : ");
    int b = sc.nextInt();

    if(a == b){
        System.out.println("equal");
    }else if(a > b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("a is lesser than b");
        }
        sc.close();
    }
    }

    

