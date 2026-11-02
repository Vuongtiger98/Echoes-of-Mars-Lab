# GIT-01 | Đọc checkpoint của Day 1

## Mục tiêu

Tập đọc trạng thái repository và phân biệt working tree, staged changes, commit và remote. Codex không suy ra coding mastery từ lệnh do Codex chạy.

## Prediction

1. `git status` trả lời câu hỏi gì?
2. `git diff` thường hiển thị vùng thay đổi nào?
3. Sau `git add`, thay đổi đã thành commit chưa?
4. Commit local có tự động xuất hiện trên GitHub không?

## Thực hành có hướng dẫn

Codex sẽ chạy và cùng người học đọc:

```powershell
git status --short --branch
git diff -- src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java
git log -5 --oneline
```

Người học tự chỉ ra file nào đang sửa, checkpoint gần nhất và điều gì cần kiểm tra trước khi commit. Chưa thực hiện push trong exercise này.

## Acceptance

- Người học mô tả đúng trạng thái working tree từ output thực tế.
- Phân biệt được thay đổi chưa stage, đã stage và đã commit.
- Không stage hoặc commit `private_question_bank/`, secrets hay dữ liệu riêng tư.
