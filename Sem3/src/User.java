import java.util.Scanner;

public class User {
    private String lastName;
    private String name;
    private String patronymic;
    private String birth;
    private long phone;
    private char gender;

    public User() throws Exception {
        String[] data = getUserData().split(" ");
        sortArray(data);

    }

    public String getUserData() throws Exception {
        String userData;
        int amountOfData = 6;

        System.out.println("\u001B[32mВведите данные через пробел: \u001B[0m");
        System.out.println("\u001B[33mФорматы данных:\r\n\u001B[0m" +
                "фамилия, имя, отчество - строки\r\n" +
                "датарождения - строка формата dd.mm.yyyy\r\n" +
                "номертелефона - целое беззнаковое число без форматирования\r\n" +
                "пол - символ латиницей f или m.\n");

        try (Scanner scanner = new Scanner(System.in)) {
            userData = scanner.nextLine();

            if (userData.isEmpty()) {
                throw new IllegalArgumentException("Вы ввели пустую строку");
            }
            if (userData.split(" ").length > amountOfData) {
                throw new IllegalArgumentException("Вы ввели больше данных, чем требуется");
            }
            if (userData.split(" ").length < amountOfData) {
                throw new IllegalArgumentException("Вы ввели меньше данных, чем требуется");
            }
        }

        return userData;
    }

    private void sortArray(String[] data) throws Exception {

        for (int i = 0; i < data.length; i++) {
            // проверка на дату роджения
            if (data[i].contains(".")) {
                String[] birth = data[i].split("\\.");
                if (Integer.parseInt(birth[0]) < 1 || Integer.parseInt(birth[0]) > 31) {
                    throw new RuntimeException("Вы ввели некорректную дату рождения (день)");
                }
                if (Integer.parseInt(birth[1]) < 1 || Integer.parseInt(birth[1]) > 12) {
                    throw new RuntimeException("Вы ввели некорректную дату рождения (месяц)");
                }
                if (Integer.parseInt(birth[2]) < 1900 || Integer.parseInt(birth[2]) > 2023) {
                    throw new RuntimeException("Вы ввели некорректную дату рождения (год)");
                }
                this.birth = data[i];
            }
            // проверка на пол
            if (data[i].length() == 1) {
                if (!data[i].matches("[mMfF]")) {
                    throw new Exception("Неверно указан пол");
                }
                this.gender = data[i].charAt(0);
            }
            // проверка на номер телефона
            if (data[i].matches("\\d+")) {
                this.phone = Long.parseLong(data[i]);
            }
            // проверка на ФИО
            if (this.lastName == null && data[i].length() > 1 && data[i].matches("[a-zA-Zа-яА-Я]+")) {

                this.lastName = data[i];
                this.name = data[i + 1];
                this.patronymic = data[i + 2];

            }

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ФИО: " + lastName + " " + name + " " + patronymic + "\n");
        sb.append("Дата рождения: " + birth + "\n");
        sb.append("Номер телефона: " + phone + "\n");
        sb.append("Пол: " + gender + "\n");
        return sb.toString();
    }

}

