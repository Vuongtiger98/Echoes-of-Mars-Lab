# Echoes of Mars Learning Lab

Echoes of Mars Learning Lab là dự án Java xuyên suốt dùng để học và thực hành toàn bộ lộ trình IBM Java Developer Professional Certificate. Dự án bắt đầu từ console Java thuần, sau đó phát triển dần tới simulation engine, persistence, Spring Boot, database, testing, deployment và AI.

## Trạng thái hiện tại

- Canonical folder: `D:\Documents\Echoes of Mars Lab`
- Giai đoạn: G0 — khởi tạo repository và learning governance
- Java source: chưa tạo
- Java được cài: JDK/Javac 25.0.3
- Target release đã chọn: Java 21 LTS
- Package gốc đã chọn: `com.echoesofmars.lab`

## Nguyên tắc

- Phát triển bằng vertical slice nhỏ có hành vi kiểm chứng được.
- Không coi code do AI viết là bằng chứng người học tự lập trình.
- Không ghi build/test thành công nếu chưa chạy lệnh thực tế.
- Giữ toàn bộ 14 học phần IBM và 386 câu hỏi trong backlog.
- Không commit ngân hàng câu hỏi private, secrets hoặc audit exports có nội dung hạn chế.

## Bắt đầu đọc

1. `AGENTS.md`
2. `docs/learning/START_HERE.md`
3. `docs/learning/HANDOFF.md`
4. `docs/learning/ROADMAP.md`
5. `docs/learning/PROGRESS.md`

## Build

G1 starter có thể compile bằng raw `javac`. Chạy các lệnh sau tại project root:

```powershell
New-Item -ItemType Directory -Force out
javac --release 21 -encoding UTF-8 -d out src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java
java -cp out com.echoesofmars.lab.EchoesOfMarsApplication
```

G1 chỉ hoàn thành khi output là đúng một dòng `Echoes of Mars Learning Lab`. Starter hiện còn `TODO` để người học tự viết.
