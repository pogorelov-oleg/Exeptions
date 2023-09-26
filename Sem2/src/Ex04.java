import java.util.Scanner;

public class Ex04 {

    Scanner scanner = new Scanner(System.in);

    /**
     * Метод запрашивает у пользователя данные типа String
     * 
     * @param message Сообщение пользователю
     * @return Введенные пользователем данные
     */
    public String getUserString(String message) throws Exception {
        String userInput;
        System.out.print(message);
        userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            throw new Exception("Вы ввели пустую строку");
        }

        return userInput;
    }

}
