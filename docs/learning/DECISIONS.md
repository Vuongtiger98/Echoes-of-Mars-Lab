# DECISIONS | Quyết định kiến trúc và cách học

## ADR-001: Một dự án xuyên suốt, không bỏ console
**Status:** Accepted as learning goal; implementation not started.
**Decision:** Phát triển Echoes of Mars bằng thay đổi tăng dần, giữ chức năng console chạy được, sau đó có thể cung cấp API và DB trên cùng domain. Không tạo hệ thống mới thay thế bằng một lần rewrite.
**Consequence:** Thiết kế phân lớp theo nhu cầu và có test bảo vệ hành vi trước refactor lớn.

## ADR-002: Một bên ghi tài liệu chuẩn
**Status:** Accepted as proposed workflow.
**Decision:** Codex cập nhật trực tiếp tài liệu trong repo; ChatGPT gửi TEACHER_FEEDBACK do người dùng chuyển, trừ khi được cấp cơ chế truy cập và ghi được xác nhận khác.
**Consequence:** Tránh xung đột trạng thái. Handoff phải nêu commit và thời gian.

## ADR-003: Toàn bộ kiến thức vẫn nằm trong thử thách
**Status:** Accepted as learning goal.
**Decision:** Không loại chủ đề IBM hoặc 386 câu chỉ vì khó. Có thể chia nhỏ, phân tầng mức hiểu, giữ backlog và ghi phần chưa đạt.
**Consequence:** Tổng số chủ đề tiếp cận và số chủ đề thành thạo được báo cáo riêng.

## ADR-004: Corpus cá nhân, chưa kiểm chứng toàn bộ
**Status:** Accepted for safety of learning material.
**Decision:** Dùng local/private questions làm tài liệu tham khảo; không tự đưa lên public repo. Mỗi phát biểu kỹ thuật quan trọng cần nguồn hoặc code test khi dùng để dạy.
**Consequence:** Đánh dấu `unreviewed/needs_review/verified`, không tự xóa câu trùng trước khi map.

## ADR-005: Folder canonical và greenfield rebuild
**Status:** Accepted by user on 2026-11-01.
**Decision:** `D:\Documents\Echoes of Mars Lab` là folder canonical mới. Java application được dựng lại từ đầu trong folder này để đáp ứng Learning Lab. Source ở repository cũ không được tự động copy hoặc coi là baseline của project mới.
**Consequence:** Baseline hiện có 0 Java source và 0 test. Mỗi chức năng mới phải được thêm như một vertical slice nhỏ với expected behavior, lệnh kiểm chứng thật và phân biệt rõ phần người dùng tự viết/phần AI hỗ trợ. Source cũ chỉ dùng làm reference khi người dùng yêu cầu cụ thể.

## ADR-006: Không tạo kiến trúc giả bằng folder/interface rỗng
**Status:** Accepted by user on 2026-11-01.
**Decision:** Bắt đầu bằng một CLI chạy được, sau đó chỉ tạo package/layer khi vertical slice cần. Kiến trúc mục tiêu vẫn giữ domain, application, adapters, persistence, Spring, database, deployment và AI.
**Consequence:** Giữ toàn bộ scope P0–P9 nhưng giảm rủi ro big-bang scaffolding và code do AI sinh không có hành vi.

## ADR-007: Java target và package gốc
**Status:** Accepted by user on 2026-11-01.
**Decision:** Dùng JDK 25.0.3 hiện có để compile với target `--release 21`; package gốc là `com.echoesofmars.lab`.
**Consequence:** Code chỉ dùng Java API/language level phù hợp Java 21. G1 phải chứng minh lệnh raw `javac --release 21` trước khi đưa Maven vào.
