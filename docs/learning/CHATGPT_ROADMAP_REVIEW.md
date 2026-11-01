# CODEX_FEEDBACK | Đánh giá roadmap và đề xuất kế hoạch học 7 ngày

**Date:** 2026-11-02

**Project:** Echoes of Mars Learning Lab

**Repository:** https://github.com/Vuongtiger98/Echoes-of-Mars-Lab

**Audience:** ChatGPT — giáo viên lý thuyết

**Purpose:** Đồng bộ nội dung học lý thuyết ban ngày với bài coding buổi tối

**Review status:** ChatGPT approved on 2026-11-02. The accepted rules are integrated into `START_HERE.md`, `LESSON_PROTOCOL.md`, `ROADMAP.md`, `PROGRESS.md` and `HANDOFF.md`.

> Tài liệu này là phản hồi và đề xuất của Codex. Nó không phải bằng chứng người học đã hiểu kiến thức hoặc đã tự viết được các feature được nhắc tới.

## 1. Trạng thái dự án đã kiểm chứng

- Canonical folder: `D:\Documents\Echoes of Mars Lab`.
- Branch hiện tại: `main`.
- Source checkpoint của G1: `6eabcc2` — `feat: complete G1 Java entry point`.
- Documentation checkpoint gần nhất khi audit: `e1ffdca`.
- Local `main` và `origin/main` đã đồng bộ tại thời điểm audit.
- Source hiện tại chỉ có một entry point:
  `src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java`.
- Chức năng thực tế: in đúng một dòng `Echoes of Mars Learning Lab` rồi kết thúc.
- G1 đã compile/run và qua exact-output gate bằng lệnh thật.
- G2-A đã được giao nhưng chưa có learner attempt.
- Chưa có Maven/Gradle, automated test, domain model, simulation engine,
  persistence, Spring Boot, database hoặc deployment pipeline.
- JDK trên `PATH`: 25.0.3. JDK 21.0.1 cũng đã được kiểm tra và chạy G1
  thành công; target dự án là Java 21.

## 2. Tiến độ học hiện tại

| Concept | Theory | Coding | Bằng chứng hiện có |
|---|---:|---:|---|
| CORE-01: package, entry point, compile/run | L1 | L1 | Người học dự đoán đúng việc chạy thiếu package sẽ thất bại, nhưng còn nhầm FQCN với đường dẫn file; đã tự thêm một `println` và cleanup |
| CORE-02: console input/control flow | L0 | L0 | G2-A mới được giao, chưa có code của người học |
| CORE-03 trở đi | L0 | L0 | Chưa có bằng chứng thực hành |

Không nâng level dựa trên code do AI viết, nội dung đã đọc, hoặc build pass đơn thuần.

## 3. Đánh giá roadmap hiện tại

### Điểm phù hợp

- Kiến trúc mục tiêu tách console/REST adapter, application use case, domain và
  persistence adapter phù hợp để phát triển từ Java Core đến Spring Boot.
- Roadmap giữ đủ hướng mở rộng: console, OOP/domain, simulation, persistence,
  testing, Spring REST, PostgreSQL/JPA, security, Docker/CI/CD, frontend và AI.
- Cách triển khai theo vertical slice giúp mỗi bước tạo ra hành vi chạy được và
  tránh sinh hàng loạt class/interface rỗng.
- Domain được giữ độc lập với Spring và JPA, giúp học OOP/test đúng bản chất và
  cho phép CLI lẫn REST sử dụng lại cùng nghiệp vụ.

### Điều nên điều chỉnh khi triển khai

1. Chia G2 thành các lát nhỏ:
   - G2-A: menu tĩnh, `Scanner`, đọc một `String`, try-with-resources.
   - G2-B: parse lựa chọn, `switch`, nhánh hợp lệ.
   - G2-C: vòng lặp, input sai, thoát an toàn và tách method.
2. Đưa Maven và JUnit 5 vào sau domain slice đầu tiên, trước khi simulation engine
   và persistence tăng kích thước. Người học vẫn cần trải nghiệm `javac`, classpath
   và FQCN trước khi build tool che các chi tiết đó.
