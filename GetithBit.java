import java.util.*;

public class GetithBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter the ith number: ");
        int ith = sc.nextInt();
        System.out.println("The ith bit: " + ithBit(num, ith));
    }
    public static int ithBit(int num, int ith){
        int bitMask = 1<<ith;
        if( (num & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
