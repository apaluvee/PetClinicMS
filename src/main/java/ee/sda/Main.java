package ee.sda;


import ee.sda.db.DatabaseUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		DatabaseUtil.init();
		SpringApplication.run(Main.class, args);

	//	DatabaseUtil.shutdown();

	}

}
