import java.util.*;

public class FastExponentiation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter exponential power: ");
        int pow = sc.nextInt();
        System.out.print("Result: " + fastExponential(num,pow));
    }
    public static int fastExponential(int num, int pow){
        int ans = 1;
        while(pow > 0){
            if( (pow & 1) == 1 ){
                ans = ans * num;
            }
            pow >>= 1;
            num *= num;
        }
        return ans;
    }
}
