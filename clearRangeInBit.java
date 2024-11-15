public class clearRangeInBit {
    public static void main(String args[]){
        int num = 10;
        int i = 2;
        int j = 4;
        System.out.println("Result: " + clearRangeinBit(num, i, j));
    }
    public static int clearRangeinBit(int num, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int maskbit = a | b;
        return (num & maskbit);
    }
}
