# ROADMAP | Echoes of Mars từ console đến Java Backend toàn diện

**Không phải kế hoạch đã thực thi.** Codex phải audit source rồi cập nhật thứ tự và tính khả thi. Không cắt mục tiêu cuối để vừa thời hạn 7 ngày; chia thành milestones có điều kiện.

## Baseline đã audit ngày 2026-11-01

- Canonical folder là `D:\Documents\Echoes of Mars Lab`.
- Đây là greenfield starter: 0 Java source, 0 test, 0 build file, chưa có Git repository.
- JDK/Javac 25.0.3 đã cài; Maven/Gradle chưa có.
- Toàn bộ P0–P9 và 14 học phần vẫn giữ nguyên. Chưa phase nào được đánh dấu hoàn thành.

### Technical progress

- G0 environment complete: `b83e262`, documentation evidence `de8db44`.
- G1 Java entry point complete: learner-authored change `6eabcc2`; compile/run/exact-output gate passed.
- P0 có reproducible minimal application baseline về kỹ thuật. Mức hiểu cá nhân vẫn theo `PROGRESS.md`, không suy ra từ build pass.

## Kiến trúc phát triển đề xuất

Kiến trúc tiến hóa theo vertical slice, không tạo trước mọi folder. Khi các khả năng xuất hiện, code sẽ hướng tới cấu trúc sau:

```text
console adapter ─┐
REST adapter ────┼──> application use cases ──> domain model + simulation rules
web UI ──────────┘              │                         │
                                └── repository ports <────┘
                                          │
                              file / JDBC / JPA adapters
```

### Ranh giới trách nhiệm mục tiêu

- **Domain:** crew, habitat resources, mission state, actions, events, time rules và invariants; không phụ thuộc console/Spring/database.
- **Application:** điều phối use case như start mission, advance sol, perform action, save/load; quản lý transaction boundary về sau.
- **Input adapters:** CLI trước, REST và browser UI sau; chuyển input thành command/use case call.
- **Output adapters:** in-memory/file trước, JDBC/JPA/PostgreSQL sau; implement repository contracts khi nhu cầu thật xuất hiện.
- **Infrastructure:** configuration, logging, security, metrics, Docker và CI/CD.
- **AI extension:** mission advisor qua một boundary riêng; domain vẫn chạy deterministic khi không có AI/network.

### Package gốc đề xuất

`com.echoesofmars.lab` với package con chỉ được thêm khi có code chạy thật. Không tạo trước class/interface rỗng để mô phỏng clean architecture.

### Build evolution đề xuất

1. G1–G3 dùng `javac --release <target>` để người học thấy compile/classpath trực tiếp và hoàn thành domain slice đầu tiên.
2. Sau checkpoint G3, G4 đưa Maven + JUnit 5 vào trước resource/crew phức tạp, simulation engine và persistence.
3. Spring Boot quản lý bằng Maven khi tới P5; database/container dependencies chỉ thêm ở phase tương ứng.

| Phase | Target capability | Ví dụ tình huống trên Sao Hỏa | Tech/IBM |
|---|---|---|---|
| P0 | Baseline reproducible | Chạy lại trạng thái console hiện có và ghi đúng input/output | IBM 1–4 |
| P1 | Clean Java domain, test seams | Tách nhập/xuất console khỏi logic tài nguyên, phi hành đoàn | IBM 2–4, 10 |
| P2 | Modular build + automated test | Maven, JUnit, dependency management và regression suite cho domain đầu tiên | IBM 6, 10 |
| P3 | Simulation engine có quy tắc | Bước thời gian, tiêu thụ/khôi phục tài nguyên, trạng thái crew, sự kiện rủi ro | IBM 3–4, 10 |
| P4 | File persistence + test | Save/load mission, bất biến nghiệp vụ, test có dữ liệu cố định | IBM 4, 8, 10 |
| P5 | Spring Boot REST | GET trạng thái habitat, POST action, validation + HTTP errors | IBM 7 |
| P6 | Relational persistence | PostgreSQL/JDBC/JPA, schema, transaction, concurrency | IBM 8 |
| P7 | Production-grade | Auth/roles, metrics, logs, idempotency, Docker, CI/CD, deployments | IBM 7, 9–11 |
| P8 | Frontend + capstone integration | Mission control dashboard, docs, demo end-to-end | IBM 5, 11 |
| P9 | AI extension + interview | Tư vấn phân bổ tài nguyên, AI service, AI risk/ethics, mock interview | IBM 12–14 |

## Phân tách kiến trúc mục tiêu (sơ đồ đề xuất)

```text
cli-adapter (console)    rest-adapter (Spring, sau này)    ui (tùy chọn)
          \                     |                     /
                application services
                       |
             domain model / rules
                       |
           repository interfaces (ports)
                       |
        in-memory / file / JDBC/JPA adapters
```

Đây là **khả năng tổ chức** không phải folder hiện có. Chỉ tách module/package khi cần, không tạo hàng loạt interface trống để giả vờ có kiến trúc lớn.

## Gợi ý nhiệm vụ sau P0, tùy source thực tế

