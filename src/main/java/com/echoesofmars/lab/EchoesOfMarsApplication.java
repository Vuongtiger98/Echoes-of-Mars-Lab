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

            /*
             * G2-B HELPER — comment không được Java thực thi.
             * Hãy chuyển từng phần cần thiết thành code thật, không copy cả block
             * một lần nếu bạn chưa hiểu vị trí của dấu { }.
             *
             * 1. Parse String thành primitive int:
             *
             *    int option = Integer.parseInt(choice);
             *
             * choice vẫn là String cũ; parseInt() trả về một giá trị int mới.
             * Nếu choice không chứa số hợp lệ, parseInt() ném
             * NumberFormatException trước khi chương trình tới switch.
             *
             * 2. Khung xử lý một lần, đặt ngay sau dòng "You selected":
             *
             *    try {
             *        int option = Integer.parseInt(choice);
             *
             *        switch (option) {
             *            case 1 -> // In thông báo bắt đầu mission.
             *            case 2 -> // In thông báo thoát.
             *            default -> // In số không thuộc menu.
             *        }
             *    } catch (NumberFormatException exception) {
             *        // In String input không hợp lệ.
             *    }
             *
             * 3. Các String literal copy-ready:
             *
             *    "Mission start requested."
             *    "Exit requested."
             *    "Unknown option: "
             *    "Invalid option: "
             *
             * 4. Syntax reminders:
             * - try/catch ở đây nằm bên trong try-with-resources của Scanner.
             * - case 1 và case 2 so sánh với biến int option, không phải choice.
             * - default chạy khi option là số nhưng không phải 1 hoặc 2.
             * - catch chạy khi parseInt() không tạo được int, ví dụ "hello".
             * - Arrow label dùng -> và không cần break.
             * - Dòng sau -> phải là một statement hoàn chỉnh kết thúc bằng ;.
             * - Khi nối thông báo với dữ liệu, variable không nằm trong "...".
             */
        }
    }
}
