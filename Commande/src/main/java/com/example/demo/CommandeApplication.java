package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class CommandeApplication  {
	/* private RepositoryRestConfiguration restcon; */
g	public static void main(String[] args) {
		
	/*	restcon.exposeIdsFor(Commande.class);*/
		SpringApplication.run(CommandeApplication.class, args);
	}

	

}
