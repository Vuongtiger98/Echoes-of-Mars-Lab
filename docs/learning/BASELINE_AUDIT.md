# BASELINE AUDIT | Echoes of Mars Learning Lab

**Status:** COMPLETED_FOR_GREENFIELD_STARTER

**Audit date:** 2026-11-01

**Scope rule:** Audit folder `D:\Documents\Echoes of Mars Lab`; không dùng build của repository cũ làm bằng chứng cho project này.

## Kết luận ngắn

Folder hiện tại là **Learning Lab starter kit**, chưa phải Java application repository. Người dùng đã xác nhận đây sẽ là canonical folder và project Java sẽ được dựng mới từ đầu theo thay đổi tăng dần. Vì chưa có source, chưa có chức năng cũ trong canonical project để regression-test hoặc bảo toàn.

## Snapshot hiện trạng

- Repo path: `D:\Documents\Echoes of Mars Lab`
- Git: chưa có `.git`; `git status` trả `fatal: not a git repository`.
- JDK runtime: `java version "25.0.3" 2026-04-21 LTS`.
- Java compiler: `javac 25.0.3`.
- Maven: `NOT_FOUND`.
- Gradle: `NOT_FOUND`.
- Java source count: `0`.
- Java test source count: `0`.
- Maven `pom.xml` count: `0`.
- Gradle build file count: `0`.
- Package/import relationships: chưa tồn tại.
- App entry point/user flow: chưa tồn tại.
- Source-backed features: chưa tồn tại.
- Stub/mock/placeholder behavior: chưa tồn tại trong source; tài liệu starter chỉ là kế hoạch.
- Existing tests/fixtures/sample inputs: chưa tồn tại.

## Tài liệu và dữ liệu đã xác minh

- Đã đọc toàn bộ `AGENTS.md` và `docs/learning/`.
- `private_question_bank/questions_386_private.json` parse JSON thành công.
- Tổng UID: `386`; UID duy nhất: `386`.
- Category: Java `121`, Backend `104`, Database `161`.
- Fact-check status: `needs_review=21`, `unreviewed=365`, `verified=0`.
- Câu hỏi rỗng: `0`; `answer_raw` rỗng: `0`.
- Dữ liệu private đã có `.gitignore` cục bộ; trước khi `git init` vẫn cần root `.gitignore` bảo vệ cả `/private_question_bank/` và `reference/`.

## Actual command evidence

### Environment

```powershell
java -version
javac -version
Get-Command mvn
Get-Command gradle
```

Kết quả: Java/Javac exit `0`; Maven/Gradle không tìm thấy.

### Git

```powershell
git status --short
git branch --show-current
```

Kết quả: cả hai báo `fatal: not a git repository`.

### Build/run/test

- Compile command: `NOT_AVAILABLE` — không có `.java`.
- Run command: `NOT_AVAILABLE` — không có entry point.
- Test command: `NOT_AVAILABLE` — không có test hoặc build tool.
- Không được ghi “build passed” cho baseline này.

## Đối chiếu ROADMAP

- P0 mới đạt phần inventory tài liệu/môi trường; chưa đạt reproducible application baseline vì application chưa tồn tại.
- P1–P9 vẫn giữ nguyên phạm vi và đều chưa triển khai.
- Vì greenfield, thay đổi đầu tiên phải là một vertical slice Java tối thiểu chạy bằng `javac`, không tạo sẵn hàng loạt layer/interface rỗng.
- Source cũ ở folder khác chỉ được dùng làm nguồn ý tưởng khi người dùng yêu cầu; không tự copy và không coi code AI cũ là năng lực người học.

## Risks và safe first change

### Rủi ro

- `git init` trước khi có root `.gitignore` có thể vô tình stage ngân hàng câu hỏi private/reference exports.
- JDK 25 là môi trường cài đặt, nhưng target release cho project chưa được người dùng quyết định.
- Thêm Maven/Spring/DB ngay ở commit đầu sẽ che khuất compile/run model và vi phạm incremental gate.
- Greenfield dễ dẫn đến việc AI sinh nhiều code nhưng không tạo bằng chứng người dùng tự lập trình.

### Behavior đầu tiên cần thiết lập

Một CLI nhỏ có entry point, in tên Learning Lab và thoát sạch. Expected output phải được viết trước; người dùng có cơ hội tự viết; Codex compile/run thực tế và ghi evidence.

### Proposed first vertical slice (chưa triển khai)

1. Tạo root `.gitignore` bảo vệ private data, build output, IDE files và secrets.
2. Khởi tạo Git và checkpoint riêng cho starter documentation.
3. Chọn Java target release và package gốc.
4. Tạo đúng một entry point Java tối thiểu; chưa thêm Maven/Spring/database.
5. Compile/run bằng `javac` và ghi smoke evidence.

### Cần người dùng phê duyệt

- Java target: đề xuất Java 21 LTS, dù máy đang chạy JDK 25.
- Package gốc: đề xuất `com.echoesofmars.lab`.
- Git init và commit starter kit sau khi root `.gitignore` được kiểm tra.
- First slice tối thiểu trước khi chọn thời điểm đưa Maven vào.
