import java.util.*;

public class UpdateithBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter to update ith bit: ");
        int ith = sc.nextInt();
        System.out.print("Enter new bit: ");
        int newBit = sc.nextInt();
        System.out.println("After updation: " + updateithBit(num, ith, newBit));
    }
    public static int updateithBit(int num, int ith, int newBit){
        int maskbit = clearbit(num, ith);
        return (maskbit | (newBit<<ith));
    }
    /*
    public static int updateithBit(int num, int ith, int newBit){
        int maskbit = 1<<ith;
        if(newBit == 0){
            return clearbit(num, ith);
        }
        else{
            return setbit(num, ith);
        }
    }
    */
    public static int clearbit(int num, int ith){
        int maskbit = ~(1<<ith);
        return (num & maskbit);
    }
    /* 
    public static int setbit(int num, int ith){
        int maskbit = 1<<ith;
        return (num | maskbit);
    }
    */
}
