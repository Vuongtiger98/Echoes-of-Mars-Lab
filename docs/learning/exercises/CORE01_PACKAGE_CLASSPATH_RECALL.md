# CORE-01 | Package, FQCN và classpath recall

## Mục tiêu

Củng cố khác biệt giữa package name, fully qualified class name (FQCN), đường dẫn file và classpath. Đây là recall exercise; không sửa Java source.

## Dữ liệu hiện tại

- Package: `com.echoesofmars.lab`
- Class: `EchoesOfMarsApplication`
- Compiled output root: `out`

## Prediction trước khi chạy

1. Viết FQCN đầy đủ của class.
2. `out` chỉ thư mục nào trong lệnh `java -cp out ...`?
3. Vì sao launcher không nhận `src/main/java/.../EchoesOfMarsApplication.java` ở vị trí tên class?
4. Nếu bỏ package khỏi tên launcher, Java sẽ tìm class ở đâu tương đối với classpath?

## Lệnh quan sát (Codex chạy sau prediction)

```powershell
javac --release 21 -encoding UTF-8 -d out src/main/java/com/echoesofmars/lab/EchoesOfMarsApplication.java
java -cp out com.echoesofmars.lab.EchoesOfMarsApplication
```

Sau đó thử lệnh sai có chủ đích chỉ khi người học dự đoán được kết quả:

```powershell
java -cp out EchoesOfMarsApplication
```

## Điều kiện đánh giá

Theory L2 chỉ cân nhắc nếu người học tự giải thích bằng lời riêng được vai trò classpath/FQCN và dự đoán đúng biến thể. Đây không phải coding evidence vì không có source do người học sửa trong exercise này.
