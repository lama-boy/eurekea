package msa.prj.eurekeaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekeaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekeaserverApplication.class, args);
	}

}
