public class Ex03 {

    public void run() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Значение аргумента метода printSum равна null!"); // переименовал сообщение
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!"); 
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..."); // спустил исключение в самый низ, так как в противном случае
                                                          // остальные исключения никогда не стработают
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
