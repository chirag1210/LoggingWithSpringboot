package in.chirag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAwsDemoApplication {
	static Logger logger = LoggerFactory.getLogger(SpringAwsDemoApplication.class);

	public static void main(String[] args) {
		logger.info("===> main method started");
		SpringApplication.run(SpringAwsDemoApplication.class, args);
		logger.info("===> main method executed");
	}

}
