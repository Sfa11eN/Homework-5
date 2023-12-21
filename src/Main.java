// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        System.out.println("Homework-5");
        {
            System.out.println(" Условный оператор-2 ");

            System.out.println(" Задание 1 ");

            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите приложение для Android по ссылке");
            } else {
                System.out.println("Некорректно введены данные");
            }
        }
        task1();
    }

    private static void task1() {
        System.out.println(" Задание 2 ");

        int clientOS = 1;
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченное приложение для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите  приложение для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченное приложение для Android по ссылке");

            System.out.println(" Задание 3 ");

            int year = 1991;
            if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не является високосным.");

                System.out.println(" Задание 4 ");

                int deliveryDistance = 95;
                if (deliveryDistance <= 20) {
                    System.out.println("Потребуется 1 день");
                } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    System.out.println("Потребуется 2 дня");
                }else if (deliveryDistance>60&&deliveryDistance<=100) {
                    System.out.println("Потребуется 3 дня");
                }else {
                    System.out.println("Доставки нет");
                }

            }
        }
    }
}