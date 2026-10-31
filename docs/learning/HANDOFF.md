# HANDOFF | Snapshot mới nhất cho cả ChatGPT và Codex

- **Updated at:** 2026-11-01 (Asia/Saigon)
- **Challenge day:** Day 0 / 7 — audit/setup; thời điểm bắt đầu Day 1 chưa được xác nhận
- **Canonical folder:** `D:\Documents\Echoes of Mars Lab`
- **Repository / branch / commit:** Chưa `git init`; không có branch/commit
- **Java / build tool:** JDK/Javac 25.0.3; Maven/Gradle chưa cài
- **Build status / tests:** NOT_AVAILABLE — 0 Java source, 0 test, 0 build file
- **Current architecture:** Greenfield starter kit; architecture evolution proposed in `ROADMAP.md`
- **Current user-selected objective:** Dựng lại Echoes of Mars Learning Lab từ đầu, giữ coverage 14 IBM courses + 386 questions
- **Feature slice in progress:** NONE; đang chờ duyệt G0/G1
- **Knowledge topics / IBM mapping:** Chưa assessed
- **Question UIDs used:** NONE

## Đã làm trong phiên

- Đọc toàn bộ `AGENTS.md`, `README_INSTALL.md` và `docs/learning/`.
- Xác nhận folder này là starter kit, không phải repository/source cũ.
- Audit Java/build/Git/source/test bằng lệnh thật.
- Parse private question bank: 386/386 UID duy nhất; Java 121, Backend 104, Database 161; 21 needs_review, 365 unreviewed.
- Ghi baseline và kiến trúc greenfield proposal; không sửa/tạo Java source.

## Người học đã chứng minh điều gì?

- **Theory:** Chưa có câu trả lời kiểm tra; giữ L0.
- **Coding:** Chưa có code do người học viết trong canonical project; giữ L0.
- **Project decision:** Người học xác nhận canonical folder và greenfield rebuild. Đây không phải evidence Java mastery.

## Vấn đề mở / quyết định cần duyệt

1. Java target release: đề xuất `21` LTS, máy đang có JDK 25.
2. Package gốc: đề xuất `com.echoesofmars.lab`.
3. Duyệt G0: root `.gitignore` -> `git init` -> documentation checkpoint.
4. Duyệt G1: entry point Java tối thiểu bằng raw `javac`; Maven sau smoke slice đầu tiên.
5. Corpus có 0 verified answer; câu dùng để dạy phải fact-check trước.

## Hành động tiếp theo

- **ChatGPT:** Có thể kiểm tra lý thuyết CORE-01 (JDK/JVM/javac/classpath/main) và xuất `TEACHER_FEEDBACK`; chưa được coi là đã đồng bộ repo.
- **Codex:** Sau phê duyệt, thực hiện G0 an toàn rồi giao G1 cho người học; chưa thêm Spring/Maven/database.
- **Người học:** Chọn Java target/package và xác nhận thứ tự G0/G1.

## Tệp cần gửi cho ChatGPT

- `docs/learning/HANDOFF.md`
- Khi cần bối cảnh chi tiết: `BASELINE_AUDIT.md`, `ROADMAP.md`
