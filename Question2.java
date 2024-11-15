import java.util.*;

public class Question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int n2 = sc.nextInt();
        swapNumbers(n1,n2);
    }
    public static void swapNumbers(int n1, int n2){
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("After Swapping :- ");
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);
    }
}