3. Mỗi phase cần ghi rõ prerequisite, learner-authored task và acceptance test.
4. Simulation engine phải có clock và random source có thể kiểm soát bằng seed
   hoặc dependency injection để test cho kết quả ổn định.
5. Không gắn annotation JPA trực tiếp vào domain ngay từ đầu. Chỉ quyết định cách
   mapping khi tới persistence slice.
6. Git không còn là chủ đề “sau này”; repository và remote đã hoạt động. Git cần
   được dùng làm checkpoint cho từng feature nhỏ.

## 4. Kiến thức cần học trước G2 và các feature kế tiếp

### Trước G2-A

ChatGPT nên dạy và kiểm tra:

- `package`, FQCN và classpath; phân biệt tên class với đường dẫn source/class.
- `import` dùng để làm gì và vì sao cần `import java.util.Scanner`.
- `class`, method `main`, local variable và kiểu `String`.
- `new Scanner(System.in)`: `new` tạo object; constructor khởi tạo object;
  `System.in` là luồng input chuẩn.
- `Scanner.nextLine()` trả về gì và vì sao lựa chọn đầu tiên vẫn đọc dưới dạng
  `String`.
- try-with-resources: tài nguyên nào được đóng, thời điểm đóng và yêu cầu
  `AutoCloseable`.
- `System.out.print` so với `System.out.println`.

Question-bank mapping để chọn câu kiểm tra, không mặc nhiên tin đáp án raw:

- `java-055`: JVM/JRE/JDK — `unreviewed`.
- `java-086`: try-with-resources — `unreviewed`.

### Trước G2-B và G2-C

- `Integer.parseInt`, primitive `int` và wrapper `Integer`.
- `NumberFormatException`; checked và unchecked exception ở mức nhập môn.
- `if/else`, `switch`, `case`, `default`, `break` hoặc arrow labels.
- `while`/`do-while`, điều kiện dừng và nguy cơ infinite loop.
- Boolean expression, so sánh `String` bằng `equals`, không dùng `==` để so nội dung.
- Validation, guard clause và tách một đoạn code thành method nhỏ.
- `return` của Java khác với thẻ Javadoc `@return`.

Question-bank mapping gợi ý:

- `java-097`: checked/unchecked exceptions — `unreviewed`.
- `java-065`: pattern matching for `switch` trong Java 21 — chỉ dùng sau khi đã
  hiểu basic `switch`; `unreviewed`.
- `java-012`: `NullPointerException` — `unreviewed`.

### Trước domain/resource/crew

- Object, constructor, field, method, `this`, access modifier.
- Encapsulation, invariant, validation và exception có thông điệp rõ ràng.
- `final`, enum, record và immutable object; hiểu trade-off thay vì dùng máy móc.
- Composition so với inheritance; interface chỉ thêm khi có nhiều implementation
  hoặc cần seam thật.
- Collections và generics: `List`/`ArrayList`, `Map`/`HashMap`, `Set`, iteration.
- `equals`/`hashCode`, đặc biệt khi object được dùng trong collection.

UID có thể chọn để fact-check rồi dạy: `java-007`, `java-015`, `java-028`,
`java-029`, `java-031`, `java-032`, `java-038`, `java-040`, `java-041`,
`java-042`, `java-046`, `java-063`, `java-071`, `java-082`, `java-100`,
`java-114`.

### Trước simulation, persistence và testing

- Deterministic function, state transition và side effect.
- Exception propagation, file I/O và resource management.
- Dependency injection ở mức Java thuần: truyền dependency qua constructor.
- Random seed, clock seam và vì sao test không nên phụ thuộc thời gian thật.
- Unit test, arrange-act-assert, boundary case và regression test.
- Lambda, stream và method reference sau khi đã thao tác collection bằng loop.
- Thread/concurrency chỉ đưa vào engine khi có use case thật; không thêm thread để
  làm ứng dụng trông “nâng cao”.

## 5. Kiến thức có thể học trước dù chưa áp dụng ngay

Các nội dung dưới đây thuộc phạm vi đầy đủ của chương trình, nhưng việc học lý
thuyết không có nghĩa project đã triển khai chúng:

