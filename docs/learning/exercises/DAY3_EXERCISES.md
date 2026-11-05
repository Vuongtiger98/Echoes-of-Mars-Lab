# DAY 3 | Test domain, simulation và persistence nhỏ

## Office Study Mode

### Học theo phiên ngắn

1. **Java Core `081–121`:** exceptions, collections nâng cao, generics, lambda/streams, JVM và concurrency ở đúng độ sâu phù hợp.
2. **IBM 4 và 10:** đọc/ghi file, resource lifecycle, automated testing, test doubles và TDD.
3. **Backend `001–015`:** HTTP/API fundamentals theo mapping thật của question bank; fact-check UID trước khi chấm.
4. **Determinism:** cùng input/clock/random seed phải tạo kết quả có thể dự đoán; phân biệt domain rule với thời gian/I/O.

### Recall prompts

- Vì sao test không nên phụ thuộc thời gian hệ thống thật?
- State transition nào xảy ra khi một sol được advance?
- Unit test và integration test khác nhau ở ranh giới nào?
- Khi nào `try-with-resources` bảo vệ file handle?
- Random seed giúp test reproducible ra sao?

## Home Coding Mode TODOs

### Ưu tiên 1 — hoàn tất G5 resource/crew

- [ ] Chọn một hành động nhỏ có kết quả quan sát được, ví dụ tiêu thụ một đơn vị resource hoặc thêm crew member.
- [ ] Ghi invariant và boundary cases trước khi sửa implementation.
- [ ] Viết/hoàn thiện automated tests cho success, boundary và invalid operation.
- [ ] Giữ domain không phụ thuộc console, Spring hoặc database.

### Ưu tiên 2 — G6 simulation deterministic

- [ ] Định nghĩa `advanceSol` behavior trước khi code.
- [ ] Truyền clock hoặc giá trị thời gian vào thay vì gọi system clock bên trong domain rule.
- [ ] Nếu có event ngẫu nhiên, cho phép seed/source điều khiển được.
- [ ] Test state trước/sau một sol và ít nhất một boundary (resource cạn hoặc crew state change).

### Ưu tiên 3 — G7 file persistence nhỏ

- [ ] Chọn một format dễ đọc và ghi rõ schema; không deserialize Java object tùy cách mặc định.
- [ ] Lưu snapshot rồi đọc lại; so sánh mission/resource/crew state.
- [ ] Bảo vệ file hiện có: lỗi ghi không được âm thầm thay bằng dữ liệu rỗng.
- [ ] Test round-trip và input/file hỏng; ghi rõ lỗi được báo thế nào.

**Gate:** Automated tests pass; simulation repeatable; save/load round-trip khớp. Các phần chưa tới giữ nguyên trong backlog.

## Điểm dừng

Mỗi TODO có thể là một buổi rảnh riêng. Không cần hoàn tất simulation hoặc persistence trong cùng một tối để được tính là tiến bộ; chỉ trạng thái có test mới được gọi technical complete.
