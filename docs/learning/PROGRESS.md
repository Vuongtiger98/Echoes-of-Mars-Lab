# PROGRESS | Nhật ký thành thạo có bằng chứng

**Trạng thái:** G0/G1 hoàn thành kỹ thuật. `TEACHER_FEEDBACK` CORE-01 ngày 2026-11-01 đã đồng bộ: theory L1, coding L1. Roadmap hybrid 7 ngày được duyệt ngày 2026-11-02. G2-A đang `ASSIGNED`; chưa có learner attempt. Challenge vẫn là Day 0 cho tới khi người học xác nhận Day 1.

**Evidence boundary:** Việc người dùng chọn kiến trúc greenfield chứng minh quyết định dự án, không chứng minh mastery Java. Không nâng theory/coding level trong phiên audit.

## Ba trục theo dõi độc lập

- **Theory coverage:** CORE-01 đã được học/kiểm tra một phần; prerequisite G2-A đã được xếp hàng cho Office Study Mode. Coverage không tự nâng level.
- **Theory level:** chỉ cập nhật từ `TEACHER_FEEDBACK` có câu trả lời thật và checkpoint rõ ràng.
- **Coding level:** chỉ cập nhật từ phần người học tự viết/debug và lệnh kiểm chứng thực sự chạy trong Home Coding Mode.

### Hàng đợi gần nhất

- **Office Study Mode:** củng cố FQCN/classpath; học `import`, `new`, constructor/object, `Scanner`, `System.in`, `String`, `nextLine()` và vòng đời standard input.
- **Home Coding Mode:** hoàn thành G2-A theo `exercises/G2A_CONSOLE_INPUT.md`; Hint 3 chưa dùng.
- **Sau G2-A:** Codex cung cấp prerequisite G2-B về parse số, `switch`, `default` và invalid input cho ChatGPT xây bài tiếp theo.

| Concept ID | Concept | IBM | Theory (L0–L4) | Coding (L0–L4) | Bằng chứng cá nhân | Bằng chứng code/test | Lần cập nhật |
|---|---|---|---|---|---|---|---|
| CORE-01 | javac, JVM, classpath, main | 2 | L1 | L1 | Dự đoán đúng class thiếu package sẽ không chạy; còn nhầm FQCN với file path; Teacher Feedback 2026-11-01 | Người học tự thêm/cleanup `println`; commit `6eabcc2`; compile/run/diff check pass | 2026-11-01 |
| CORE-02 | Biến, primitive/reference, String | 2 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| CORE-03 | if, switch, for, while, input | 2 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| OOP-01 | Class, object, constructor, this | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| OOP-02 | Encapsulation, interfaces, polymorphism | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| COLL-01 | Generic, List, ArrayList | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| COLL-02 | Map, HashMap, enum | 3 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
| JAVA-04 | Exceptions, validation, file I/O | 2–4 | L0 | L0 | Chưa đánh giá | Chưa đánh giá | — |
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
