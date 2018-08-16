package tk.sample.tkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "tk.sample.tkdemo.mapper")
public class TkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkDemoApplication.class, args);
	}
}
