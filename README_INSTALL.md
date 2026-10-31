# Echoes of Mars Learning Lab | Starter Kit

Mục đích: thiết lập quy trình phối hợp **ChatGPT (giáo viên lý thuyết)** + **Codex (giáo viên code)** trên chính repository Echoes of Mars của bạn.

## Triển khai an toàn

1. Sao lưu hoặc tạo Git commit của repository hiện tại trước khi thay đổi.
2. Chép `docs/learning/` vào repository. Nếu đã có tệp trùng tên, so sánh/merge; **không ghi đè** nội dung đã có.
3. Đọc và hợp nhất `AGENTS.md` với AGENTS.md hiện tại, nếu có. Không thay thế những hướng dẫn riêng của dự án mà chưa xem xét.
4. Chép `private_question_bank/` và `reference/` vào nơi local riêng tư (ví dụ `data/private-question-bank/`); bảo đảm không được Git theo dõi và không upload lên GitHub công khai. Tệp `gitignore.additions.txt` gợi ý cấu hình.
5. Dán `prompts/CODEX_BOOTSTRAP.md` vào thread Codex đang thao tác trên project. Codex phải **audit source thực tế trước khi sửa**, xuất báo cáo và kế hoạch từng bước, rồi mới triển khai theo sự chấp thuận của bạn.
6. Sau mỗi buổi, Codex ghi `docs/learning/HANDOFF.md`, `PROGRESS.md`, `SESSION_LOG.md`; bạn gửi `HANDOFF.md` và nếu cần các file đã thay đổi cho ChatGPT để học lý thuyết.
7. Sau buổi lý thuyết, ChatGPT xuất mục `TEACHER_FEEDBACK`; bạn đưa mục đó cho Codex. Codex đồng bộ lại trạng thái vào repository. Cả hai không tự nhận là đã đồng bộ nếu chưa thực sự nhìn thấy bản cập nhật.

**Không có khả năng đọc chéo thread tự động**: cùng tài khoản ChatGPT/Codex không có nghĩa ChatGPT hiện tại đọc được `codex://` hoặc thư mục local của Codex. Có thể giảm thao tác gửi tay bằng repository GitHub riêng tư và kết nối phù hợp, nhưng không được giả định đã kết nối.

**Hạn chế kiến thức:** Các file JSON private chứa câu hỏi/đáp án người dùng đã thu thập để học cá nhân; không có bảo đảm về quyền công bố rộng rãi. Dữ liệu có thể chứa lỗi chuyên môn. Trạng thái `unreviewed` không đồng nghĩa đúng hoặc sai.

## Nội dung

- `AGENTS.md`: quy tắc làm việc dài hạn của Codex.
- `docs/learning/`: phạm vi học, lộ trình dự án, tiến độ, bằng chứng, nhật ký, bàn giao, chính sách dữ liệu.
- `prompts/`: lệnh khởi tạo cho Codex và prompt cho ChatGPT.
- `private_question_bank/questions_386_private.json`: ngân hàng 386 câu đã gắn UID và trạng thái kiểm chứng.
- `reference/`: audit trước đó (chỉ dùng làm tham khảo kiểm chứng sơ bộ).

**Không có code Java được thay đổi bởi bộ starter kit này.** Chúng tôi chưa có các file `.java` của dự án để kiểm tra hoặc chỉnh sửa.
