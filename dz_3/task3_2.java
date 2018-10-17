import java.util.Arrays;
import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        System.out.println("Введите строку для разбора: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int count = 1;
        for (int i=1; i<array.length; i++) {
            if (array[i-1]==array[i]){
                count ++;
            }
            else if (array[i-1]!=array[i])
            {
                System.out.println("Значение " + array[i-1] + " есть " + count + " раз");
                count = 1;
            }
            if ((i==array.length-1)&((array[i-1]==array[i]))){
                System.out.println("Значение " + array[i] + " есть " + count + " раз");
            }
        }
    }
}
