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

## 2026-11-01 / ENTRYPOINT-G1-003 (IN_PROGRESS)

- **Objective and concepts:** Java 21 package/class/main, raw javac, classpath và fully qualified class name.
- **IBM course(s), question UIDs:** IBM 2; `java-055` được map làm recall prompt, trạng thái `unreviewed`, chưa dùng answer_raw làm lời giải.
- **Learner theory answers:** Chưa trả lời câu dự đoán về fully qualified class name.
- **Learner-authored code / AI-authored code:** Codex tạo starter package/class/main và hints; `println` còn TODO cho người học.
- **Files changed and reason:** `EchoesOfMarsApplication.java` starter; `README.md` có lệnh compile/run; learning docs ghi trạng thái.
- **Commands actually executed and results:** `javac --release 21 ...` exit 0; `java -cp out com.echoesofmars.lab.EchoesOfMarsApplication` exit 0; output line count 0.
- **Mistakes, fixes, and new questions:** Không có compile error; behavioral acceptance chưa đạt vì TODO chưa hoàn thành.
- **Theory/coding changes:** CORE-01 giữ L0/L0; chưa có evidence cá nhân.
- **Next session action:** Người học thêm đúng một câu lệnh in output, chạy lại hoặc yêu cầu Codex review; sau đó kiểm tra exact output và commit completion.

## 2026-11-01 / ENTRYPOINT-G1-004 (FUNCTIONAL_PASS)

- **Objective and concepts:** Review learner change và exact-output verification cho G1.
- **IBM course(s), question UIDs:** IBM 2; `java-055` vẫn unreviewed, chưa dùng answer_raw.
- **Learner theory answers:** Chưa trả lời vì sao lệnh `java` cần fully qualified class name.
- **Learner-authored code / AI-authored code:** Người học tự thêm `System.out.println("Echoes of Mars Learning Lab");`; starter/package/main do Codex tạo trước đó.
- **Files changed and reason:** Learner sửa `EchoesOfMarsApplication.java`; Codex chỉ cập nhật learning evidence, không sửa source của learner.
- **Commands actually executed and results:** javac `--release 21` exit 0; java exit 0; 1 output line; exact case-sensitive match true; `git diff --check` fail do trailing whitespace tại dòng 25.
- **Mistakes, fixes, and new questions:** Functional behavior đúng. Còn TODO lỗi thời và whitespace cần người học dọn.
- **Theory/coding changes:** CORE-01 theory giữ L0; coding L0 -> L1 nhờ một thay đổi nhỏ đúng theo hints và kiểm chứng thật.
- **Next session action:** Người học xóa TODO đã hoàn tất, xóa trailing whitespace, trả lời câu FQCN; Codex chạy full gate rồi commit G1.

## 2026-11-01 / ENTRYPOINT-G1-005 (TECHNICALLY_COMPLETE)

- **Objective and concepts:** Xác minh cleanup, chạy final gate và checkpoint learner-authored G1.
- **IBM course(s), question UIDs:** IBM 2; `java-055` mapped/unreviewed; chưa dùng answer_raw.
- **Learner theory answers:** Chưa trả lời câu FQCN, theory CORE-01 giữ L0.
- **Learner-authored code / AI-authored code:** Người học giữ đúng một `println` và tự xóa TODO/hints/whitespace; starter package/class/main ban đầu do Codex tạo.
- **Files changed and reason:** `EchoesOfMarsApplication.java` hoàn thiện G1; README/roadmap/learning docs ghi evidence.
- **Commands actually executed and results:** `git diff --check` exit 0; javac `--release 21` exit 0; java exit 0; output line count 1; exact case-sensitive match true.
- **Mistakes, fixes, and new questions:** Cleanup hoàn tất. Câu hỏi còn mở: vì sao launcher cần fully qualified class name khi class nằm trong package.
- **Theory/coding changes:** CORE-01 theory L0; coding giữ L1. Technical completion không tự nâng theory.
- **Git evidence:** learner-authored source commit `6eabcc2 feat: complete G1 Java entry point`.
- **Next session action:** Theory recall CORE-01 hoặc bắt đầu G2 menu/input sau khi preview và prediction.