- Git: commit nhỏ, branch, merge conflict, `.gitignore`, secret hygiene.
- JVM: heap/stack, garbage collection, class loading, JIT và memory leak.
- HTTP/REST: method, status code, idempotency, JSON, DTO và error response.
- Spring: IoC/DI, bean lifecycle, controller/service/repository boundaries.
- Database: SQL, join, normalization, index, ACID, transaction, isolation,
  SQL injection, optimistic locking và N+1.
- Testing: unit/integration/end-to-end, test double, test pyramid.
- Security: authentication/authorization, password hashing, session/JWT và least
  privilege.
- Deployment: environment variable, configuration, Docker image/container,
  health check, logs, metrics và CI/CD.
- Frontend basics và AI integration boundary; không để domain phụ thuộc network
  hoặc model response không ổn định.

ChatGPT có thể dạy trước để xây mental model, nhưng cần ghi trạng thái là
`introduced` hoặc `theory practice`, không ghi là `implemented` hay `mastered`.

## 6. Lộ trình coding 7 ngày tham vọng

Đây là kế hoạch bề rộng tối đa, không phải cam kết rằng mọi mục đều hoàn thành
trong bảy ngày. Toàn bộ 14 học phần IBM và 386 câu hỏi vẫn nằm trong scope.
Các dải UID dưới đây dùng để triage/coverage; câu được dùng để dạy hoặc chấm phải
được fact-check trước.

| Ngày | Lý thuyết ban ngày | Coding buổi tối | Gate kỹ thuật mục tiêu |
|---|---|---|---|
| 1 | IBM 1, 2, 6; Java `001–040`; FQCN/classpath, input, control flow, Git | G2-A/B/C: menu, input, validation, loop | Hai hoặc nhiều input case chạy đúng; invalid input không crash |
| 2 | IBM 3–4; Java `041–080`; OOP, collections, exception; preview JUnit prerequisite | Mission domain đầu tiên → Maven/JUnit → bắt đầu resource/crew | Domain có invariant; Maven build và regression test chạy được |
| 3 | IBM 4, 10; Java `081–121`; Backend `001–015`; I/O, test, JVM/concurrency overview | Hoàn tất resource/crew → deterministic simulation → file save/load nhỏ | Automated tests pass; save/load round trip; seeded event ổn định |
| 4 | IBM 5, 7; Backend `016–060`; HTTP, REST, Spring, HTML/JS | Spring Boot REST dùng lại domain/application; dashboard tối thiểu | Endpoint đọc state và thực hiện action; validation/error response |
| 5 | IBM 8; Backend `061–104`; Database `001–010`; SQL/JPA basics | PostgreSQL, migration, JPA adapter và transaction đầu tiên | Schema tái lập; repository integration test; dữ liệu sống qua restart |
| 6 | IBM 9–10; Database `011–085`; testing, security, Docker, CI | Auth boundary, test suite, logging/health, Docker và CI | Build/test tự động; container start được; không chứa secret |
| 7 | IBM 11–14; Database `086–161`; cloud-native, capstone, AI, interview | End-to-end demo, deployment attempt, AI advisor boundary, docs/refactor | Demo có hướng dẫn tái hiện; ghi rõ phần pass/fail/chưa làm |

Nếu một ngày không hoàn thành, không xóa scope còn lại và không tuyên bố mastery.
Chuyển phần chưa đạt sang backlog có bằng chứng, rồi tiếp tục ưu tiên prerequisite
cho vertical slice kế tiếp.

## 7. Bài coding người học cần tự thực hiện

Codex nên giao từng bài nhỏ và chờ learner attempt trước khi đưa lời giải đầy đủ:

1. Viết phần đọc một dòng bằng `Scanner` và in lại lựa chọn trong G2-A.
2. Tự thêm một nhánh `switch`, bao gồm `default`, rồi giải thích từng nhánh.
3. Viết vòng lặp menu và điều kiện thoát; dự đoán output trước khi chạy.
4. Viết constructor của `Mission` và validation cho mission name.
5. Viết rule bảo đảm resource không nhỏ hơn 0 và test boundary.
6. Dùng `ArrayList` để thêm/tìm crew member; sau đó giải thích vì sao chọn List.
7. Viết một mission action làm state thay đổi có thể dự đoán.
8. Viết một JUnit test trước implementation cho một rule nhỏ.
9. Debug một failing test mà Codex không chỉ sẵn dòng lỗi ngay từ đầu.
10. Viết một REST endpoint/DTO sau khi domain use case đã tồn tại.
11. Viết migration và một SQL query, rồi kiểm tra kết quả bằng dữ liệu thật.
12. Giải thích transaction boundary, Docker flow và kiến trúc end-to-end bằng
    lời của mình.

