import java.util.*;

public class Question4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String ch = sc.next();
        for(int i = 0; i < ch.length(); i++){
            System.out.print((char)(ch.charAt(i) | ' '));
        }
    }
}
