# ProductMaintenance
Bài tập thực hành số 2 môn lập trình Web tại PTIT

# Mô tả cách làm
- Kết nối project với CSDL trên MySql
- Định nghĩa lớp đối tượng Product và ánh đến bảng trong CSDL
- Tạo repository để sử dụng spring data JPA
- Viết lớp controller
- Viết các trang view
- Chạy thử

# Phân chia công việc (Các thành viên: Đinh Trọng Lân, Vũ Minh Trí, Lê Văn Thanh)
- Đinh Trọng Lân: Tạo repository, controller.
- Lê Văn Thanh: Tạo lớp thực thể product, trang index và trang confirm delete
- Vũ Minh Trí: Viết trang update product và view product
- Tất cả thành viên đều chạy thử và chỉnh sửa

# Kết nối với csdl trong MySql
- Tạo một database mới với tên là productmaintenance
- Mở file application.properties và viết các dòng sau
    spring.datasource.url=jdbc:mysql://localhost/productmaintenance
    spring.datasource.username=root
    spring.datasource.password= (viết mật khẩu của mình vào)
    spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    spring.jpa.show-sql=true
    spring.jpa.hibernate.ddl-auto = update
