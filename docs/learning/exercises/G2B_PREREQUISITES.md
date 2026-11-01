# G2-B PREREQUISITES | Parse lựa chọn và switch

## Trạng thái

`THEORY_PREPARATION_READY`. Đây là handoff cho Office Study Mode, chưa phải bài coding đã được giao hoặc hoàn thành.

Source baseline: `8285d47 feat: complete G2-A console input`.

## Mục tiêu dự kiến của G2-B

Chuyển String người dùng nhập thành số nguyên và chọn một hành vi bằng `switch`. G2-B vẫn chỉ đọc một lần; menu loop và xử lý đầy đủ input không phải số thuộc G2-C.

## Kiến thức cần học trước

1. `String` và primitive `int` là hai kiểu khác nhau.
2. `Integer.parseInt(String)` trả về `int`; method này không thay đổi String gốc.
3. `NumberFormatException` xảy ra khi String không biểu diễn được số nguyên hợp lệ.
4. Cú pháp và luồng chạy của basic `switch`, `case` và `default`.
5. Phân biệt `default` của switch với giá trị mặc định của biến/field.
6. Nếu học cú pháp colon labels, cần hiểu `break` ngăn fall-through; nếu dùng arrow labels của Java 21, cần hiểu mỗi label chỉ chạy nhánh của nó.
7. G2-B chỉ phân nhánh; `while`/`do-while` và retry invalid input để dành cho G2-C.

## Misconceptions cần kiểm tra

- `parseInt()` trả về giá trị mới; nó không biến object String thành `int` và không sửa biến String.
- `switch` không tự chuyển String số thành `int`.
- `default` chạy khi không `case` nào khớp; nó không phải nhánh luôn luôn chạy cuối cùng.
- `break` trong colon-style switch khác với `break` dùng để thoát loop.
- String concatenation với `+` phụ thuộc kiểu toán hạng; phép cộng hai `int` vẫn là cộng số.

## Prediction/recall cho ChatGPT

1. Sau `String choice = "2"; int option = Integer.parseInt(choice);`, kiểu và giá trị của hai biến là gì?
2. Điều gì xảy ra nếu truyền `"hello"` vào `Integer.parseInt()`?
3. Khi không case nào khớp, phần nào của switch chạy?
4. Vì sao colon-style switch thường cần `break`?
5. Với `"Option: " + 1 + 2` và `1 + 2 + " is the option"`, kết quả khác nhau thế nào và vì sao?

## Question-bank mapping

- `java-097`: checked/unchecked exception — `unreviewed`; fact-check trước khi dùng để chấm.
- `java-065`: Java 21 pattern matching for switch — `unreviewed`; đây là extension nâng cao, không thay thế việc dạy basic switch trước.
- Chưa xác định UID riêng cho basic switch; không tự tạo UID giả.

## Ranh giới coding

- Chưa cung cấp implementation hoặc snippet hoàn chỉnh.
- Codex chỉ giao G2-B sau khi nhận Teacher Feedback hoặc khi người học yêu cầu bắt đầu practice với prerequisite tối thiểu.
- G2-A phải tiếp tục pass trước và sau thay đổi G2-B.
