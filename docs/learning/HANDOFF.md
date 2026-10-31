# HANDOFF | Snapshot mới nhất cho cả ChatGPT và Codex

- **Updated at:** 2026-11-01 (Asia/Saigon)
- **Challenge day:** Day 0 / 7 — audit/setup; thời điểm bắt đầu Day 1 chưa được xác nhận
- **Canonical folder:** `D:\Documents\Echoes of Mars Lab`
- **Repository / branch / checkpoint:** Git repository / `main` / `b83e262` (`chore: initialize echoes of mars learning lab`)
- **Java / build tool:** JDK/Javac 25.0.3; Maven/Gradle chưa cài
- **Build status / tests:** G1 starter compile exit 0, run exit 0, output 0 dòng; acceptance chưa đạt
- **Current architecture:** Greenfield starter kit; architecture evolution proposed in `ROADMAP.md`
- **Current user-selected objective:** Dựng lại Echoes of Mars Learning Lab từ đầu, giữ coverage 14 IBM courses + 386 questions
- **Feature slice in progress:** G1 entry point `IN_PROGRESS`; learner TODO chưa hoàn thành
- **Knowledge topics / IBM mapping:** Chưa assessed
- **Question UIDs used:** `java-055` mapped, unreviewed; chưa dùng answer_raw

## Đã làm trong phiên

- Đọc toàn bộ `AGENTS.md`, `README_INSTALL.md` và `docs/learning/`.
- Xác nhận folder này là starter kit, không phải repository/source cũ.
- Audit Java/build/Git/source/test bằng lệnh thật.
- Parse private question bank: 386/386 UID duy nhất; Java 121, Backend 104, Database 161; 21 needs_review, 365 unreviewed.
- Ghi baseline và kiến trúc greenfield proposal; không sửa/tạo Java source.
- Tạo root `.gitignore`/`.gitattributes`/`README.md`, xác minh private data bị ignore và commit checkpoint `b83e262`.
- Tạo G1 starter ở `src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java`; compile/run thành công nhưng chưa có output.

## Người học đã chứng minh điều gì?

- **Theory:** Chưa có câu trả lời kiểm tra; giữ L0.
- **Coding:** Chưa có code do người học viết trong canonical project; giữ L0.
- **Project decision:** Người học xác nhận canonical folder và greenfield rebuild. Đây không phải evidence Java mastery.

## Vấn đề mở / quyết định cần duyệt

1. Java target `21` LTS và package `com.echoesofmars.lab` đã được chấp thuận.
2. G1 đang chờ người học viết câu lệnh output trong `main`; chưa được đánh dấu hoàn thành.
3. Maven chỉ được đề xuất sau raw `javac` smoke slice đầu tiên.
4. Corpus có 0 verified answer; câu dùng để dạy phải fact-check trước.
5. Chưa cấu hình Git remote.

## Hành động tiếp theo

- **ChatGPT:** Có thể kiểm tra lý thuyết CORE-01 (JDK/JVM/javac/classpath/main) và xuất `TEACHER_FEEDBACK`; chưa được coi là đã đồng bộ repo.
- **Codex:** Giao G1 theo lesson protocol; compile bằng `javac --release 21`, chưa thêm Spring/Maven/database.
- **Người học:** Dự đoán output và tự viết/chỉnh entry point G1 trước khi nhận review.

## Tệp cần gửi cho ChatGPT

- `docs/learning/HANDOFF.md`
- Khi cần bối cảnh chi tiết: `BASELINE_AUDIT.md`, `ROADMAP.md`
