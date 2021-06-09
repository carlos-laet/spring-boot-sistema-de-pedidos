package com.desenvcarlos.desenvback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desenvcarlos.desenvback.services.S3Service;

@SpringBootApplication
public class DesenvbackApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	
	public static void main(String[] args) {
		SpringApplication.run(DesenvbackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\Laet\\Pictures\\Camera Roll\\transferir.jpg");
	}

}
