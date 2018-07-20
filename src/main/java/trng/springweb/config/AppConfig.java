package trng.springweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"trng.springcore.dao, trng.springcore.service, trng.springcore.pojo, trng.springcore.utils, trng.springcore.bean, trng.springcore.customer_s_core"})
public class AppConfig {

	
}
