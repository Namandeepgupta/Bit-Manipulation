import java.util.*;

public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("After addition of 1: " + -~num);
    }
}
