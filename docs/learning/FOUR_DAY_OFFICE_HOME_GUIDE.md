# Four Day Office Study / Home Coding Guide

**Phạm vi:** Days 1–4 của roadmap đã duyệt. Day 1 bắt đầu ngày 2026-11-03; lịch này không khẳng định ngày nào đã hoàn thành.

**Mục đích:** Có thể học lý thuyết thành các phiên ngắn tại công ty và code trong khoảng thời gian rảnh ở nhà.

**Phạm vi chương trình:** Giữ nguyên IBM Courses 1–14 và toàn bộ 386 UID; các UID theo ngày là mục tiêu coverage, không mặc nhiên verified hoặc mastered.

## Cách dùng linh hoạt

Mỗi ngày chia thành ba loại việc:

- **10–15 phút:** một concept, một ví dụ nhỏ, một câu prediction.
- **20–30 phút:** recall không nhìn tài liệu, trace code hoặc fact-check một UID.
- **Coding lúc rảnh:** hoàn thành một TODO nhỏ có thể dừng ở giữa; chỉ Codex xác nhận technical gate sau khi chạy lệnh.

Không cần hoàn thành mọi mục trong một ngày calendar. Nếu thời gian ngắn, làm TODO ưu tiên 1; các mục còn lại vẫn nằm trong scope và chuyển tiếp nguyên trạng. Không gộp theory coverage, theory level và coding level.

## Lịch bốn ngày

| Challenge day | Office Study Mode | Home Coding Mode | Exercise |
|---|---|---|---|
| Day 1 | IBM 1, 2, 6; Java Core `001–040`; FQCN/classpath, input, flow, Git | G2-C menu loop, recall G1/G2-A/B, Git status/diff reading | [DAY1_EXERCISES.md](exercises/DAY1_EXERCISES.md) |
| Day 2 | IBM 3–4; Java Core `041–080`; OOP, constructors, encapsulation, collection preview; JUnit concepts | G3 Mission domain slice → G4 Maven/JUnit checkpoint → begin G5 resource/crew | [DAY2_EXERCISES.md](exercises/DAY2_EXERCISES.md) |
| Day 3 | IBM 4, 10; Java Core `081–121`; Backend `001–015`; I/O, testing, JVM/concurrency overview | Complete resource/crew tests → deterministic simulation → small file save/load | [DAY3_EXERCISES.md](exercises/DAY3_EXERCISES.md) |
| Day 4 | IBM 5, 7; Backend `016–060`; HTTP, REST, Spring, web UI fundamentals | Spring REST adapter reusing existing domain/application; minimal dashboard only if core API gate passes | [DAY4_EXERCISES.md](exercises/DAY4_EXERCISES.md) |

## Rules for the teacher handoff

At work, ChatGPT/Copilot can return `TEACHER_FEEDBACK` with the exact concept, UID and status, learner answer evidence, theory level recommendation, and one small evening task. At home, Codex reads that feedback, asks for a prediction, lets the learner implement, then runs the stated acceptance gate.

For long days, stop at the named checkpoint in that day's exercise and carry unfinished tasks forward. Do not mark a day or IBM course complete from reading or exposure alone.

## Current state

- Day 1 has started; G2-A/G2-B are technically complete.
- G2-C TODO comments are present in `EchoesOfMarsApplication.java`; no G2-C learner implementation is recorded.
- Day 2–4 exercises are plans, not implementation evidence.
- Do not add TODO comments to classes that do not yet exist. Add code comments when a learner begins the corresponding vertical slice.
