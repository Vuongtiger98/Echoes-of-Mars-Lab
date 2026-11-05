# DAY 4 | REST boundary và web control panel

## Office Study Mode

### Học theo phiên ngắn

1. **IBM 5:** HTML/CSS/JavaScript căn bản, request/response trong browser.
2. **IBM 7:** HTTP method/status, REST resource, DTO, validation, dependency injection và error response.
3. **Backend `016–060`:** mục tiêu coverage theo roadmap. Mỗi UID được chọn cần fact-check; không coi đọc câu là đã hiểu.
4. **Architecture:** REST controller chuyển request thành application call; domain không phụ thuộc Spring hoặc HTTP.

### Recall prompts

- Vì sao controller không nên chứa toàn bộ mission rules?
- POST khác GET về hành vi và side effect thế nào?
- Validation lỗi nên được biểu diễn ra HTTP response ra sao?
- DTO khác domain object ở mục đích nào?
- Làm sao để console và REST dùng cùng use case?

## Home Coding Mode TODOs

### Prerequisite gate

- [ ] G3 domain behavior có acceptance tests.
- [ ] G4 Maven/JUnit build đã chạy thật.
- [ ] Application use case có thể gọi mà không đọc/ghi console trực tiếp.
- [ ] Nếu các gate này chưa đạt, làm design/pseudocode hoặc test seam trước; không dựng REST chỉ có controller rỗng.

### REST vertical slice

- [ ] Chọn một read endpoint để xem mission/habitat state.
- [ ] Chọn một write endpoint để gửi một mission action.
- [ ] Tạo request/response DTO; không expose trực tiếp entity persistence.
- [ ] Dùng validation cho input và error response có cấu trúc.
- [ ] Gọi application/domain qua dependency injection.
- [ ] Test success, not found/invalid input và domain rule failure.
- [ ] Chạy app và gọi endpoint bằng HTTP client; ghi command/status/body thực tế.

### Dashboard chỉ sau API gate

- [ ] Hiển thị state từ GET endpoint.
- [ ] Gửi action qua POST endpoint.
- [ ] Hiển thị loading/error state; không nhúng business rules vào browser.

**Gate:** REST dùng chung domain với console, test endpoint pass và có lệnh demo tái hiện được. Nếu prerequisite còn thiếu, ghi rõ phần dở dang; roadmap không bị cắt.
