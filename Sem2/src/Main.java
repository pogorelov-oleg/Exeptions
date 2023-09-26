public class Main {
    public static void main(String[] args) throws Exception {

        // Задание 1.
        System.out.println("\nЗадание 1.\n");
        Ex01 ex01 = new Ex01();
        System.out.println("Метод getUserNumber вернул число: " + ex01.getUserNumber("Введите число типа float: "));

        // Задание 2.
        System.out.println("\nЗадание 2.\n");
        Ex02 ex02 = new Ex02();
        int[] intArray1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] intArray2 = { 0, 1, 2, 3 };
        ex02.run(intArray1);
        ex02.run(intArray2);

        // Задание 3.
        System.out.println("\nЗадание 3.\n");
        Ex03 ex03 = new Ex03();
        ex03.run();

        // Задание 4.
        System.out.println("\nЗадание 4.\n");
        Ex04 ex04 = new Ex04();
        System.out.println(
                "Метод getUserString вернул строку: \"" + ex04.getUserString("Введите данные типа String: ") + "\"");

    }

}
