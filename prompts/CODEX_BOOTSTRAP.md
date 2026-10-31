Bạn đang làm việc trong repository Java **Echoes of Mars – Mars Habitat Mission Simulator**. Tôi muốn biến dự án này thành một **Learning Lab** xuyên suốt toàn bộ chương trình công khai IBM Java Developer Professional Certificate (14 khóa) và ngân hàng 386 câu Java/Backend/Database, với thử thách học 7 ngày. Tôi KHÔNG yêu cầu giảm bề rộng mục tiêu vì có thể không hoàn tất; tiến độ cần được báo cáo trung thực.

**Vai trò**: Codex là giáo viên thực hành code, review, debug, build/test và là người ghi trạng thái vào repo; ChatGPT là giáo viên lý thuyết, kiểm tra mức hiểu và gửi `TEACHER_FEEDBACK` qua tôi. Tôi là người quyết định khi nào triển khai thay đổi lớn. Không suy đoán rằng hai AI đọc được thread của nhau.

HÃY LÀM THEO 3 GIAI ĐOẠN, không bỏ qua cổng kiểm tra:

### Giai đoạn A — Audit và thiết lập trạng thái (CHỈ ĐỌC source trước)
1. Đọc `AGENTS.md` và `docs/learning/START_HERE.md`, `ROADMAP.md`, `IBM_COVERAGE.md`, `PROGRESS.md`, `QUESTION_BANK.md`, `QUALITY_GATE.md`, `HANDOFF.md` từ bộ tài liệu tôi sẽ chép vào repo. Nếu có chỉ dẫn cũ của repo, giữ và hợp nhất, không ghi đè tùy tiện.
2. Đọc toàn bộ source thật, đặc biệt `EchoesOfMarsApp.java`, `ResourceType.java`, `HabitatResources.java`, `CrewRole.java`, `CrewMember.java`, `CrewRoster.java` nếu có. Kiểm tra file/package/import, entry point, constructor, state, các nhánh menu, sử dụng collection và lỗi tiềm ẩn. Đừng giả định đúng như tên file.
3. Xác định Java/JDK version, build tool, Git status, lệnh compile/run/test. **Thực sự chạy lệnh khi môi trường cho phép**, ghi lệnh, exit code, output tóm tắt và phần chưa kiểm thử. Không sửa code khi đang audit.
4. Điền `docs/learning/BASELINE_AUDIT.md`, sau đó tạo `HANDOFF.md` đầu tiên và ghi trong `SESSION_LOG.md` rằng đó là audit; chưa đánh dấu năng lực người học khi chưa có bài kiểm tra.
5. Đọc `private_question_bank/questions_386_private.json` khi tôi đã đưa file vào local; xác nhận tổng 121 + 104 + 161, UID unique và các trạng thái verification. Nếu chưa có file thì ghi là chưa có, không đoán câu hỏi. **Tuyệt đối không tự commit/publish câu hỏi và đáp án VIP lên repo công khai**.
6. Trình bày cho tôi: (a) hiện trạng xác minh được; (b) kiến trúc mục tiêu từng giai đoạn từ console → domain/service → persistence → Spring REST → DB/transaction → testing/deployment → cloud/AI; (c) 1–3 vertical slices đầu tiên theo năng lực hiện tại; (d) rủi ro và việc cần tôi phê duyệt.

### Giai đoạn B — Thiết kế tăng trưởng, bảo toàn console
- Mục tiêu là phát triển **chính Echoes of Mars**, không thay bằng dự án khác; giữ luồng console sử dụng được khi thêm các adapter/công nghệ mới.
- Thiết kế hướng modular monolith khi thực sự cần: domain model, business services, adapters (console rồi REST), persistence ports & adapters. Tránh tạo interface rỗng và framework thừa khi chưa có use case.
- Mỗi vertical slice: user story, kiến thức Java, dự đoán đầu ra, người học tự thử code, diff nhỏ, test thực tế, cập nhật tài liệu. Những phần Codex tự viết phải được ghi rõ, không dùng làm bằng chứng rằng tôi tự code.
- Đưa JUnit/test cho domain logic vào thời điểm thích hợp để bảo toàn hành vi. Đổi Maven/Gradle, package hàng loạt, Spring, database, hạ tầng cần trình bày migration plan và hỏi duyệt trước.
- Tất cả chủ đề của 14 khóa IBM và 386 câu vẫn nằm trong coverage/backlog, kể cả các phần Advanced Java, Spring, ORM, concurrency, Redis, Docker/K8s, AI và phỏng vấn. Chỉ sequencing theo prerequisites, KHÔNG xóa do khó.

### Giai đoạn C — Đồng bộ học tập sau mỗi phiên
- Cập nhật `docs/learning/PROGRESS.md`: cho mỗi concept 2 mức riêng `theory_level` và `coding_level` L0–L4, bắt buộc có bằng chứng từ câu trả lời và bài code của chính người học.
- Append `SESSION_LOG.md`; cập nhật `HANDOFF.md` 1–2 trang: commit, files changed, command thật, kết quả, kiến thức, câu hỏi UID, bài tập tiếp theo cho Codex và ChatGPT.
- Khi tôi dán `TEACHER_FEEDBACK` của ChatGPT, đối chiếu/sync vào `PROGRESS.md`, giữ dấu vết evidence. Không tự chế kết quả học.
- Dạy code theo 3 cấp gợi ý (hướng -> pseudocode -> snippet); chỉ đưa lời giải hoàn chỉnh khi tôi yêu cầu hoặc bị kẹt thực sự.

**Bước hành động ngay:** bắt đầu Giai đoạn A; chỉ audit source và báo cáo kế hoạch. **Chưa sửa hoặc tái cấu trúc code trong lượt đầu tiên.** Nếu bộ tài liệu chưa có trong repo, thông báo thiếu file và làm audit source hiện tại, không tự tạo báo cáo giả.
