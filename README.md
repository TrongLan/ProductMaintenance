# ProductMaintenance
Bài tập thực hành số 2 môn lập trình Web tại PTIT

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
