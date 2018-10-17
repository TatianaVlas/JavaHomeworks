import java.util.Scanner;
/*DZ_2 task2*/
public class DetectMinMaxValue {
    public static void main(String[] args) {
        System.out.println("Enter number (type = long:)");
        Scanner scanner = new Scanner (System.in);
        long numberLong = scanner.nextLong();
        FindMinMaxValue(Math.abs(numberLong));
    }

    public static void FindMinMaxValue (long number)
    {
        int min_num = 10;
        int max_num = 0;

        while (number!=0) {
            int newValue = (int) (number%10);

            number = number/10;
            if (newValue > max_num) {
                max_num = newValue;
            }
            if (newValue < min_num) {
                min_num = newValue;
            }
        }
        System.out.println("Max: " + max_num);
        System.out.println("Min: " + min_num);
    }
}
