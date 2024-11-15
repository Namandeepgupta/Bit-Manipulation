import java.util.*;

public class ClearithBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter the ith bit: ");
        int ith = sc.nextInt();
        System.out.println("Result: " + clearithBit(num, ith));
    }
    public static int clearithBit(int num, int ith){
        int bitMask = ~(1<<ith);
        return (num & bitMask); 
    }
}
