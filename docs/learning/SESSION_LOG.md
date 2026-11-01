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

## 2026-11-01 / THEORY-CORE01-006 (TEACHER_FEEDBACK_SYNC)

- **Objective and concepts:** Đồng bộ đánh giá lý thuyết FQCN, package, classpath và Java launcher từ ChatGPT.
- **IBM course(s), question UIDs:** IBM 2; `java-055` vẫn `unreviewed`; feedback không phải fact-check answer_raw.
- **Learner theory answers:** Nhận biết FQCN dùng để định vị chương trình nhưng gọi nhầm là đường dẫn file; dự đoán đúng `java -cp out EchoesOfMarsApplication` không chạy khi class thuộc package.
- **Learner-authored code / AI-authored code:** Không sửa Java source trong phiên đồng bộ này.
- **Files changed and reason:** Chỉ learning records: `PROGRESS.md`, `SESSION_LOG.md`, `HANDOFF.md`.
- **Commands actually executed and results:** Không chạy build/test vì feedback yêu cầu không sửa source; G1 evidence giữ từ commit `6eabcc2`.
- **Mistakes, fixes, and new questions:** Cần củng cố classpath + binary/FQCN lookup, phân biệt với source file path.
- **Theory/coding changes:** CORE-01 theory L0 -> L1 theo Teacher Feedback; coding giữ L1. Không nâng L2.
- **Next session action:** Tiếp tục G2 và lồng ghép một recall/experiment package-classpath-main.

## 2026-11-01 / CONSOLE-G2A-007 (ASSIGNED)

- **Objective and concepts:** Menu tĩnh, Scanner/System.in, String local variable, try-with-resources; chưa control flow.
- **IBM course(s), question UIDs:** IBM 2; `java-086` mapped/unreviewed, không dùng answer_raw.
- **Learner theory answers:** Chưa trả lời prediction `hello` và FQCN reinforcement.
- **Learner-authored code / AI-authored code:** Chưa sửa Java; Codex chỉ viết exercise/acceptance/hints 1–2.
- **Files changed and reason:** Thêm `docs/learning/exercises/G2A_CONSOLE_INPUT.md`; cập nhật handoff/session.
- **Commands actually executed and results:** Chưa chạy build mới vì source G2-A chưa được viết; G1 vẫn là baseline pass tại `6eabcc2`.
- **Mistakes, fixes, and new questions:** Không có; chờ learner attempt. Hint 3 chưa dùng.
- **Theory/coding changes:** Không đổi level khi mới giao bài.
- **Next session action:** Người học sửa một file theo acceptance; Codex review diff và chạy hai input cases.

## 2026-11-01 / PROCESS-GATE-008 (CORRECTION)

- **Objective:** Sửa hygiene của exercise checkpoint G2-A.
- **Evidence:** `git diff --cached --check` đã báo `new blank line at EOF`, nhưng command ghép tiếp tục chạy commit `434c903` thay vì dừng.
- **Correction:** Xóa dòng trống thừa; từ gate sau dùng điều kiện chặn commit khi diff check khác 0.
- **Learning levels:** Không thay đổi; đây là lỗi quy trình của Codex, không phải lỗi learner.

## 2026-11-01 / THEORY-FEEDBACK-009 (RECONCILED)

- **Input snapshot:** Teacher Feedback tham chiếu checkpoint `6eabcc2`, xác nhận G1 kỹ thuật và yêu cầu giữ CORE-01 theory L0 cho tới khi có kiểm tra trực tiếp.
- **Accepted guidance:** Giữ G1 `TECHNICALLY_COMPLETE`, Coding L1, greenfield roadmap, learner-first coding, tách theory/coding evidence, không tin raw question-bank answers và không tự triển khai phase chưa tới.
- **Chronology conflict:** Feedback này thuộc snapshot trước `THEORY-CORE01-006`, nơi câu trả lời trực tiếp đã được đánh giá và CORE-01 theory được nâng L0 -> L1 tại commit `627764a`.
- **Resolution:** Không downgrade theory L1. Giữ ghi chú misconception FQCN/file path và yêu cầu evidence độc lập trước L2. `java-055` vẫn `unreviewed`.
- **Source/build changes:** Không sửa Java; không chạy lại build/test vì G1 technical evidence không thay đổi.
- **Next session action:** G2-A vẫn `ASSIGNED`; chờ learner prediction và code attempt.

