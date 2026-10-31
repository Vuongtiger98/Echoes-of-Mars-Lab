# HANDOFF | Snapshot mới nhất cho cả ChatGPT và Codex

- **Updated at:** 2026-11-01 (Asia/Saigon)
- **Challenge day:** Day 0 / 7 — audit/setup; thời điểm bắt đầu Day 1 chưa được xác nhận
- **Canonical folder:** `D:\Documents\Echoes of Mars Lab`
- **Repository / branch / source checkpoint:** Git repository / `main` / `6eabcc2` (`feat: complete G1 Java entry point`)
- **Java / build tool:** JDK/Javac 25.0.3; Maven/Gradle chưa cài
- **Build status / tests:** G1 `git diff --check`, compile, run và exact-output gate đều pass
- **Current architecture:** Greenfield starter kit; architecture evolution proposed in `ROADMAP.md`
- **Current user-selected objective:** Dựng lại Echoes of Mars Learning Lab từ đầu, giữ coverage 14 IBM courses + 386 questions
- **Feature slice in progress:** G1 technically complete; G2 chưa bắt đầu
- **Knowledge topics / IBM mapping:** CORE-01 / IBM 2 — theory L0, coding L1
- **Question UIDs used:** `java-055` mapped, unreviewed; chưa dùng answer_raw

## Đã làm trong phiên

- Đọc toàn bộ `AGENTS.md`, `README_INSTALL.md` và `docs/learning/`.
- Xác nhận folder này là starter kit, không phải repository/source cũ.
- Audit Java/build/Git/source/test bằng lệnh thật.
- Parse private question bank: 386/386 UID duy nhất; Java 121, Backend 104, Database 161; 21 needs_review, 365 unreviewed.
- Ghi baseline và kiến trúc greenfield proposal; không sửa/tạo Java source.
- Tạo root `.gitignore`/`.gitattributes`/`README.md`, xác minh private data bị ignore và commit checkpoint `b83e262`.
- Tạo G1 starter ở `src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java`; trạng thái đầu compile/run được nhưng chưa có output.
- Người học tự thêm `println`; exact output đạt; review phát hiện TODO lỗi thời và trailing whitespace.
- Người học tự cleanup; final gate pass; source commit riêng `6eabcc2`.

## Người học đã chứng minh điều gì?

- **Theory:** Chưa có câu trả lời kiểm tra; giữ L0.
- **Coding:** CORE-01 L1 — người học tự thêm một câu lệnh đúng theo hints; chưa đủ bằng chứng tự dựng entry point.
- **Project decision:** Người học xác nhận canonical folder và greenfield rebuild. Đây không phải evidence Java mastery.

## Vấn đề mở / quyết định cần duyệt

1. Java target `21` LTS và package `com.echoesofmars.lab` đã được chấp thuận.
2. G1 hoàn thành kỹ thuật; câu trả lời FQCN vẫn cần để đánh giá theory CORE-01.
3. Maven chỉ được đề xuất sau raw `javac` smoke slice đầu tiên.
4. Corpus có 0 verified answer; câu dùng để dạy phải fact-check trước.
5. Chưa cấu hình Git remote.

## Hành động tiếp theo

- **ChatGPT:** Có thể kiểm tra lý thuyết CORE-01 (JDK/JVM/javac/classpath/main) và xuất `TEACHER_FEEDBACK`; chưa được coi là đã đồng bộ repo.
- **Codex:** Preview G2 menu/input theo lesson protocol; chưa thêm Spring/Maven/database.
- **Người học:** Trả lời câu FQCN để đánh giá theory CORE-01, hoặc bắt đầu prediction/task G2.

## Tệp cần gửi cho ChatGPT

- `docs/learning/HANDOFF.md`
- Khi cần bối cảnh chi tiết: `BASELINE_AUDIT.md`, `ROADMAP.md`
