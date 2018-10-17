import java.util.Scanner;

/* DZ_2 task1*/
public class UserFrame {
    private static int maxLen = 0;
    private static final int EXTRA_SYMBOLS = 2;
    public static void main(String[] args) {

        String course = "Курс: Java core";
        String student = "Студент";

        System.out.println("Enter your FIO:");
        String userFIO = new Scanner(System.in).nextLine();

         maxLen = Math.max(Math.max(course.length(),userFIO.length()), student.length()) ; // returns max length

        printFirstLastLine(maxLen);
        printStr(course);
        printStr(student);
        printStr(userFIO);
        printFirstLastLine(maxLen);
    }

    public static void printFirstLastLine(int count) {
        for (int i=0; i<= count+ EXTRA_SYMBOLS*2-1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStr(String str1) {
        System.out.print("* ");
        for (int i=0;i<=((maxLen - str1.length())/2) -1; i++ ){
            System.out.print(' ');
        }
        System.out.print(str1);

        for (int i=0;i<=Math.round((maxLen - str1.length())/2.0) -1; i++ ){
             System.out.print(' ');
        }

        System.out.print(" *");
        System.out.println();
    }
}
