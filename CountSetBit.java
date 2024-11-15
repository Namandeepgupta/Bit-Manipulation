import java.util.*;

public class CountSetBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("Set Bit: " + setBitCount(num));
    }
    public static int setBitCount(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num >>= 1; 
        }
        return count;
    }
}
