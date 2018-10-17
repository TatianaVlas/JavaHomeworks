import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите строку: ");
        String str1 = scanner.nextLine();

        boolean exitFlag = false;
        while(exitFlag != true) {
            System.out.println("Выберите действие согласно меню ниже:");
            System.out.println("A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ\n" +
                    "B. строка в нижнем регистре\n" +
                    "C. С Заглавной буквы (Первый Символ Каждого Слова В Строке)\n"+
                    "D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ\n" +
                    "E. Как в предложении (с заглавной буквы)\n" +
                    "F. Выход из программы");

            char choice = scanner.nextLine().charAt(0);

            switch (choice) {
                case 'A':
                case 'a':
                    System.out.println(strToUpperCase(str1));
                    break;

                case 'B': //
                case 'b': System.out.println(strToLowerCase(str1));
                    break;

                case 'C': //
                case 'c':
                    System.out.println(strFirstSymbolToUpperCase(str1));
                    break;

                case 'D': //
                case 'd':
                    System.out.println(strFirstSymbolToLowerCase(str1));
                    break;

                case 'E': //
                case 'e':
                    System.out.println(strToUpperCaseFirst(str1));
                    break;

                case 'F': //
                case 'f': exitFlag = true;
                    break;

                default:
                    System.out.println("Неправильно выбрано меню. Повторите выбор");

            }
            if (exitFlag==true)
                break;
        }
    }

       public static String strToUpperCase(String src) {
        return src.toUpperCase();
    }

    public static String strToLowerCase(String src) {
        return src.toLowerCase();
    }

    public static String strFirstSymbolToUpperCase(String src) {

        StringBuilder builder = new StringBuilder(src.toLowerCase());
        // первый символ заглавный, если это буква
        if (Character.isLetter(src.codePointAt(0))) {
            builder.setCharAt(0, Character.toUpperCase(src.charAt(0)));
        }
        //меняем буквы, перед которыми пробел, на заглавные
        for (int i = 1; i < src.length(); i++)
            if (Character.isLetter(src.charAt(i)) && Character.isSpaceChar(src.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(src.charAt(i)));

        return builder.toString();
    }

    public static String strFirstSymbolToLowerCase(String src) {

        StringBuilder builder = new StringBuilder(src.toUpperCase());
        // первый символ заглавный, если это буква
        if (Character.isLetter(src.codePointAt(0))) {
            builder.setCharAt(0, Character.toLowerCase(src.charAt(0)));
        }
        //меняем буквы, перед которыми пробел, на заглавные
        for (int i = 1; i < src.length(); i++)
            if (Character.isLetter(src.charAt(i)) && Character.isSpaceChar(src.charAt(i - 1)))
                builder.setCharAt(i, Character.toLowerCase(src.charAt(i)));

        return builder.toString();
    }

    public static String strToUpperCaseFirst(String src) {
        StringBuilder builder = new StringBuilder(src.toLowerCase());

        if (Character.isLetter(src.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(src.charAt(0)));
        return builder.toString();
    }
}
