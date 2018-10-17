import java.util.Scanner;
/* DZ_2 task3*/
public class FindFibonachyNumber {
    public static void main(String[] args) {
        System.out.println("Enter index of Fibonachy number:");
        int index = new Scanner(System.in).nextInt();
        System.out.printf("FibonachyNumber of index %d: %d%n" , index, getFibonachyNumber(index));
    }

    public static int getFibonachyNumber(int n) {
        int res = 0;
        if (n==0) {
            res =  0;
        }
        if(n==1) {
            res =  1;
        }
        if(n==2) {
            res =  1;
        }
        if (n > 2) {
            res =  getFibonachyNumber(n-1) + getFibonachyNumber(n-2);
        }
        return res;
     }
}
