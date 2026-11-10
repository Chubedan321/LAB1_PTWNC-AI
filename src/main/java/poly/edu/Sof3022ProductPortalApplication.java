package poly.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sof3022ProductPortalApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(Sof3022ProductPortalApplication.class, args);
			// Khởi động ứng dụng Spring Boot, tạo ApplicationContext,
			// cấu hình ứng dụng và khởi động máy chủ web nhúng nếu có
			Runtime.getRuntime().exec(
					"cmd /c start chrome http://localhost:8080/home/index");
			// hỗ trợ mở trình duyệt
		} catch (Exception e) {
			e.printStackTrace();
		}
		SpringApplication.run(Sof3022ProductPortalApplication.class, args);
	}

}