import java.util.Scanner;

public class HappySankranti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Did you reply with 'yes'? Type 'yes' or leave it blank:");
        String reply = scanner.nextLine().trim(); // Trim to avoid leading/trailing spaces

        if (reply.equalsIgnoreCase("yes")) {
            System.out.println("Happy Sankranti!");
        }

        scanner.close();
    }
}

