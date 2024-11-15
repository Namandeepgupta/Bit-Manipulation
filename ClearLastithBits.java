import java.util.*;

public class ClearLastithBits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter ith bits: ");
        int ith = sc.nextInt();
        System.out.println("The Result: " + clearLastiBits(num, ith));
    }
    public static int clearLastiBits(int num, int ith){
        int maskbit = (~0)<<ith;
        return (num & maskbit);
    } 
}
