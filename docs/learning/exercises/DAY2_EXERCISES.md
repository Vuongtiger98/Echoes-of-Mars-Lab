# DAY 2 | Domain, build tool và resource slice

## Office Study Mode

### Học theo phiên ngắn

1. **Class/object/constructor:** class là khuôn mô tả; object là instance được tạo; constructor thiết lập trạng thái ban đầu; `this` chỉ object hiện tại.
2. **Encapsulation/invariant:** field nên được bảo vệ; method duy trì luật của domain. Phân biệt dữ liệu hợp lệ với dữ liệu chỉ vừa kiểu Java.
3. **Enum/composition/collections:** dùng enum cho tập trạng thái hữu hạn; composition mô tả mission chứa resource/crew; `List` giữ nhiều thành viên có thứ tự.
4. **JUnit/TDD preview:** test mô tả hành vi kỳ vọng; assertion so actual với expected. Maven quản lý build/dependency/test lifecycle, không thay thế hiểu biết về `javac`.

### Recall prompts

- Object khác class thế nào?
- Vì sao constructor nên chặn mission name rỗng?
- Nếu mọi field đều public thì invariant có thể bị phá ra sao?
- Khi nào chọn `List` thay vì `Map`?
- Unit test cần kiểm tra behavior nào của Mission?

### Question bank

Day target là Java Core `041–080`. UID có thể map theo concept, ví dụ constructor/OOP/interface/collections từ corpus đã kiểm tra; mọi UID vẫn cần fact-check trước khi dùng lời giải. Không dùng dải UID làm bằng chứng mastery.

## Home Coding Mode TODOs

### Ưu tiên 1 — G3 Mission domain

- [ ] Tạo class `Mission` trong package domain phù hợp khi exercise được mở.
- [ ] Chọn một thuộc tính định danh và tên mission; nêu rõ vì sao chọn các field đó.
- [ ] Tạo constructor; từ chối name `null`, rỗng hoặc chỉ có khoảng trắng.
- [ ] Thêm một trạng thái tối thiểu bằng enum hoặc lựa chọn được giải thích.
- [ ] Không thêm Scanner, println, Spring annotation hoặc JPA vào domain.
- [ ] Prediction: input hợp lệ/tên rỗng sẽ tạo trạng thái gì hoặc thất bại thế nào?

**Gate G3:** `javac --release 21` compile; một demo nhỏ chứng minh mission hợp lệ được tạo và invalid input bị chặn đúng như hợp đồng. Test framework chưa bắt buộc trong G3.

### Ưu tiên 2 — G4 Maven + JUnit

- [ ] Kiểm tra Maven thực tế bằng `mvn -version`; nếu chưa có, ghi `NOT_AVAILABLE` và dừng ở tài liệu cài đặt, không tự tải công cụ.
- [ ] Sau khi build tool sẵn sàng, tạo `pom.xml` theo đúng cấu trúc `src/main/java` và `src/test/java`.
- [ ] Viết test cho invariant Mission trước khi tăng domain scope.
- [ ] Chạy `mvn test` và ghi exit/result thật.
- [ ] So sánh raw `javac` với Maven: source root, classpath/dependency và output folder.

**Gate G4:** Build/test tái lập được và test bắt được ít nhất một invalid case. Chỉ triển khai sau khi người học duyệt setup Maven cụ thể.

### Ưu tiên 3 — bắt đầu G5 nếu còn thời gian

- [ ] Viết một resource type hoặc crew member nhỏ bằng composition.
- [ ] Định nghĩa một invariant cụ thể trước khi thêm nhiều field.
- [ ] Không bắt đầu simulation/persistence khi rule resource chưa có regression test.

## Điểm dừng

Nếu chỉ có 15 phút, hoàn thành một recall prompt hoặc đọc G3 acceptance. Không tạo class rỗng để giả lập phần chưa học.
