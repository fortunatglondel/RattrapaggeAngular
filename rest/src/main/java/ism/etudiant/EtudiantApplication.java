package ism.etudiant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import ism.etudiant.entities.*;
import ism.etudiant.repositories.*;


import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class EtudiantApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
		

	}



}
