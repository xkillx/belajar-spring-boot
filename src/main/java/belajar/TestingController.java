package belajar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
	
	@RequestMapping("/")
	public String hello() {
		return dummy();
	}

	private String dummy() {
		return "Hello World From Koplak";
	}
	
	@RequestMapping("/belajar")
	public String belajar(@RequestParam(defaultValue = "Azhar") String nama) {
		return "Hello " + nama;
	}
	
}
