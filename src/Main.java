import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var ct = 0;
        float sum = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            ct++;
        }

        float average = sum / ct;

        System.out.println("Test123");

        System.out.println(average);

    }
}