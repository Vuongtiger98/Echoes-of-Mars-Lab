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
