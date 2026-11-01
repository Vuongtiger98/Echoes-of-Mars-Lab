# START HERE | Giao thức phối hợp ChatGPT ↔ Codex

## Một nguồn sự thật chung

Các file trong `docs/learning/` là **bản ghi chính thức trong repository**. Codex là **bên ghi trực tiếp duy nhất** vào những file này; ChatGPT cung cấp phân tích và `TEACHER_FEEDBACK` để người dùng chuyển sang Codex cập nhật. Không suy đoán rằng ChatGPT có quyền đọc local repo hoặc thread `codex://`.

- `PROGRESS.md`: trạng thái nắm kiến thức và bằng chứng.
- `HANDOFF.md`: snapshot ngắn của phiên gần nhất; là file gửi cho ChatGPT khi mở buổi học.
- `SESSION_LOG.md`: lịch sử append-only, không ghi đè quá khứ.
- `ROADMAP.md`: đích kiến trúc lớn và bước triển khai tiếp theo.
- `IBM_COVERAGE.md`: toàn bộ phạm vi công khai IBM, không tự cắt bỏ.
- `QUESTION_BANK.md`: nguồn 386 câu, UID, độ tin cậy, cách dùng riêng tư.
- `BASELINE_AUDIT.md`: Codex ghi bằng chứng từ source trước khi tái cấu trúc.
- `DECISIONS.md`: các quyết định kiến trúc quan trọng.
- `LESSON_PROTOCOL.md`: định dạng bài học, bài test và bàn giao.

## Vòng lặp một phiên

1. **Codex**: đọc source + tiến độ; chọn hoặc tiếp tục một vertical slice; ghi mục tiêu, test expectation và kiến thức cần biết.
2. **Người dùng ↔ ChatGPT**: đọc `HANDOFF.md`, học khái niệm, trả lời 2–5 câu hỏi không nhìn đáp án. ChatGPT trả `TEACHER_FEEDBACK` với mức và lý do, không nhận là đã lưu vào repo.
3. **Người dùng ↔ Codex**: thực hành viết/sửa code, chạy kiểm chứng, so sánh trước/sau, cập nhật source. Codex tiếp nhận `TEACHER_FEEDBACK`.
4. **Codex**: cập nhật `PROGRESS.md` + `SESSION_LOG.md`, tạo `HANDOFF.md` mới, báo rõ file đã đổi và lệnh đã chạy.
5. **Người dùng**: đưa `HANDOFF.md` cập nhật cho ChatGPT ở phiên kế tiếp; nếu cần review code sâu, đính kèm code/diff.

## Office Study Mode và Home Coding Mode

### Office Study Mode — ban ngày

1. Mở `HANDOFF.md` để lấy đúng commit, feature và misconception hiện tại.
2. ChatGPT/Microsoft Copilot dạy prerequisite gần nhất và có thể giới thiệu trước các chủ đề trong roadmap.
3. Mỗi UID được dùng phải ghi `verified`, `needs_review` hoặc `unreviewed`; UID trong lịch coverage không phải bằng chứng đã hiểu.
4. Kết thúc bằng `TEACHER_FEEDBACK`: câu trả lời thật của người học, theory coverage, theory level, phần còn nhầm và transfer task cho buổi tối.

### Home Coding Mode — buổi tối

1. Codex đọc `HANDOFF.md`, feedback mới nhất và source ở đúng Git checkpoint.
2. Chọn một vertical slice nhỏ; không cần đợi học xong toàn bộ theory của ngày nếu prerequisite tối thiểu đã đủ để thử.
3. Người học dự đoán và tự code trước. Codex dùng hint ladder, review và chạy acceptance test thật.
4. Kết thúc bằng Git checkpoint và snapshot `HANDOFF.md` mới. Theory level và coding level vẫn được đánh giá độc lập.

### Ba trục không được gộp

- **Theory coverage:** chủ đề/câu hỏi đã được tiếp cận; không đồng nghĩa đã nhớ hoặc hiểu.
- **Theory level:** khả năng tự giải thích, phân biệt và dự đoán dựa trên câu trả lời thật.
- **Coding level:** khả năng tự viết, sửa, debug và kiểm chứng code.

Challenge Day 1 chỉ được ghi khi người học xác nhận bắt đầu. Việc chuẩn bị tài liệu, audit hoặc đồng bộ roadmap vẫn thuộc Day 0.

## Quy tắc đánh giá mức hiểu

- `L0 — Chưa được đánh giá`: có thể đã gặp chủ đề nhưng chưa có bằng chứng kiểm tra.
- `L1 — Nhận biết`: có thể gọi tên và nêu vai trò.
- `L2 — Giải thích`: tự giải thích bằng lời, phân biệt khái niệm và dự đoán kết quả đơn giản.
- `L3 — Vận dụng`: tự triển khai/sửa code và kiểm chứng.
- `L4 — Chuyển giao`: giải bài toán mới, debug/trade-off và giải thích được lựa chọn.

Một chủ đề có thể có `theory_level=L3` và `coding_level=L1` (hoặc ngược lại); không ép hai cột giống nhau. `AI-implemented` không chứng minh `user-can-code`.

## Phạm vi và nhịp độ

- Tất cả 14 học phần IBM và 386 câu đều nằm trong backlog. 7 ngày là thử thách khám phá tối đa, không phải một chứng nhận hoàn thành tương đương chương trình IBM.
- Tiến theo năng lực thực tế: nếu chưa đạt điều kiện trước, giữ bước sau ở trạng thái `blocked/prerequisite`; không xoá khỏi phạm vi.
- Chọn công việc tiếp theo dựa trên lỗ hổng kiến thức và cơ hội trong source, **không dựa trên việc hoàn thành nhiều file do AI viết**.

## Chia sẻ file

- `HANDOFF.md` không chứa secrets, đáp án VIP nguyên văn hay dữ liệu cá nhân.
- Nếu không có GitHub connector: người dùng gửi nội dung `HANDOFF.md` và tùy lúc `PROGRESS.md` cho ChatGPT; kết quả ChatGPT phản hồi được chuyển lại Codex.
- Nếu dùng GitHub riêng tư và có kết nối phù hợp: có thể đọc cùng repo, nhưng xác minh quyền truy cập từng phiên, không giả định cập nhật real-time.
- Repository hiện là GitHub public. Chỉ chia sẻ snapshot đã được làm sạch; không commit ngân hàng câu hỏi private, đáp án raw, secrets, dữ liệu cá nhân hoặc feedback riêng tư chưa được phép công khai.
