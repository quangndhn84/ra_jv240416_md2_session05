package ra.execise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT9 {
    public static void main(String[] args) {
        //quangnd@gmail.com
        String emailRegex = "[A-Za-z0-9]{3,}@[A-Za-z0-9]{2,}\\.[a-z]{2,3}";
        String passwordRegex = "[\\S]{6,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào email của bạn:");
        String email;
        do {
            email = scanner.nextLine();
            if (Pattern.matches(emailRegex, email)) {
                break;
            } else {
                System.err.println("Email không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Nhập vào password của bạn:");
        String password;
        do {
            password = scanner.nextLine();
            if (Pattern.matches(passwordRegex, password)) {
                break;
            } else {
                System.err.println("Password không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        System.out.printf("Email: %s - Password: %s\n", email, password);
    }
}
