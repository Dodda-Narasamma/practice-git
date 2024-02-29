package myPackage;
import java.util.Scanner;
public class Demo {
    public static long convert(long num){
       // 11001 ->25
        int i = 0;
        long res = 0;
        while (num > 0){
            long rem = num % 10;
            res = res + rem * pow(2, i);
            i++;
            num = num / 10;
        }
        return res;
    }
    public static int pow(int base, int power){
        int res = 1;
        for(int i = 1; i <= power; i++){
            res = res * base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        long n = sc.nextLong();
        System.out.println(convert(n));
        sc.close();
    }
}
