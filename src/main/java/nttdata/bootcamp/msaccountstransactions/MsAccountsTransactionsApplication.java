package nttdata.bootcamp.msaccountstransactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsAccountsTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAccountsTransactionsApplication.class, args);
	}

}
