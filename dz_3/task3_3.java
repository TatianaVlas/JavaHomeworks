import java.util.Scanner;
import java.util.regex.*;

public class task3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите ваше ФИО:");
        String fio = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Za-z]+(-|\\s)[A-Za-z]+\\s[A-Za-z]+(\\s[A-Za-z]+)?$");


        System.out.println("Введите номер мобильного телефонна:");
        String mobile = scanner.nextLine();
        Pattern pattern2 = Pattern.compile("^\\+380\\d{2}\\d{7}$");

        System.out.println("Введите ваш e-mail:");
        String mail = scanner.nextLine();
        Pattern pattern3 = Pattern.compile("^[a-z]+[\\w|\\.]*@{1}[a-z]+(\\.){1}[a-z]+$", Pattern.CASE_INSENSITIVE);

        if (pattern.matcher(fio).matches() !=true) {
            System.out.println("Проверьте правильность ФИО.");
        }
        else if (pattern2.matcher(mobile).matches()!=true) {
            System.out.println("Проверьте правильность мобильного телефона.");
        }
        else if (pattern3.matcher(mail).matches()!=true) {
            System.out.println("Проверьте правильность e-mail.");
        }
        else {
            System.out.println("Введенные данные успешно проверены. Ошибок нет.");
        }
    }
}
