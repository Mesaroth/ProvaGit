package it.almaviva.esempio.springesempio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class SpringEsempioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEsempioApplication.class, args);
		System.out.println("Sono qui");
	}

}
