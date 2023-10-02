import java.io.*;

public class File {
    public void createNewFile(User user) {

        try (FileWriter fw = new FileWriter(user.getLastName() + ".txt", true)) {
            String toWrite = user.toFile() + "\n";
            fw.write(toWrite);
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
