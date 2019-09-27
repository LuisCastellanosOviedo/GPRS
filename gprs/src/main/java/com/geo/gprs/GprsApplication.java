package com.geo.gprs;

import com.geo.gprs.socketPoc.GreetServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GprsApplication implements CommandLineRunner {

	@Autowired
	private GreetServer greetServer;



	public static void main(String[] args) {
		SpringApplication.run(GprsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
			greetServer.start(9000);
	}
}