## 2026-11-02 / HYBRID-ROADMAP-010 (APPROVED_AND_SYNCED)

- **Objective and concepts:** Tiếp nhận ChatGPT review và tích hợp roadmap 7 ngày, Office Study Mode, Home Coding Mode, ba trục tiến độ và Git checkpoint workflow; không sửa Java source.
- **IBM course(s), question UIDs:** Giữ đủ IBM 1–14 và 386 UID trong scope. Các dải UID theo ngày chỉ là coverage target; `java-055`/`java-086` vẫn `unreviewed`, không dùng `answer_raw`.
- **Learner theory answers:** Không có bài kiểm tra mới; đây là quyết định phối hợp, không phải evidence mastery.
- **Learner-authored code / AI-authored code:** Không có Java code mới. Codex chỉ cập nhật tài liệu theo review được người học chuyển giao.
- **Files changed and reason:** `AGENTS.md`, `START_HERE.md`, `PROGRESS.md`, `LESSON_PROTOCOL.md`, `ROADMAP.md`, `G2A_CONSOLE_INPUT.md`, `HANDOFF.md`, `SESSION_LOG.md` và file review để đồng bộ hai learning mode, roadmap và standard-input lifecycle.
- **Commands actually executed and results:** Đọc source-of-truth learning docs, kiểm tra Git status/log và xác nhận private question bank tiếp tục bị `.gitignore` chặn. Chưa compile/run vì source Java không đổi.
- **Mistakes, fixes, and new questions:** Làm rõ `Scanner.close()` cũng đóng `System.in`; G2-A đóng ở cuối chương trình, G2-B/C tái sử dụng một scanner. Day 1 vẫn chưa bắt đầu vì người học chưa xác nhận.
- **Theory/coding changes:** Không đổi level. CORE-01 giữ L1/L1; CORE-02/CORE-03 giữ L0/L0.
- **Next session action:** Chờ learner trả lời ba prediction và tự code G2-A. Sau phiên thực hành, cung cấp prerequisite G2-B cho Office Study Mode.

## 2026-11-02 / ROADMAP-ORDER-011 (TEACHER_REVIEW_SYNC)

- **Objective and concepts:** Tiếp nhận Teacher Review phê duyệt G2-A/hybrid modes và sửa mâu thuẫn thứ tự Maven/JUnit trong roadmap; không sửa Java source.
- **IBM course(s), question UIDs:** Giữ toàn bộ IBM 1–14 và 386 UID; không dùng câu hỏi hoặc đáp án mới trong phiên tài liệu này.
- **Learner theory answers:** Không có evidence mới. CORE-01 giữ Theory L1/Coding L1; các level khác không đổi.
- **Learner-authored code / AI-authored code:** Không có Java code mới; Codex chỉ đồng bộ tài liệu.
- **Files changed and reason:** `ROADMAP.md`, `CHATGPT_ROADMAP_REVIEW.md`, `DECISIONS.md`, `HANDOFF.md`, `SESSION_LOG.md` để thống nhất G3 domain → G4 Maven/JUnit → G5 resource/crew → G6 simulation → G7 file persistence.
- **Commands actually executed and results:** Dùng `rg` rà các tham chiếu G3–G8, Maven, JUnit, simulation và persistence. Chưa compile/run/test Java vì source không đổi.
- **Mistakes, fixes, and new questions:** Mâu thuẫn cũ đặt Maven/JUnit ở G7 sau simulation/persistence đã được sửa; không xóa capability nào khỏi roadmap.
- **Theory/coding changes:** Không đổi level và không đánh dấu feature mới hoàn thành.
- **Next session action:** G2-A tiếp tục `ASSIGNED`; chờ learner attempt. Khi G2-A kết thúc, tạo handoff và prerequisite G2-B.

## 2026-11-02 / THEORY-G2A-012 (TEACHER_FEEDBACK_SYNC)

