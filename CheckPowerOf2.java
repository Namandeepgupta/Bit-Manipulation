import java.util.*;

public class CheckPowerOf2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check power of 2: ");
        int num = sc.nextInt();
        System.out.println("Result: " + checkPowerOf2(num));
    }
    public static boolean checkPowerOf2(int num){
        return ((num & (num-1)) == 0);
    }
}
