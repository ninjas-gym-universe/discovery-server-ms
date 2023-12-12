package by.ninjas.gymuniverse.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Entry point to the application.
 *
 * @author Artyom Drobysh (artyom.drobysh96@gmail.com)
 * @version 0.1.0
 * @since 0.1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerMsApplication.class, args);
	}
}
