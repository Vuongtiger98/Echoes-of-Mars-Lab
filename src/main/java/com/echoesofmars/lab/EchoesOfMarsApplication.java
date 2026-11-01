package com.echoesofmars.lab;

// import cho phép dùng tên ngắn Scanner thay vì phải viết java.util.Scanner.
// import chỉ giúp compiler tìm đúng tên class; nó không tải hoặc cài thư viện.
import java.util.Scanner;

/**
 * Entry point đầu tiên của Echoes of Mars Learning Lab.
 *
 * G1 chỉ có một hành vi cần đạt:
 * Khi chạy class này, terminal in đúng một dòng:
 * Echoes of Mars Learning Lab
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
         * G2-A HELPER — đây là scaffold để nhắc cú pháp, chưa phải implementation.
         * Những dòng nằm trong comment không được Java thực thi.
         *
         * 1. Mẫu in một dòng; thay phần ... bằng nội dung cần in:
         *
         *    System.out.println("...");
         *
         * Dấu chấm phẩy ; kết thúc một statement Java.
         * Dấu ngoặc kép "..." tạo ra một String literal.
         *
         * 2. Các String literal có thể copy vào mẫu println ở trên:
         *
         *    "MAIN MENU"
         *    "1. Start mission"
         *    "2. Exit"
         *    "Choose an option:"
         *    "You selected: "
         *
         * 3. Khung try-with-resources cho G2-A:
         *
         *    try (Scanner scanner = new Scanner(System.in)) {
         *        // In menu và prompt ở đây.
         *
         *        String choice = scanner.nextLine();
         *
         *        // In "You selected: " nối với choice ở đây.
         *    }
         *
         * Giải thích cú pháp trong khung:
         * - Scanner là kiểu của biến.
         * - scanner là tên biến reference; có thể chọn tên khác nhưng phải dùng
         *   nhất quán ở các dòng sau.
         * - new Scanner(System.in) tạo object Scanner đọc standard input.
         * - String choice khai báo local variable tên choice.
         * - nextLine() đọc một dòng và trả về String; nó không parse thành số.
         * - Khối try tự gọi scanner.close() khi rời dấu } cuối cùng.
         * - Vì scanner bọc System.in, close scanner cũng đóng System.in. G2-A chỉ
         *   đóng ở cuối lần đọc; bài menu nhiều lượt sẽ dùng lại một scanner.
         * - Dấu + nối hai String. Ví dụ cấu trúc là "prefix" + variable.
         *
         * Nhiệm vụ của bạn:
         * - Tự chuyển phần cần thiết khỏi comment thành code chạy thật.
         * - Giữ title G1 ở trên và không dùng if/switch/loop/parseInt trong G2-A.
         */
    }
}
