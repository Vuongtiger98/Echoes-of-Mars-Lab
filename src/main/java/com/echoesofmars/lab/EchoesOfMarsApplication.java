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

        /*
         * DAY 1 / G2-C TODO HELPER — các dòng dưới đây chỉ là comment, không chạy.
         * Hãy dùng G2C_MENU_LOOP.md để hoàn thành từng TODO sau khi học prerequisite.
         *
         * TODO G2-C-1: Tạo một Scanner cho toàn bộ phiên console.
         * Mẫu cú pháp:
         * try (Scanner scanner = new Scanner(System.in)) {
         *     // Vòng lặp và xử lý menu nằm bên trong block này.
         * }
         * Chỉ đóng Scanner sau khi người dùng chọn thoát.
         *
         * TODO G2-C-2: Khai báo cờ điều khiển vòng lặp.
         * Mẫu cú pháp: boolean running = true;
         * boolean chỉ nhận true hoặc false.
         *
         * TODO G2-C-3: Lặp menu khi cờ còn true.
         * Mẫu cú pháp:
         * while (running) {
         *     // In menu, đọc input và xử lý đúng một lựa chọn.
         * }
         * Điều kiện phải đổi thành false ở nhánh Exit để vòng lặp dừng.
         *
         * TODO G2-C-4: Đọc một lựa chọn trong mỗi lượt bằng scanner.nextLine().
         * Không tạo Scanner mới trong vòng lặp và không gọi close() mỗi lượt:
         * close() cũng đóng System.in.
         *
         * TODO G2-C-5: Đưa parse và switch G2-B vào bên trong vòng lặp.
         * Với NumberFormatException, báo input sai rồi quay lại lượt kế tiếp.
         * Với số ngoài menu, default cũng báo và cho người dùng thử lại.
         *
         * TODO G2-C-6: Trong case Exit, gán running = false.
         * Chỉ khi thoát khỏi while, try-with-resources mới đóng Scanner.
         *
         * TODO G2-C-7: Sau khi thoát vòng lặp, có thể in lời tạm biệt.
         * Mẫu copy-ready: "Mission control closed."
         *
         * Syntax reminder: continue tự sang lượt kế tiếp; break thoát loop gần
         * nhất. Ở bài này, ưu tiên điều khiển bằng biến running để nhìn rõ điều kiện.
         */
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
