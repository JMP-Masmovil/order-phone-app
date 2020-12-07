package es.masmovil.phone.app.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("es.masmovil")
public class AppPhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppPhoneApplication.class, args);
	}

}
