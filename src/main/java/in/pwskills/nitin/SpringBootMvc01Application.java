package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "in.pwskills.nitin")
public class SpringBootMvc01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc01Application.class, args);
	}

}
