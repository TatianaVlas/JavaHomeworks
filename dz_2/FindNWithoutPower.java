import java.util.Scanner;
/*DZ_2 task4*/
public class FindNWithoutPower {
    public static void main(String[] args) {
        System.out.println("Enter integer number:");
        int number = new Scanner(System.in).nextInt();
        if (number <=1) {
            System.out.println("Number <=1!");
        }
        else {
            if(number%2 !=0){
                System.out.println("Number != 2^n!");
            }
            else {
                System.out.println(number + " = 2^" + findNumberDegree(number));
            }
        }
    }

    /*public static int findNumDegree(int num) {
        int count=0;

        if(num/2==1){
            count++;
        }
        num = num/2;
        return count;
    } */

    public static int findNumberDegree(int num) {
        int power =0;
        /*if (num/2==1){
            return power ;
        } */
        while(num/2!=0) {
            num = num/2;
            power++;
        }
        return power;

     }
}
