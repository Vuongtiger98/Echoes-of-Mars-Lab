# SESSION LOG | Nhật ký học và code (append-only)

Không xóa/sửa các phiên cũ để tô đẹp tiến độ. Nếu phát hiện sai, thêm một dòng đính chính trong phiên mới.

## Template cho phiên tiếp theo (chưa phải một phiên đã hoàn thành)

```text
YYYY-MM-DD / Session ID:
Objective and concepts:
IBM course(s), question UIDs:
Learner theory answers (brief):
Learner-authored code / AI-authored code (distinguish):
Files changed and reason:
Commands actually executed and results:
Mistakes, fixes, and new questions:
Theory level / coding level changes with evidence:
Next session action:
```

## 2026-11-01 / BASELINE-GREENFIELD-001

- **Objective and concepts:** Xác định canonical folder, đọc governance, audit starter/source/build/Git/question bank và đề xuất kiến trúc; chưa sửa Java.
- **IBM course(s), question UIDs:** Coverage 1–14 được giữ trong roadmap; chưa dùng UID để kiểm tra kiến thức.
- **Learner theory answers:** Chưa có bài kiểm tra lý thuyết trong phiên này.
- **Learner-authored code / AI-authored code:** Không có Java code được tạo hoặc sửa.
- **Files changed and reason:** `BASELINE_AUDIT.md`, `DECISIONS.md`, `ROADMAP.md`, `PROGRESS.md`, `SESSION_LOG.md`, `HANDOFF.md` để ghi audit và proposal.
- **Commands actually executed and results:** `git status`/`git branch` -> không phải Git repo; `java -version`/`javac -version` -> 25.0.3; Maven/Gradle -> not found; recursive inventory -> 0 Java/0 test/0 build; JSON parse -> 386 unique UID, 21 needs_review, 365 unreviewed.
- **Mistakes, fixes, and new questions:** Ban đầu Codex audit nhầm repository cũ do cwd cũ; người dùng sửa path. Không chuyển bằng chứng build cũ sang project mới. Cần quyết định Java target, package gốc và duyệt G0/G1.
- **Theory/coding changes:** Không đổi; tất cả giữ L0 vì chưa có evidence cá nhân.
- **Next session action:** Sau khi người dùng duyệt proposal, thực hiện G0 rồi giao G1 như bài coding đầu tiên.

## 2026-11-01 / ENVIRONMENT-G0-002

- **Objective and concepts:** Chuẩn bị Git environment an toàn; `.gitignore`, `.gitattributes`, branch `main`, checkpoint.
- **IBM course(s), question UIDs:** IBM 6 (Git/GitHub) được chạm tới ở mức kỹ thuật; chưa đánh giá theory/coding và chưa dùng question UID.
- **Learner theory answers:** Người dùng phê duyệt Java 21, package gốc và thứ tự G0/G1; chưa trả lời câu hỏi Git.
- **Learner-authored code / AI-authored code:** Codex tạo `.gitignore`, `.gitattributes`, `README.md`; không có Java code.
- **Files changed and reason:** Root Git hygiene + project overview; learning documents cập nhật evidence.
- **Commands actually executed and results:** `git init -b main` success; `git check-ignore -v` xác nhận private bank/reference bị ignore; `git diff --cached --check` PASS; `git commit` success -> `b83e262`.
- **Mistakes, fixes, and new questions:** Pre-commit check phát hiện trailing whitespace/blank EOF và đã sửa trước commit. Chưa có remote Git.
- **Theory/coding changes:** GIT-01 giữ L0/L0 vì Codex thực hiện thao tác; không gán năng lực cho người học.
- **Next session action:** G1 — người học tạo/chỉnh entry point Java 21 tối thiểu, dự đoán output; Codex compile/run và ghi evidence.