Mỗi bài cần lưu riêng:

- Phần người học tự viết.
- Hint level đã dùng.
- Build/test thực sự đã chạy.
- Lỗi người học tự sửa.
- Theory level và coding level; không gộp hai mức.

## 8. Cách đồng bộ ChatGPT/Copilot ban ngày với Codex buổi tối

### Trước buổi học ban ngày

Người học gửi cho ChatGPT/Copilot:

- Commit hiện tại và feature đang `ASSIGNED`.
- File exercise hiện tại.
- Concept level trong `PROGRESS.md`.
- UID câu hỏi liên quan và `fact_check_status`.
- Điều chưa hiểu từ code của tối hôm trước.

### Output mong đợi từ giáo viên lý thuyết

ChatGPT nên trả về một block có cấu trúc:

```text
TEACHER_FEEDBACK
Date:
Repository checkpoint reviewed:
Concepts taught:
Question UIDs fact-checked:
Learner answers/evidence:
Theory-level recommendation:
Misconceptions to reinforce:
Suggested evening coding transfer task:
```

Không chấm dựa trên việc người học chỉ đọc lại định nghĩa. Nên dùng prediction,
giải thích bằng lời riêng, trace code ngắn và câu hỏi biến thể.

### Trước buổi coding tối

Codex sẽ:

1. Đọc feedback theo thứ tự thời gian và kiểm tra checkpoint.
2. Không dùng feedback cũ để ghi đè bằng chứng mới hơn.
3. Chuyển một hoặc hai concept thành bài coding nhỏ.
4. Cho người học dự đoán và tự code trước.
5. Compile/run/test bằng lệnh thật.
6. Chỉ cập nhật theory level theo feedback có bằng chứng; coding level theo code
   người học thực sự viết/debug.

### Sau buổi coding tối

Codex ghi lại:

- Commit/source checkpoint mới.
- File/method đã thay đổi.
- Acceptance tests và kết quả thật.
- Phần learner-authored so với AI-authored.
- Lỗi và misconception cần ChatGPT kiểm tra lại ngày hôm sau.
- Feature kế tiếp và kiến thức prerequisite.

## 9. Yêu cầu dành cho ChatGPT trong phiên kế tiếp

1. Hãy review kế hoạch trên nhưng không coi nó là bằng chứng hoàn thành.
2. Trước mắt ưu tiên CORE-01 reinforcement và kiến thức cho G2-A.
3. Kiểm tra người học có phân biệt được:
   - FQCN với file path.
   - classpath với source folder.
   - `new`, constructor và object.
   - Java `return` với Javadoc `@return`.
   - try-with-resources với `try/catch`.
4. Fact-check `java-055` và `java-086` bằng nguồn chính thống trước khi dùng để
   chấm; không tin mặc định `answer_raw`.
5. Gửi lại `TEACHER_FEEDBACK` có checkpoint, evidence và đề xuất theory level.
6. Không yêu cầu Codex triển khai Spring/Database trước khi các prerequisite và
   vertical slices tương ứng có bằng chứng.

## 10. Snapshot ngắn để copy vào cuộc trò chuyện

```text
Project: Echoes of Mars Learning Lab
Repository: https://github.com/Vuongtiger98/Echoes-of-Mars-Lab
Source checkpoint: 6eabcc2
Latest audited docs checkpoint: e1ffdca
Current feature: G2-A ASSIGNED; no learner attempt yet
Current evidence: CORE-01 Theory L1 / Coding L1; CORE-02+ L0/L0
Current implementation: one packaged Java main class printing one line
Next theory: FQCN/classpath reinforcement, import, object/new/constructor,
Scanner/System.in, String local variable, try-with-resources
Mapped question UIDs: java-055 and java-086, both unreviewed
Rule: Keep all 14 IBM modules and all 386 questions in scope, while clearly
separating theory coverage from implemented/tested project progress.
```
