import java.util.Scanner;
/*
Задать целое число в виде переменной, это число – сумма денег в рублях.
Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число (количество рублей)");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.close();
//        Для проверки
//        for (int money = 0; money < 1000; money++) {
//            System.out.printf("В вашем распоряжении %d руб" + quantityMoney(money), money);
//        }
        System.out.printf("В вашем распоряжении %d руб" + quantityMoney(money), money);
    }

    static String quantityMoney(int i) {
        if (i % 10 == 0 || i % 100 == 11 || i % 100 == 12 || i % 100 == 13 || i % 100 == 14) {
            return ("лей.\n");
        } else if ((i % 10 == 2 || i % 10 == 3 || i % 10 == 4) && (i < 10 || i > 20)) {
            return ("ля.\n");
        } else if (i % 10 == 1 && i != 11) {
            return ("ль.\n");
        } else return ("лей.\n");
    }
}