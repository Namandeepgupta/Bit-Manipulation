import java.util.*;

public class SetithBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter ith bit: ");
        int ith = sc.nextInt();
        System.out.println("Result: " + setithBit(num,ith));
    }
    public static int setithBit(int num, int ith){
        int maskbit = 1<<ith;
        return(num | maskbit);
    }
}
