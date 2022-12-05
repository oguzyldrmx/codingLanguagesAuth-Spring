package kodlama.io.codingLanguages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.codingLanguages.business.concretes.LanguageManager;

@SpringBootApplication
public class CodingLanguagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingLanguagesApplication.class, args);
	}

}
