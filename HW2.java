import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(isPalindrom("шалаш"));
        createNewTestFile("test.txt");
    }

    private static Boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static void createNewTestFile(String fileName) {
        Path file = Path.of(fileName);
        StringBuilder buildData = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            buildData.append("TEST");
            // buildData.append("TEST\n");
        }
        String resulString = buildData.toString();

        try {
            if (Files.exists(file)) {
                Files.writeString(file, resulString);
            } else {
                Files.createFile(file);
                Files.writeString(file, resulString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
