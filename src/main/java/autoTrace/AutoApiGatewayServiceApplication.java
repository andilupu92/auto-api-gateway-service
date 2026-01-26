package autoTrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AutoApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoApiGatewayServiceApplication.class, args);
	}

}
