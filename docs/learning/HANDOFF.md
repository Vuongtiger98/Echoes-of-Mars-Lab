# HANDOFF | Snapshot mới nhất cho cả ChatGPT và Codex

- **Updated at:** 2026-11-02 (Asia/Saigon)
- **Challenge day:** Day 0 / 7 — audit/setup; thời điểm bắt đầu Day 1 chưa được xác nhận
- **Canonical folder:** `D:\Documents\Echoes of Mars Lab`
- **Repository / branch / source checkpoint:** `https://github.com/Vuongtiger98/Echoes-of-Mars-Lab` (public) / `main` / `6eabcc2` (`feat: complete G1 Java entry point`)
- **Java / build tool:** target Java 21; PATH JDK/Javac 25.0.3; JDK 21.0.1 đã chạy G1; Maven/Gradle chưa cài
- **Build status / tests:** G1 `git diff --check`, compile, run và exact-output gate đều pass
- **Current architecture:** Greenfield starter kit; architecture evolution proposed in `ROADMAP.md`
- **Current user-selected objective:** Dựng lại Echoes of Mars Learning Lab từ đầu, giữ coverage 14 IBM courses + 386 questions
- **Feature slice in progress:** G2-A console input `ASSIGNED`; chưa có learner attempt
- **Knowledge topics / IBM mapping:** CORE-01 / IBM 2 — theory L1, coding L1
- **Question UIDs used:** `java-055`, `java-086` mapped/unreviewed; chưa dùng answer_raw
- **Learning modes:** Office Study Mode ban ngày; Home Coding Mode buổi tối; nối bằng `HANDOFF.md` và Git checkpoint

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
- Đồng bộ `TEACHER_FEEDBACK`: người học dự đoán đúng lỗi khi bỏ package khỏi tên chạy nhưng còn nhầm FQCN với file path; CORE-01 theory L1.
- Giao G2-A bằng exercise doc: menu tĩnh, `Scanner`, input String một lần và try-with-resources; source chưa sửa.
- Reconcile feedback checkpoint `6eabcc2`: chấp nhận G1/pedagogy guidance; không hạ CORE-01 theory L1 vì feedback trực tiếp mới hơn đã được sync tại `627764a`.
- ChatGPT duyệt roadmap hybrid 7 ngày ngày 2026-11-02; giữ đủ 14 IBM modules/386 questions và ba trục theory coverage/theory level/coding level.
- Tích hợp Office Study Mode/Home Coding Mode; G2-A/B/C là thứ tự tiếp theo; không sửa Java source khi đồng bộ kế hoạch.

## Người học đã chứng minh điều gì?

- **Theory:** CORE-01 L1 — nhận biết vai trò định vị và dự đoán đúng failure; chưa giải thích độc lập classpath/FQCN nên chưa L2.
- **Coding:** CORE-01 L1 — người học tự thêm một câu lệnh đúng theo hints; chưa đủ bằng chứng tự dựng entry point.
- **Project decision:** Người học xác nhận canonical folder và greenfield rebuild. Đây không phải evidence Java mastery.

## Vấn đề mở / quyết định cần duyệt

1. Java target `21` LTS và package `com.echoesofmars.lab` đã được chấp thuận.
2. G2-A đang chờ learner attempt; Hint 3 chưa dùng.
3. CORE-01 cần được củng cố trong G2 để phân biệt FQCN/classpath với file path; chưa đủ bằng chứng L2.
4. Maven chỉ được đề xuất sau các raw `javac` slices đầu tiên.
5. Corpus có 0 verified answer; câu dùng để dạy phải fact-check trước.
6. Git remote public đã cấu hình và local/remote `main` đồng bộ tại lần audit gần nhất; mỗi phiên vẫn phải kiểm tra lại trước khi tuyên bố sync.
7. Khi feedback dùng snapshot cũ, giữ chronology trong `SESSION_LOG.md`; không ghi đè evidence mới hơn.
8. Đóng `Scanner(System.in)` cũng đóng standard input; G2-A đóng ở cuối chương trình, G2-B/C phải tái sử dụng một scanner xuyên suốt phiên.

## Hành động tiếp theo

- **ChatGPT/Copilot — Office Study Mode:** Củng cố FQCN/classpath và dạy prerequisite G2-A; fact-check UID trước khi chấm; xuất `TEACHER_FEEDBACK` tách coverage/level.
- **Codex — Home Coding Mode:** Chờ learner attempt G2-A, sau đó review/run two-case gate; sau phiên cung cấp prerequisite G2-B; chưa thêm Spring/Maven/database.
- **Người học:** Khi sẵn sàng, xác nhận có bắt đầu Day 1 hay chưa; đọc `docs/learning/exercises/G2A_CONSOLE_INPUT.md`, trả lời ba prediction và sửa đúng một Java file.

## Tệp cần gửi cho ChatGPT

- `docs/learning/HANDOFF.md`
- Khi cần bối cảnh chi tiết: `BASELINE_AUDIT.md`, `ROADMAP.md`