- **Objective and concepts:** Đồng bộ G2-A theory preparation về object/reference, String/StringBuilder, Scanner/input, exception, try-with-resources, `parseInt()` và import; chưa bắt đầu coding.
- **IBM course(s), question UIDs:** IBM 2; `java-086` vẫn là mapping `unreviewed`, feedback không fact-check hoặc sử dụng `answer_raw`.
- **Learner theory answers:** Dự đoán đúng việc hai reference trỏ tới object khác nhau; phân biệt String/StringBuilder sau sửa sai; phân biệt `scanner.close()` với `scanner = null`; dự đoán đúng resource đóng trước `catch`; hiểu `parseInt()` trả `int` và không đổi String gốc. Nhận biết import cơ bản nhưng cần củng cố import không tải library và FQCN có thể thay thế.
- **Learner-authored code / AI-authored code:** Không có code mới; source checkpoint được review vẫn là `6eabcc2`.
- **Files changed and reason:** Chỉ `PROGRESS.md` và append `SESSION_LOG.md`; theo yêu cầu chưa tạo handoff mới trước khi kết thúc buổi G2-A.
- **Commands actually executed and results:** Không compile/run/test vì Java source chưa đổi và learner chưa attempt G2-A.
- **Mistakes, fixes, and new questions:** Tiếp tục củng cố reference khác object; `close()` khác `null`; mutability khác scope/lifecycle; import khác tải library; String concatenation khác phép cộng số.
- **Theory/coding changes:** CORE-01 giữ L1/L1. CORE-02 theory L0 → L2, coding giữ L0. Tách JAVA-04A exception/try-with-resources và ghi theory L2/coding L0; JAVA-04B validation/file I/O giữ L0/L0. Scanner/input ghi coverage đã tiếp cận nhưng CORE-03 giữ L0/L0 vì chưa có level recommendation hoặc coding evidence.
- **Next session action:** Người học tự code G2-A trước. Codex review learner diff, ghi hint level và chạy acceptance với input `2` và `hello`; chỉ tạo handoff mới sau khi buổi thực hành kết thúc.

## 2026-11-02 / CONSOLE-G2A-013 (SCAFFOLD_CHECKPOINT)

- **Objective and concepts:** Thêm helper comments nhắc syntax và String literal copy-ready để giảm thao tác gõ trong G2-A; chưa triển khai hành vi G2-A.
- **IBM course(s), question UIDs:** IBM 2; không dùng câu hỏi hoặc `answer_raw` mới.
- **Learner theory answers:** Không có câu trả lời mới trong bước scaffold.
- **Learner-authored code / AI-authored code:** Codex thêm `import java.util.Scanner` và toàn bộ helper comments. Đây là Hint 3/AI-authored scaffold, không phải learner implementation.
- **Files changed and reason:** `EchoesOfMarsApplication.java` thêm scaffold không chạy; exercise/progress/session records ghi đúng hint level. Không sửa `HANDOFF.md` trước khi kết thúc G2-A.
- **Commands actually executed and results:** JDK 21 `javac --release 21` exit 0; Java run exit 0 và vẫn in đúng baseline `Echoes of Mars Learning Lab`; `git diff --check` pass. Chưa chạy G2-A acceptance vì learner implementation chưa tồn tại.
- **Mistakes, fixes, and new questions:** Helper nhấn mạnh import không tải library, reference khác object, `Scanner.close()` đóng `System.in`, `nextLine()` trả String và `+` nối String.
- **Theory/coding changes:** Không đổi level; chưa có learner-authored coding evidence.
- **Next session action:** Người học chuyển phần cần thiết từ comment thành code chạy thật; Codex sau đó review diff và chạy input `2`/`hello`.

## 2026-11-02 / CONSOLE-G2A-014 (TECHNICALLY_COMPLETE)

