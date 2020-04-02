import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.flight.service.FlightService;
import com.infosys.flight.service.FlightServiceImpl;

@Configuration
public class AppConfig {

	
	@Bean
	public FlightServiceImpl flightServiceImpl() {
		return new FlightServiceImpl();
	}

}
