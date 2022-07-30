package KevinDeArcoSegundaPreEntrega.entregable;

import KevinDeArcoSegundaPreEntrega.entregable.Service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntregableApplication  implements CommandLineRunner {

	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	public static void main(String[] args) {
		SpringApplication.run(EntregableApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
