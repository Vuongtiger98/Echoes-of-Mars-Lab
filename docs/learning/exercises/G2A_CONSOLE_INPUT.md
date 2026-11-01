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

## Trạng thái và prerequisite

- Trạng thái: `TECHNICALLY_COMPLETE` tại source checkpoint `8285d47`. Hint 3 được dùng ngày 2026-11-02 theo yêu cầu của người học dưới dạng helper comments và copy-ready String literals; scaffold không được tính là learner-authored code.
- Có thể bắt đầu G2-A trước khi hoàn thành toàn bộ theory coverage của Day 1.
- Trước khi code, cần nhận biết `import`, object/`new`, `System.in`, local variable `String`, `nextLine()` và try-with-resources. Không yêu cầu đã đạt Theory L2 cho tất cả mục này.

### Vòng đời của standard input

`Scanner` trong bài này bọc `System.in`. Khi gọi `Scanner.close()`, scanner cũng đóng `System.in`; chương trình không thể tiếp tục tạo scanner mới để đọc lại standard input một cách an toàn.

G2-A chỉ đọc một lần và kết thúc `main`, nên scanner được đóng khi rời try-with-resources ở cuối phiên đọc. Khi chuyển sang menu nhiều lượt ở G2-B/G2-C, chương trình phải tái sử dụng một scanner cho toàn bộ phiên console, không đóng rồi mở lại scanner sau mỗi lựa chọn.

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
3. Khi rời try-with-resources, việc đóng `Scanner` ảnh hưởng thế nào tới `System.in`?

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

Đã được người học chủ động yêu cầu ngày 2026-11-02 để giảm thời gian gõ cú pháp. Codex thêm khung try-with-resources, giải thích syntax và các String literal vào comment trong source; chưa thêm implementation chạy thật của G2-A.

## Lệnh kiểm chứng sau khi viết

```powershell
javac --release 21 -encoding UTF-8 -d out src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java
'2' | java -cp out com.echoesofmars.lab.EchoesOfMarsApplication
```

Codex sẽ chạy thêm case `hello`, exact-output check và `git diff --check` khi review.

## Completion evidence — 2026-11-02

- Người học tự chuyển scaffold thành menu chạy thật, tạo `Scanner`, đọc local variable `choice` và in kết quả.
- Lần review đầu compile thành công nhưng cả hai case thiếu giá trị input ở dòng cuối vì chưa nối `choice`.
- Codex thay helper dài bằng comment mục tiêu; người học tự sửa thành biểu thức nối String với `choice`.
- JDK 21 compile exit `0`; input `2` run exit `0`, exact output `true`; input `hello` run exit `0`, exact output `true`; `git diff --check` pass.
- Source checkpoint: `8285d47 feat: complete G2-A console input`.
- Technical completion không tự chứng minh người học có thể viết lại toàn bộ bài không dùng scaffold.
