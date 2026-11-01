package com.echoesofmars.lab;

// import cho phép dùng tên ngắn Scanner thay vì phải viết java.util.Scanner.
// import chỉ giúp compiler tìm đúng tên class; nó không tải hoặc cài thư viện.
import java.util.Scanner;

/**
 * Entry point đầu tiên của Echoes of Mars Learning Lab.
 *
 * G1 đã hoàn thành hành vi in tên Learning Lab.
 * G2-A bổ sung menu và đọc một dòng từ standard input.
 */
public class EchoesOfMarsApplication {

    /**
     * JVM dùng method main làm điểm bắt đầu của ứng dụng Java này.
     *
     * @param args các argument được truyền từ command line; G1 chưa sử dụng
     */
    public static void main(String[] args) {
        System.out.println("Echoes of Mars Learning Lab");

        // Cú pháp try (resource) { ... } là try-with-resources.
        // Scanner sẽ tự được đóng khi chương trình rời khỏi block này.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("MAIN MENU");
            System.out.println("1. Start mission");
            System.out.println("2. Exit");
            System.out.println("Choose an option:");

            // nextLine() trả về String và gán reference đó cho local variable choice.
            String choice = scanner.nextLine();

            // Vì toán hạng bên trái là String, dấu + nối nội dung của String
            // với giá trị đang được reference choice trỏ tới.
            System.out.println("You selected: " + choice);
            try {
                int option = Integer.parseInt(choice);
                switch (option) {
                    case 1 -> System.out.println("Mission start requested.");
                    case 2 -> System.out.println("Exit requested.");
                    default -> System.out.println("Unknown option: " + choice);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Invalid option: " + choice);
            }
        }
    }
}
