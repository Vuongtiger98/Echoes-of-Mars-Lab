# QUALITY GATE | Các bước trước và sau khi Codex sửa dự án

## Trước refactor đầu tiên

- [ ] Audit và xác nhận source đúng 6 file thực tế (hoặc ghi cấu trúc khác nếu có).
- [ ] `git status`, checkpoint bằng Git hoặc bản sao lưu, không commit secrets.
- [ ] Biết lệnh build/run hiện tại và kết quả thực chạy.
- [ ] Viết snapshot/smoke test cho flow cũ (menu, consume/replenish nếu các method thực sự có).
- [ ] Liệt kê rủi ro và breaking changes, được người dùng chấp thuận.

## Với mỗi vertical slice

- [ ] Có user story ngắn, ví dụ input, expected output trước sửa.
- [ ] Có nhiệm vụ cho người học tự code hoặc giải thích (không chỉ nhận code AI).
- [ ] Thay đổi nhỏ, giải thích diff theo method/class và khái niệm Java.
- [ ] Build/test bằng lệnh thật, ghi exit code hoặc ghi `NOT_RUN`.
- [ ] Kiểm tra regression của luồng console.
- [ ] Ghi `CODEX_FEEDBACK`, `PROGRESS`, `SESSION_LOG`, `HANDOFF`.

## Điều kiện cần chấp thuận riêng

- Tái cấu trúc package lớn/đổi build system sang Maven/Gradle.
- Thêm dependencies, databases, containers, cloud services, keys hoặc hosting trả phí.
- Xóa/đổi dữ liệu lưu trữ hoặc phá tương thích CLI.
- Viết lại kiến trúc quá rộng, bỏ chức năng cũ, chuyển console thành Web.

Không có gì trong quality gate cấm kiến thức khó: chỉ cấm tuyên bố hoàn thành khi chưa có bằng chứng và cấm đổi lớn không kiểm soát.
