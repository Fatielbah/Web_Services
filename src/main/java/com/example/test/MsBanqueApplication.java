/*package com.example.test;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entity.TypeCompte;
import com.example.repository.CompteRepository;
import com.example.entity.*;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableJpaRepositories(basePackages = "com.example.repository")
@EntityScan(basePackages = "com.example.entity")
public class MsBanqueApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsBanqueApplication.class, args);
}
@Bean
CommandLineRunner start (CompteRepository compteRepository){
	return args -> {
		compteRepository.save(new Compte(null, Math.random() *9000, new Date(), TypeCompte.EPARGNE));
		compteRepository. save(new Compte(null, Math.random()*9000, new Date(), TypeCompte. COURANT));
		compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE));
		compteRepository. findAll().forEach(c -> {
			System. out.println(c.toString());
		});

	};
  }
}*/

