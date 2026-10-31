# QUESTION BANK | 386 câu hỏi dùng cho học và tự kiểm tra

## Nguồn

Bộ dữ liệu do người dùng thu thập để tự học cá nhân từ PassInterview; **không khẳng định quyền phân phối/công bố**. Các file gốc (nếu người dùng cấp cho Codex) đặt ở thư mục local riêng tư `data/private-question-bank/`, không commit public.

| Nhóm | Count | ID | UID format |
|---|---:|---|---|
| Java Core | 121 | 1–121 | `java-001` … `java-121` |
| Backend | 104 | 1–104 | `backend-001` … `backend-104` |
| Database | 161 | 1–161 | `database-001` … `database-161` |
| Tổng | **386** | | |

## Kết quả kiểm tra sơ bộ (không phải factual certification)

- Cấu trúc JSON và answer không rỗng: 386/386.
- `needs_review`: 21 câu đã gắn cờ (có thể lỗi hoặc thiếu version/điều kiện).
- `unreviewed`: phần còn lại, chưa kiểm tra từng phát biểu.
- Metadata `source` ở 265 câu Backend/Database ghi trang Java do script cũ; `category` theo tên file vẫn xác định được. Không tự đoán URL chính xác của danh mục.
- 185 câu có thể chứa nhãn UI bị lẫn vào answer, không nên dùng nguyên văn làm code chạy.
- Trùng hoàn toàn: `backend-029` = `database-062`; `backend-030` = `database-079`. Giữ cả UID và gắn quan hệ `duplicate_of` khi phân loại, không xóa dữ liệu gốc.

## Quy tắc chọn câu để dạy

1. Dùng kiến thức đang xuất hiện trong code và syllabus IBM để tìm UID, tránh dạy theo ID tuần tự nếu không phù hợp.
2. Ưu tiên `verified` khi có ghi evidence (tài liệu chính thức hoặc bài test); `unreviewed` chỉ dùng như **đề bài**; nếu giải thích đáp án thì phải đối chiếu nguồn chính thức và ghi rõ mức chắc chắn.
3. Với `needs_review`, **không** đọc nguyên đáp án như lời giải chuẩn; phân tích và hiệu đính có nguồn trước.
4. Với code snippet, phân biệt ví dụ rút gọn, code biên dịch được, kết quả đã chạy và kết quả dự đoán.
5. Mỗi lần chuyển trạng thái `verified`, ghi ngày, version JDK/DB, nguồn URL và/hoặc lệnh test vào audit record riêng. Đừng sửa nguyên bản raw; lưu correction và tham chiếu.
6. Đừng hiển thị 386 đáp án liên tục cho người học; vẫn giữ quyền truy cập toàn bộ ngân hàng và cho phép chọn bất kỳ topic nào.

## Dữ liệu private chuẩn hóa

File: `private_question_bank/questions_386_private.json` trong starter kit. Các field gồm `uid`, `category`, `question_id`, `question`, `answer_raw`, `answer_format`, `fact_check_status`, `origin_url_reported`, `origin_url_status`, `references`, và các field hỗ trợ.

**Lưu ý:** File private có chứa nội dung trả phí mà người dùng có quyền truy cập cá nhân; không publish, không đưa vào public dataset hoặc training corpora.
