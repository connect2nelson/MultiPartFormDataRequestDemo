package fun.abm.com.MultiPartFormDataRequestCreaterClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultiPartFormDataRequestCreaterClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiPartFormDataRequestCreaterClientApplication.class, args);
	}

	@Autowired
	private MultipPartFormDataRequestCreaterClientRunner runner;


	@Bean
	public CommandLineRunner createCommandLineRunnerForRequester(){
		return args -> {
			runner.postMultiFormDataToLocalhost();
		};
	}

}
