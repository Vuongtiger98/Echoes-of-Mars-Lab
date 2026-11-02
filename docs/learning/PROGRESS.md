# PROGRESS | Nhật ký thành thạo có bằng chứng

**Trạng thái:** Day 1 / 7 bắt đầu ngày 2026-11-03 theo xác nhận của người học. G0/G1, G2-A và G2-B hoàn thành kỹ thuật. G2-B source checkpoint `850f5d3`; bốn acceptance input đạt.

**Evidence boundary:** Việc người dùng chọn kiến trúc greenfield chứng minh quyết định dự án, không chứng minh mastery Java. Không nâng theory/coding level trong phiên audit.

## Ba trục theo dõi độc lập

- **Theory coverage:** Prerequisite G2-A về object/reference, String, Scanner/input, exception, try-with-resources và import đã được học/kiểm tra. Coverage không tự nâng level ngoài mức Teacher Feedback chỉ rõ.
- **Theory level:** chỉ cập nhật từ `TEACHER_FEEDBACK` có câu trả lời thật và checkpoint rõ ràng.
- **Coding level:** chỉ cập nhật từ phần người học tự viết/debug và lệnh kiểm chứng thực sự chạy trong Home Coding Mode.

### Hàng đợi gần nhất

- **Office Study Mode:** G2-A preparation đã hoàn tất; tiếp tục củng cố FQCN/classpath, reference khác object, `close()` khác gán `null`, mutability khác scope/lifecycle, `import` không tải library và nối String khác cộng số.
- **Home Coding Mode:** G2-A đã hoàn thành với Hint 3/AI-authored scaffold; learner-authored implementation và lần sửa lỗi nối `choice` được kiểm chứng tại `8285d47`.
- **Tiếp theo:** Office Study Mode Day 1 củng cố loop, điều kiện dừng, retry/input validation và tái sử dụng một Scanner; sau prerequisite mới bắt đầu G2-C coding.

| Concept ID | Concept | IBM | Theory (L0–L4) | Coding (L0–L4) | Bằng chứng cá nhân | Bằng chứng code/test | Lần cập nhật |
|---|---|---|---|---|---|---|---|
| CORE-01 | javac, JVM, classpath, main, import | 2 | L1 | L1 | Dự đoán đúng class thiếu package sẽ không chạy; còn nhầm FQCN với file path. Nhận biết tác dụng cơ bản của `import`, cần củng cố rằng import không tải library và có thể dùng FQCN | Người học tự thêm/cleanup `println`; commit `6eabcc2`; compile/run/diff check pass | 2026-11-02 |
| CORE-02 | Biến, primitive/reference, String | 2 | L2 | L1 | Dự đoán đúng reference được gán lại tới object khác; phân biệt String/StringBuilder sau sửa sai; hiểu `parseInt()` trả `int` và không đổi String gốc | Tự khai báo `String choice`, đọc và nối với literal sau targeted helper; G2-A exact-output pass tại `8285d47` | 2026-11-02 |
| CORE-03A | Console input với Scanner | 2 | L0 | L1 | Scanner/input đã được tiếp cận; Teacher Feedback chưa đề xuất theory level riêng | Tự tạo Scanner từ scaffold, đọc `nextLine()` và dùng input; input `2`/`hello` pass tại `8285d47` | 2026-11-02 |
| CORE-03B | if, switch, for, while | 2 | L0 | L1 | Chưa có theory assessment mới | Tự viết parse + switch/default + catch từ scaffold; input 1/2/9/hello pass tại `850f5d3` | 2026-11-02 |
| OOP-01 | Class, object, constructor, this | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| OOP-02 | Encapsulation, interfaces, polymorphism | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| COLL-01 | Generic, List, ArrayList | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| COLL-02 | Map, HashMap, enum | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| JAVA-04A | Exception, try/catch, try-with-resources | 2–4 | L2 | L1 | Dự đoán đúng luồng `try/catch`, exception trong try-with-resources và resource đóng trước `catch`; phân biệt `close()` với gán reference thành `null` | Dùng try-with-resources từ Hint 3 scaffold; compile/run pass tại `8285d47`; chưa tự xử lý exception | 2026-11-02 |
| JAVA-04B | Validation, file I/O | 2–4 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| JAVA-05 | Lambda, Streams, threading, JVM | 3/10+ | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| ARCH-01 | State, service, composition, testability | 1/10 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| GIT-01 | Git, branch, commit, PR | 6 | L0 | L0 | Chưa có câu trả lời/thao tác cá nhân | Codex tạo branch `main`, ignore gate và commit `b83e262`; không phải learner evidence | 2026-11-01 |
| WEB-01 | HTML/CSS/JS browser basics | 5 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| SPR-01 | Spring DI, REST, validation, security | 7 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| DB-01 | SQL, JDBC, relational design, ORM, transactions | 8 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| CLOUD-01 | Docker, cloud native, microservices, CI/CD | 9 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| TEST-01 | JUnit, Mockito, TDD, patterns | 10 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| CAP-01 | Capstone integration & architecture | 11 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| AI-01 | AI-assisted engineering & ethics | 12 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| AI-02 | AI in Java/Spring | 13 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| JOB-01 | Interview, technical communication | 14 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |

## Quy tắc cập nhật

- Chỉ nâng `theory_level` từ câu trả lời của người học, không từ văn bản AI cung cấp.
- Chỉ nâng `coding_level` từ code/bài tập người học thực sự làm; nếu Codex viết hộ, ghi "AI assisted" và giữ mức đúng bằng chứng.
- Điền file, method, commit, lệnh kiểm thử, ngày. Nếu không biết mức, giữ L0.
- Không xóa chủ đề chỉ vì không hoàn tất trong thử thách 7 ngày; bổ sung row khi học phần cần chia nhỏ.
- Có thể đánh dấu `blocked` ở `HANDOFF.md`, nhưng không thay mức L0–L4 bằng cảm giác "thành thạo".
