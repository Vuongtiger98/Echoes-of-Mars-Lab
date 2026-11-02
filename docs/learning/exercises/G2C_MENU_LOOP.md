# G2-C | Menu loop và input recovery

## Trạng thái

`READY_FOR_THEORY_PREREQUISITES`. TODO comments đã có trong `EchoesOfMarsApplication.java`; chưa giao implementation cho tới khi người học prediction và hiểu vòng đời Scanner.

## Bài toán

Giữ menu Mars hiện tại và cho phép người dùng chọn nhiều lần. Input số hợp lệ đi qua G2-B switch. Input không phải số hoặc số ngoài menu phải báo lỗi và quay lại menu. Chọn Exit kết thúc vòng lặp rồi đóng Scanner đúng một lần.

## Mục tiêu học

- `boolean` làm cờ tiếp tục/dừng.
- `while` kiểm tra điều kiện trước mỗi lượt.
- `continue` chuyển sang lượt loop tiếp theo; `break` thoát loop gần nhất.
- `try-with-resources` bao trọn phiên console, không nằm bên trong mỗi lượt.
- Một `Scanner` đọc `System.in` được tái sử dụng qua mọi lượt.
- `NumberFormatException` được xử lý để chương trình tiếp tục nhận input.

## Prerequisites cần học trước

1. Trạng thái boolean và biểu thức điều kiện.
2. Thứ tự chạy: kiểm tra điều kiện → thân loop → quay lại kiểm tra.
3. Điều kiện dừng; nhận diện vòng lặp vô hạn.
4. `continue` so với `break` và thay đổi cờ `running`.
5. Vòng đời resource: không đóng Scanner/System.in sau từng lượt.
6. Scope của biến: `scanner`, `running` và `choice` cần được khai báo ở block phù hợp.

## Prediction trước khi code

1. Nếu `running` luôn là `true` và không có nhánh nào đặt thành `false`, chương trình dừng khi nào?
2. Vì sao không đặt `new Scanner(System.in)` bên trong mỗi lần lặp?
3. Sau `continue`, chương trình chạy câu lệnh nào tiếp theo?
4. Input `hello` ném `NumberFormatException`; sau khi catch, làm sao chương trình quay lại menu?
5. Chọn `2` cần thay đổi điều gì để loop kết thúc?

## Expected interaction

Menu tiếp tục hỏi cho tới khi chọn Exit.

- `hello` → in thông báo invalid rồi hiện menu lại.
- `9` → in `Unknown option: 9` rồi hiện menu lại.
- `1` → in `Mission start requested.` rồi hiện menu lại.
- `2` → in `Exit requested.` và kết thúc loop; sau đó in `Mission control closed.`

Acceptance dùng một chuỗi input nhiều dòng để xác nhận tái sử dụng input và dừng sau Exit.

## Constraints

1. Chỉ sửa `EchoesOfMarsApplication.java`.
2. Chỉ tạo một Scanner cho toàn bộ phiên console.
3. G2-A và G2-B output phải tiếp tục đúng.
4. Loop phải có đường thoát rõ ràng khi chọn Exit.
5. Input invalid không làm ứng dụng crash hoặc đóng Scanner giữa phiên.
6. Không dùng `System.exit`, không mở Scanner mới trong loop.
7. Người học phải tự hoàn thành TODO scaffold; Codex chỉ tăng hint theo yêu cầu.

## Hint ladder

- Hint 1: Đặt resource và cờ loop ở scope bao ngoài; đọc từng lựa chọn bên trong loop.
- Hint 2: Mỗi lượt: in menu → đọc dòng → parse/switch; nhánh exit đổi cờ để điều kiện loop thành false.
- Hint 3: TODO comments trong source có mẫu syntax. Chuyển từng TODO thành code, không paste toàn bộ mà chưa trace scope/flow.

## Acceptance gate

- JDK 21 compile với `--release 21`.
- G2-A/B choices `1`, `2`, `9`, `hello` xử lý đúng từng lượt.
- Multi-line session: `hello`, `9`, `1`, `2`; mỗi lựa chọn cho đúng phản hồi, menu lặp trước Exit và app kết thúc sau Exit.
- Không có `NoSuchElementException` hoặc infinite loop.
- `git diff --check` pass.
