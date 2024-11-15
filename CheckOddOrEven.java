import java.util.*;

public class CheckOddOrEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        OddOrEven(num);
    }
    public static void OddOrEven(int num){
        int bitmask = 1;
        if((num & bitmask) == 1){
            System.out.println(num + " is odd number.");
        }
        else{
            System.out.println(num + " is even number.");
        }
    }
}