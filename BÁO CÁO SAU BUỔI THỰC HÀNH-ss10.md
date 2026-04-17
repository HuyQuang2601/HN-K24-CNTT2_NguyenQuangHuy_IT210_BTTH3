**BÁO CÁO SAU BUỔI THỰC HÀNH**

**Môn học:** Java Web (Spring MVC + Thymeleaf)  
**Tên buổi thực hành:** Mini-project -- Quản lý Mượn/Trả Thiết bị IT & Phòng Lab  
**Thời gian thực hành:** 180 phút  
**Họ và tên sinh viên:** Nguyễn Quang Huy 
**Mã sinh viên:** PTIT-HN-067
**Lớp:** HN-KS24-CNTT2  **Nhóm:** 1

**I. NỘI DUNG ĐÃ THỰC HÀNH**

**1. Trình bày các giải pháp**

Trong buổi thực hành, em đã xây dựng hệ thống **Quản lý Mượn/Trả Thiết bị IT & Phòng Lab** sử dụng **Spring MVC thuần kết hợp Thymeleaf và Hibernate Validator**.

Hệ thống giúp:

- Sinh viên xem danh sách thiết bị/phòng Lab

- Đăng ký mượn thiết bị hoặc sử dụng phòng Lab

- Quản lý Lab theo dõi các yêu cầu mượn

**Giải pháp tổng thể**

Hệ thống được thiết kế theo mô hình **MVC**:

- **Model**: Đại diện dữ liệu (Device, LabRoom, BorrowRequest)

- **View**: Giao diện Thymeleaf

- **Controller**: Xử lý request và điều hướng

**Các giải pháp kỹ thuật áp dụng**

- Sử dụng **Spring Web MVC (cấu hình thủ công)**

- Tích hợp **Thymeleaf Template Engine**

- Áp dụng **Data Binding (@ModelAttribute)**

- Sử dụng **Hibernate Validator (JSR-380)** để validate dữ liệu

- Áp dụng **PRG Pattern + RedirectAttributes**

- Sử dụng **Thymeleaf Fragment** để tái sử dụng layout

- Áp dụng validation logic nâng cao (ngày, số lượng)

**2. Liệt kê các câu hỏi từ nhóm khác và câu hỏi phản biện**

- Vì sao cần dùng Hibernate Validator?  
  (Để validate dữ liệu phía server một cách chuẩn và an toàn.)

- Data Binding giúp gì trong form?  
  (Giúp ánh xạ dữ liệu từ form vào object Java tự động.)

- Vì sao phải dùng PRG Pattern?  
  (Tránh submit lại form khi người dùng refresh trang.)

- Tại sao phải validate ngày mượn/trả?  
  (Để đảm bảo tính logic và tránh dữ liệu sai.)

- Nếu không xử lý lỗi đúng thì sao?  
  (Người dùng sẽ gặp lỗi trắng trang và trải nghiệm kém.)

**3. Thực hành triển khai code**

**a. Các nội dung lập trình đã sử dụng**

- Spring MVC (Controller, Model, View)

- Thymeleaf (Fragment, Form Binding)

- Hibernate Validator (@NotNull, @Email, @Pattern, @Future)

- Data Binding (@ModelAttribute)

- RedirectAttributes (Flash message)

- Java Collections (List)

**b. Cấu trúc chương trình gồm**

- **Model**

    - Device

    - LabRoom

    - BorrowRequest

- **Repository**

    - DeviceRepository

    - BorrowRepository

- **Service**

    - BorrowService

- **Controller**

    - DeviceController

    - BorrowController

- **View (Thymeleaf)**

    - layout.html (Fragment)

    - device-list.html

    - borrow-form.html

    - admin-request-list.html

**c. Thao tác với hệ thống**

- Hiển thị danh sách thiết bị/phòng Lab

- Mở form đăng ký mượn

- Nhập thông tin sinh viên

- Validate dữ liệu đầu vào

- Gửi yêu cầu mượn

- Hiển thị thông báo thành công

- Admin xem danh sách yêu cầu

**II. CÔNG VIỆC CÁC EM ĐÃ LÀM**

**1. Công việc cá nhân**

- Phân tích yêu cầu từ SRS

- Thiết kế model dữ liệu

- Xây dựng form Thymeleaf

- Áp dụng Hibernate Validator

- Viết Controller xử lý form

- Xử lý logic ngày và số lượng

- Debug lỗi binding và validation

**2. Công việc nhóm**

- Thảo luận cấu trúc hệ thống

- Phân chia phần giao diện và logic

- Kiểm tra validate dữ liệu

- Test các trường hợp lỗi

- Góp ý cải thiện UI

**III. KẾT QUẢ CÁC EM ĐẠT ĐƯỢC**

Sau buổi thực hành, em đã:

1.  Hiểu rõ cách xây dựng ứng dụng Spring MVC thuần

2.  Biết sử dụng Thymeleaf để tạo form động

3.  Áp dụng thành công Hibernate Validator

4.  Xử lý được các ràng buộc dữ liệu phức tạp

5.  Hiểu cách binding dữ liệu form → object

6.  Xây dựng hệ thống đăng ký mượn hoàn chỉnh

**IV. KHÓ KHĂN VÀ VẤN ĐỀ CÁC EM GẶP PHẢI**

**1. Các khó khăn**

1.  Lỗi binding dữ liệu từ form

2.  Lỗi validation không hiển thị

3.  Khó xử lý logic ngày (so sánh thời gian)

4.  Lỗi khi redirect mất dữ liệu

5.  Lỗi định dạng dữ liệu (email, mã SV)

**2. Cách khắc phục**

- Kiểm tra @ModelAttribute và BindingResult

- Sử dụng đúng th:errors trong Thymeleaf

- Dùng LocalDate để xử lý ngày

- Áp dụng RedirectAttributes

- Viết regex đúng cho validate

**V. KINH NGHIỆM RÚT RA**

**1. Kinh nghiệm từ bài thực hành**

- Luôn validate dữ liệu phía server

- Tách rõ Controller và Service

- Không viết logic trong View

- Test từng trường hợp nhập liệu

- Sử dụng Fragment để tái sử dụng giao diện

**2. Lưu ý cho các buổi thực hành sau**

- Viết form rõ ràng, dễ sử dụng

- Kiểm tra lỗi đầy đủ

- Đặt tên biến và class chuẩn

- Tối ưu trải nghiệm người dùng

- Backup code thường xuyên

**VI. ĐỀ XUẤT / KIẾN NGHỊ**

Em đề xuất giảng viên:

- Bổ sung bài tập tích hợp **Database (JDBC/JPA)**

- Hướng dẫn thêm về **Spring Security (phân quyền)**

- Cho thêm bài tập về **REST API**

**VII. KẾT LUẬN**

Qua buổi thực hành mini-project **Quản lý Mượn/Trả Thiết bị IT & Phòng Lab**, em đã nắm vững:

- Kiến trúc Spring MVC

- Xử lý form và validation

- Sử dụng Thymeleaf hiệu quả

- Áp dụng logic nghiệp vụ thực tế

Buổi thực hành giúp em hiểu rõ quy trình xây dựng một hệ thống web hoàn chỉnh, từ giao diện đến xử lý dữ liệu và validation, tạo nền tảng vững chắc cho các dự án thực tế sau này.