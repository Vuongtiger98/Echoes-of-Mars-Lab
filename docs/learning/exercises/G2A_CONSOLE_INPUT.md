# G2-A | Menu tĩnh và console input một lần

## Bài toán

Ứng dụng hiện chỉ in tên Learning Lab. Thêm một menu tĩnh, đọc đúng một dòng từ standard input và xác nhận nguyên văn lựa chọn. Chưa parse số, chưa dùng `switch`, chưa lặp menu.

## Concept

- `import java.util.Scanner`
- Tạo object bằng `new`
- `System.in` và `System.out`
- Local variable kiểu `String`
- `Scanner.nextLine()`
- `try-with-resources` để đóng `Scanner`
- Nối chuỗi bằng `+`

IBM mapping: Course 2. Question-bank mapping: `java-086` chỉ dùng làm recall về resource management; trạng thái `unreviewed`, không dùng `answer_raw` làm đáp án chuẩn.

## File được phép sửa

`src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java`

Không tạo class mới trong G2-A.

## Expected behavior

Với input:

```text
2
```

Standard output phải là:

```text
Echoes of Mars Learning Lab
MAIN MENU
1. Start mission
2. Exit
Choose an option:
You selected: 2
```

Với input `hello`, dòng cuối phải là `You selected: hello`. G2-A cố ý chưa từ chối input này.

## Constraints

1. Giữ nguyên package `com.echoesofmars.lab` và tên class.
2. Dùng `Scanner` để đọc từ `System.in`; không hard-code lựa chọn.
3. Lưu kết quả `nextLine()` vào một local variable kiểu `String`.
4. Quản lý `Scanner` bằng try-with-resources.
5. Không dùng `if`, `switch`, loop hoặc `Integer.parseInt` trong G2-A.
6. Không xóa output G1.

## Prediction trước khi chạy

1. Nếu nhập `hello`, local variable sẽ chứa giá trị nào?
2. Class vẫn được chạy bằng fully qualified name nào?

## Hint ladder

### Hint 1 — định hướng

`Scanner` nằm trong package `java.util`. Object này cần nhận nguồn input `System.in` khi được tạo.

### Hint 2 — pseudocode

```text
import Scanner
in title G1
mở Scanner trong try-with-resources
    in bốn dòng menu/prompt
    đọc toàn bộ một dòng vào String choice
    in "You selected: " nối với choice
tự động đóng Scanner khi rời block try
```

### Hint 3 — snippet

Chỉ yêu cầu Codex cung cấp nếu đã thử với Hint 1–2 nhưng bị chặn bởi cú pháp. Việc dùng Hint 3 phải được ghi vào evidence.

## Lệnh kiểm chứng sau khi viết

```powershell
javac --release 21 -encoding UTF-8 -d out src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java
'2' | java -cp out com.echoesofmars.lab.EchoesOfMarsApplication
```

Codex sẽ chạy thêm case `hello`, exact-output check và `git diff --check` khi review.
