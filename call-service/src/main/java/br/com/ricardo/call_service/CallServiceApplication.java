package br.com.ricardo.call_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CallServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallServiceApplication.class, args);
	}

}

@RestController
@RequestMapping("call")
class CallController {

	@GetMapping()
	public String sentCall() {
		return "Call start";
	}
}
