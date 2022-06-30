package com.enit.demo;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.enit.demo.dao.candidatRepository;
import com.enit.demo.entities.Candidat;
import com.enit.demo.services.StorageService;






@SpringBootApplication

public class DemoApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


   /* @Bean
    public CommandLineRunner start(candidatRepository candidatRepository) {
        return args -> {
        	candidatRepository.deleteAll();
            Stream.of("jihen_charfi charfi jihen.charfi@etudiant-enit.utm.tn ji123456 tunisie 13015413 55822159 jihen").forEach(c -> {
                candidatRepository.save(new Candidat(c.split(" ")[0],c.split(" ")[1],c.split(" ")[2],c.split(" ")[3],c.split(" ")[4],Integer.parseInt(c.split(" ")[5]), Integer.parseInt(c.split(" ")[6]), c.split(" ")[7], 256915, false));
            });

            candidatRepository.findAll().forEach(System.out::println);
        };
    }*/
    
   
}



