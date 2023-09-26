import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

    Scanner scanner = new Scanner(System.in);

    /**
     * Метод запрашивает у пользователя число типа float
     * 
     * @param message Сообщение пользователю
     * @return Введенное пользователем число
     */
    public float getUserNumber(String message) {
        float userInput = 0;
        boolean flag = true;
        do {
            try {
                System.out.print(message);
                userInput = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("ОШИБКА! ВЫ ВВЕЛИ НЕКОРРЕКТНЫЕ ДАННЫЕ");
            }
        } while (flag);

        return userInput;
    }
    
}
