package javaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SoftToolsApplication {

	@GetMapping("/")
	public String home() {
		return "Hi";
	}
	public static void main(String[] args) {
		SpringApplication.run(SoftToolsApplication.class, args);
	}

}