- **Objective and concepts:** Hoàn thành G2-A menu tĩnh, Scanner/System.in, local String, `nextLine()`, try-with-resources và String concatenation.
- **IBM course(s), question UIDs:** IBM 2; `java-086` vẫn mapped/unreviewed, không dùng `answer_raw` làm lời giải.
- **Learner theory answers:** Không có theory assessment mới trong buổi coding; dùng lại Teacher Feedback G2-A preparation.
- **Learner-authored code / AI-authored code:** Người học tự chuyển scaffold thành executable menu/input và tự sửa dòng cuối để nối `choice`. Codex đã cung cấp Hint 3 scaffold, dọn indentation/comment và đưa targeted helper sau lần test đầu thất bại.
- **Files changed and reason:** `EchoesOfMarsApplication.java` triển khai G2-A; learning records ghi evidence; thêm `G2B_PREREQUISITES.md` cho Office Study Mode.
- **Commands actually executed and results:** JDK 21 `javac --release 21` exit 0. Input `2`: run exit 0, exact output true. Input `hello`: run exit 0, exact output true. `git diff --check` pass.
- **Mistakes, fixes, and new questions:** Lần đầu người học in `"You selected: "` nhưng chưa dùng `choice`; sau comment gợi ý cú pháp chung, người học tự sửa bằng String concatenation. Cần kiểm tra transfer sau này để biết có tự viết lại không cần scaffold hay không.
- **Theory/coding changes:** Theory giữ nguyên. CORE-02 coding L0 → L1; CORE-03A Scanner/input coding L1; JAVA-04A coding L0 → L1. CORE-03B control flow giữ L0/L0.
- **Git evidence:** `8285d47 feat: complete G2-A console input`.
- **Next session action:** G2-B theory preparation về `parseInt`, `int`, `switch`, `case/default` và parse failure; chưa sửa Java cho G2-B.

## 2026-11-02 / CONSOLE-G2B-015 (SCAFFOLD_ASSIGNED)

- **Objective and concepts:** Chuẩn bị G2-B parse String thành `int`, arrow-style switch/default và xử lý `NumberFormatException` một lần; chưa có menu loop.
- **IBM course(s), question UIDs:** IBM 2; `java-097` và `java-065` mapped/unreviewed, không dùng `answer_raw` làm lời giải. `java-065` chỉ là extension nâng cao, không thay basic switch.
- **Learner theory answers:** Chưa có prediction G2-B trong phiên scaffold.
- **Learner-authored code / AI-authored code:** Codex thêm toàn bộ helper comments, syntax scaffold, copy-ready strings và exercise. Chưa có learner implementation; Hint 3 đã dùng theo yêu cầu.
- **Files changed and reason:** `EchoesOfMarsApplication.java` chỉ thêm comment không chạy; thêm `G2B_SWITCH_SELECTION.md`; cập nhật prerequisite/progress/session records. Chưa tạo handoff mới khi G2-B chưa kết thúc.
- **Commands actually executed and results:** JDK 21 compile exit 0; G2-A regression input `2` run exit 0/exact true; input `hello` run exit 0/exact true; `git diff --check` pass. Chưa chạy G2-B acceptance vì chưa có implementation.
- **Mistakes, fixes, and new questions:** Cần phân biệt số ngoài menu (`default`) với String không parse được (`catch`), và arrow label với colon label/fall-through.
- **Theory/coding changes:** Không đổi level; scaffold AI không phải coding evidence.
- **Next session action:** Người học trả lời bốn prediction, chuyển helper cần thiết thành code thật, rồi yêu cầu Codex review bốn acceptance cases.

## 2026-11-02 / CONSOLE-G2B-016 (TECHNICALLY_COMPLETE)

- **Objective and concepts:** Hoàn thành parse, `switch`, `default` và `NumberFormatException` cho một lần input.
- **IBM course(s), question UIDs:** IBM 2; `java-097`/`java-065` mapped/unreviewed, không dùng answer_raw.
- **Learner theory answers:** Chưa có theory assessment mới.
- **Learner-authored code / AI-authored code:** Người học viết implementation từ Hint 3 scaffold và tự sửa brace placement/catch syntax sau compiler feedback. Codex chỉ review/test và xóa helper comment đã hoàn tất.
- **Files changed and reason:** Source G2-B; `G2B_SWITCH_SELECTION.md`, `PROGRESS.md`, `HANDOFF.md`, `SESSION_LOG.md` ghi completion evidence và G2-C handoff.
- **Commands actually executed and results:** JDK 21 `javac --release 21` exit 0; full exact output pass cho input 1/2/9/hello; `git diff --check` pass.
- **Mistakes, fixes, and new questions:** Lần đầu `catch` sai do thiếu brace và exception declaration; người học sửa thành cấu trúc hợp lệ sau phản hồi compiler.
- **Theory/coding changes:** CORE-03B coding L0 → L1; theory giữ L0. Không thay đổi các theory levels khác.
- **Git evidence:** `850f5d3 feat: complete G2-B switch selection`.
- **Next session action:** Chuẩn bị prerequisites G2-C về loop, termination, retry, invalid-input flow và Scanner lifecycle; Challenge Day 1 chưa bắt đầu nếu chưa được người học xác nhận.
