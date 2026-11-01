# HANDOFF | Snapshot mới nhất cho cả ChatGPT và Codex

- **Updated at:** 2026-11-02 (Asia/Saigon)
- **Challenge day:** Day 0 / 7 — audit/setup; thời điểm bắt đầu Day 1 chưa được xác nhận
- **Canonical folder:** `D:\Documents\Echoes of Mars Lab`
- **Repository / branch / source checkpoint:** `https://github.com/Vuongtiger98/Echoes-of-Mars-Lab` (public) / `main` / `850f5d3` (`feat: complete G2-B switch selection`)
- **Java / build tool:** target Java 21; PATH JDK/Javac 25.0.3; JDK 21.0.1 đã chạy G1; Maven/Gradle chưa cài
- **Build status / tests:** G2-B JDK 21 compile pass; input `1`, `2`, `9`, `hello` all exact-output pass; `git diff --check` pass
- **Current architecture:** Greenfield starter kit; architecture evolution proposed in `ROADMAP.md`
- **Current user-selected objective:** Dựng lại Echoes of Mars Learning Lab từ đầu, giữ coverage 14 IBM courses + 386 questions
- **Feature slice in progress:** G2-A/G2-B `TECHNICALLY_COMPLETE`; G2-C chưa giao
- **Knowledge topics / IBM mapping:** IBM 2 — CORE-01 L1/L1; CORE-02 L2/L1; CORE-03A input L0/L1; CORE-03B control flow L0/L1; JAVA-04A L2/L1
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
- Teacher Review duyệt G2-A và phát hiện mâu thuẫn thứ tự build tool; roadmap đã thống nhất G3 domain → G4 Maven/JUnit → G5 resource/crew → G6 simulation → G7 file persistence.
- Người học hoàn thành G2-A từ Hint 3 scaffold; lần đầu thiếu nối biến `choice`, sau targeted helper đã tự sửa. Hai exact-output acceptance cases pass tại `8285d47`.
- Chuẩn bị `G2B_PREREQUISITES.md` cho Office Study Mode; chưa sửa source G2-B.
- Người học hoàn thành G2-B từ scaffold; tự sửa cấu trúc try/catch; bốn full-output cases pass tại `850f5d3`.

## Người học đã chứng minh điều gì?

- **Theory:** CORE-01 L1 — nhận biết vai trò định vị và dự đoán đúng failure; chưa giải thích độc lập classpath/FQCN nên chưa L2.
- **Coding:** CORE-01 L1 — người học tự thêm một câu lệnh đúng theo hints; chưa đủ bằng chứng tự dựng entry point.
- **Project decision:** Người học xác nhận canonical folder và greenfield rebuild. Đây không phải evidence Java mastery.

## Vấn đề mở / quyết định cần duyệt

1. Java target `21` LTS và package `com.echoesofmars.lab` đã được chấp thuận.
2. G2-A hoàn thành kỹ thuật với Hint 3; cần transfer task về sau để kiểm tra khả năng tự viết lại không cần scaffold.
3. CORE-01 cần được củng cố trong G2 để phân biệt FQCN/classpath với file path; chưa đủ bằng chứng L2.
4. Maven + JUnit đã được duyệt ở G4, ngay sau domain slice đầu tiên G3 và trước resource/crew phức tạp, simulation và persistence; chưa được triển khai.
5. Corpus có 0 verified answer; câu dùng để dạy phải fact-check trước.
6. Git remote public đã cấu hình và local/remote `main` đồng bộ tại lần audit gần nhất; mỗi phiên vẫn phải kiểm tra lại trước khi tuyên bố sync.
7. Khi feedback dùng snapshot cũ, giữ chronology trong `SESSION_LOG.md`; không ghi đè evidence mới hơn.
8. Đóng `Scanner(System.in)` cũng đóng standard input; G2-A đóng ở cuối chương trình, G2-B/C phải tái sử dụng một scanner xuyên suốt phiên.
9. G2-B hoàn thành kỹ thuật bằng Hint 3; cần transfer task không scaffold trong tương lai trước khi suy ra coding independence.

## Hành động tiếp theo

- **ChatGPT/Copilot — Office Study Mode:** Dạy prerequisite G2-C: `while`/`do-while`, điều kiện dừng, retry, validation flow và tái sử dụng Scanner; không mặc định đã mastery switch vì coding dùng scaffold.
- **Codex — Home Coding Mode:** Chuẩn bị G2-C learner-first exercise sau theory preparation; giữ G2-A/B regression cases.
- **Người học:** Xác nhận Day 1 khi sẵn sàng; sau đó prediction và tự code G2-C.

## Tệp cần gửi cho ChatGPT

- `docs/learning/HANDOFF.md`
- `docs/learning/exercises/G2B_SWITCH_SELECTION.md`
- Khi cần bối cảnh chi tiết: `PROGRESS.md`, `ROADMAP.md`