- P1-A: Ghi smoke test của menu và vài thao tác tài nguyên; đưa input/output sang abstraction nhỏ để test.
- P1-B: Có quy tắc giới hạn tài nguyên, kiểm tra validation và trách nhiệm state ownership.
- P2-A: Thêm Maven + JUnit 5 và chuyển rule domain đầu tiên thành automated regression test.
- P3-A: Thêm `nextSol()` (ngày Sao Hỏa) khi đã test được cập nhật crew/resources; xác định cách xử lý thiếu oxy/nước.
- P3-B: Event mô phỏng và nhật ký sự kiện; yêu cầu đầu vào ổn định và random seed kiểm chứng được.
- P4-A: Save/load một snapshot JSON hoặc CSV bằng Java I/O; phải bảo đảm không làm mất file cũ.
- P5+ tiếp tục khi người học muốn tiến lên và source có kiểm thử tối thiểu.

## Greenfield sequence đề xuất (mỗi bước phải có gate)

| Step | Thay đổi nhỏ | Hành vi kiểm chứng | Cơ hội người học tự code |
|---|---|---|---|
| G0 | Root `.gitignore`, Git init, documentation checkpoint | Private bank/reference không bị stage | Giải thích ignore và kiểm tra `git status` |
| G1 | Một Java entry point có package | In tên Learning Lab và thoát, compile bằng `javac` | Tự viết/chỉnh `main` và dự đoán output |
| G2 | Menu loop + input validation | Input hợp lệ/không hợp lệ không crash | Tự triển khai một nhánh menu |
| G3 | Domain đầu tiên: mission identity/state | Rule thuần Java, chưa I/O | Tự viết constructor/validation |
| G4 | Maven + automated tests | Reproducible build, JUnit regression suite cho G3 | Viết test trước cho một rule mới |
| G5 | Resource + crew vertical slice | Một action làm state đổi có thể dự đoán và có regression test | Collections, encapsulation, test cases |
| G6 | Simulation clock/events | Advance sol deterministic; seeded event | Interface, strategy, random seam |
| G7 | File persistence | Save/load round-trip không mất dữ liệu | File I/O, exception, serialization format |
| G8 | Spring REST | CLI và REST dùng chung application/domain | Controller/DTO/validation |
| G9 | SQL/JPA/PostgreSQL | Repository adapter + transaction test | Schema/query/ORM mapping |
| G10 | Production/capstone/AI | Docker/CI/metrics/security/UI/AI demo | Debug, trade-off, interview explanation |

### Thứ tự G2 đã được duyệt

- **G2-A:** menu tĩnh, một lần đọc `String` bằng `Scanner`, xác nhận input và kết thúc.
- **G2-B:** parse lựa chọn, `switch` và `default`; chưa cần menu loop hoàn chỉnh.
- **G2-C:** vòng lặp menu, invalid input không crash, thoát an toàn và tách method.

Thứ tự đã thống nhất là G3 domain đầu tiên → G4 Maven/JUnit → G5 resource/crew → G6 simulation → G7 file persistence. Simulation phải có clock/random seam kiểm soát được. Domain tiếp tục độc lập với Spring/JPA.

G0–G10 không thay P0–P9; đây là thứ tự triển khai nhỏ hơn. Mọi chủ đề chưa tới vẫn nằm trong backlog, không bị cắt.

**Nguyên tắc tiến độ:** roadmap mở rộng không bị xóa. Công việc tiếp theo được chọn theo prerequisite và bằng chứng kỹ năng; một vertical slice phải build/run/test trước khi tiếp.

## Thử thách 7 ngày đã được duyệt (bề rộng giữ nguyên)

**Ngày bắt đầu:** Chưa xác nhận; vẫn là Day 0. Không tự đặt Day 1 dựa trên ngày calendar.

| Ngày | Office Study Mode | Home Coding Mode | Gate mục tiêu |
|---|---|---|---|
| 1 | IBM 1, 2, 6; Java `001–040`; fundamentals, FQCN/classpath, input/control flow, Git | G2-A/B/C | Menu/input chạy được; invalid input không crash ở G2-C |
| 2 | IBM 3–4; Java `041–080`; OOP, collections, exception; preview JUnit prerequisite | G3 mission domain → G4 Maven/JUnit → bắt đầu G5 resource/crew | Domain có invariant; Maven build và regression test chạy được |
| 3 | IBM 4, 10; Java `081–121`; Backend `001–015`; I/O, test, JVM/concurrency overview | Hoàn tất G5; G6 deterministic simulation; G7 file persistence nhỏ | Automated tests, save/load round trip và seeded event ổn định |
| 4 | IBM 5, 7; Backend `016–060`; HTTP/REST, Spring, HTML/JS | Spring Boot REST và dashboard tối thiểu dùng lại domain | State/action endpoint; validation/error response |
| 5 | IBM 8; Backend `061–104`; Database `001–010`; SQL/JPA | PostgreSQL, migration, JPA adapter, transaction đầu tiên | Schema tái lập; repository integration test |
| 6 | IBM 9–10; Database `011–085`; testing, security, Docker, CI | Security boundary, test suite, logs/health, Docker/CI | Build/test tự động; container start; không chứa secret |
| 7 | IBM 11–14; Database `086–161`; capstone, cloud, AI, interview | End-to-end demo, deployment attempt, AI boundary, docs/refactor | Demo tái hiện được; pass/fail/chưa làm được ghi trung thực |

Các dải UID là mục tiêu **theory coverage**, không phải mặc định đã fact-check, đã hiểu hoặc đã nhớ. Tất cả 14 học phần IBM và 386 câu vẫn trong scope. Nếu không hoàn thành trong ngày dự kiến, giữ phần còn lại trong backlog có trạng thái rõ ràng; không xoá phạm vi và không tuyên bố mastery.
