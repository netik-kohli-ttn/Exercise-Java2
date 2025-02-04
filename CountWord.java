import java.io.File;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;

        try  {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String inp = scanner.next();
                if (inp.equals(word)) {
                    count++;
                }
            }
            System.out.println("The word " + word + " occurs " + count + " times in the "+fileName);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
