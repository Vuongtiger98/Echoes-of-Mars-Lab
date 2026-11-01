# G2-B | Parse lựa chọn và switch một lần

## Trạng thái

`ASSIGNED_WITH_HINT_3`. Source mới chỉ có AI-authored helper comments; chưa có learner implementation.

Baseline: `8285d47 feat: complete G2-A console input`.

## Bài toán

Sau khi G2-A đọc và in lại lựa chọn, chuyển String thành `int`, rồi dùng arrow-style `switch` để xử lý option `1`, `2` hoặc một số khác. Nếu input không thể parse thành số, bắt `NumberFormatException`, in thông báo một lần rồi kết thúc.

G2-B chưa lặp menu và chưa retry. Những hành vi đó thuộc G2-C.

## Expected behavior bổ sung

Giữ nguyên toàn bộ output G2-A. Sau dòng `You selected: ...`, in thêm đúng một dòng:

| Input | Dòng bổ sung cuối cùng |
|---|---|
| `1` | `Mission start requested.` |
| `2` | `Exit requested.` |
| `9` | `Unknown option: 9` |
| `hello` | `Invalid option: hello` |

## Constraints

1. Chỉ sửa `EchoesOfMarsApplication.java`; không tạo class mới.
2. Giữ một `Scanner` và một lần gọi `nextLine()`.
3. Giữ dòng xác nhận `You selected: ` của G2-A.
4. Dùng `Integer.parseInt(choice)` và lưu kết quả vào local variable kiểu `int`.
5. Dùng arrow-style `switch` với `case 1`, `case 2` và `default`.
6. Bắt riêng `NumberFormatException`; không dùng `catch (Exception ...)`.
7. Không dùng `if`, loop, method mới hoặc hard-code input.
8. Không sửa source để chỉ làm một test case pass.

## Prediction trước khi chạy

1. Input `9` đi vào `default` hay `catch`? Vì sao?
2. Input `hello` đi vào `default` hay `catch`? Vì sao?
3. Sau khi parse thành công, biến `choice` có đổi kiểu hoặc đổi giá trị không?
4. Vì sao arrow-style case không cần `break`?

## Hint ladder

- **Hint 1:** Parse nằm trong `try`; `switch` chỉ chạy nếu parse thành công.
- **Hint 2:** Pseudocode và prerequisite nằm trong `G2B_PREREQUISITES.md`.
- **Hint 3:** Đã dùng theo yêu cầu. Source chứa syntax scaffold và String literal copy-ready; comment không chạy và không được tính là learner-authored implementation.

## Acceptance gate sau learner attempt

- JDK 21 compile với `--release 21`.
- Chạy bốn input: `1`, `2`, `9`, `hello`.
- So khớp exact output cho cả bốn case.
- `git diff --check` pass.
- Ghi rõ learner-authored code, AI scaffold và lỗi đã tự sửa.
