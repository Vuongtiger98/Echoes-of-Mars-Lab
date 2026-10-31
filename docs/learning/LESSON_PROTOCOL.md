# LESSON PROTOCOL | Lý thuyết gắn thực hành

## Quy trình học một concept

1. `PREVIEW` — bối cảnh trong Echoes of Mars và một câu dự đoán kết quả/chọn thiết kế.
2. `THEORY` — ChatGPT giải thích từ căn bản: nghĩa, cú pháp, JVM xử lý, tình huống dùng, sai lầm thường gặp, ví dụ khác project, điều kiện phụ thuộc version.
3. `RECALL` — người dùng trả lời 2–5 câu không nhìn lời giải; sửa sai bằng lời giải thích có lý do.
4. `CODING` — Codex giao bài nhỏ trên source hiện tại, người dùng tự sửa; nêu rõ hành vi mong muốn trước khi chạy.
5. `TEST` — biên dịch, chạy demo/test trên code; ghi đầy đủ lệnh, kết quả; nếu chưa chạy đánh dấu `not_run`.
6. `TRANSFER` — hỏi một biến thể hoặc lỗi mới; cập nhật hai mức `theory_level`, `coding_level` và bằng chứng.

## ChatGPT xuất TEACHER_FEEDBACK cuối buổi

```text
TEACHER_FEEDBACK
Date/time:
Repo commit / snapshot (nếu biết):
Topics / IBM course IDs:
Question UIDs used:
User's own answers (brief evidence, no VIP answer verbatim):
Theory levels (L0-L4 + reasons):
Confusions and corrections:
Recommended coding exercise (not solution):
Review scheduling / next theory:
Source verification status (verified/needs_review/unreviewed):
END_TEACHER_FEEDBACK
```

## Codex xuất CODEX_FEEDBACK cuối buổi

```text
CODEX_FEEDBACK
Date/time:
Base commit -> end commit (nếu có):
Files changed:
Commands actually run + exit status:
Behavioral evidence:
User wrote independently vs AI wrote:
Coding levels (L0-L4 + reasons):
Issues / regressions:
Next hands-on task:
END_CODEX_FEEDBACK
```

## Nguyên tắc

- Nếu người dùng yêu cầu lời giải, cung cấp nhưng **không đánh dấu tự code**.
- Nếu bài học còn sai/không chắc chắn, đánh dấu `needs_review` và đối chiếu nguồn chính thức trước khi dùng làm lời giải chuẩn.
- Không yêu cầu người dùng thuộc 386 đáp án. Có thể **đi qua toàn bộ danh mục**, nhưng kiểm tra độ sâu bằng evidence.
- Không dùng output `javac`/`mvn` đã đoán thay cho log đã chạy.
