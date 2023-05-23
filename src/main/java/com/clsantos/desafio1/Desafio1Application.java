package com.clsantos.desafio1;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.clsantos.desafio1.entities.Order;
import com.clsantos.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	private Integer code;
	private double basic;
	private double discount;


	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o código do produto");
		code = s.nextInt();

		System.out.println("Digite o valor básico");
		basic = s.nextDouble();

		System.out.println("Digite o valor percentual de desconto");
		discount = s.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f", code, orderService.total(order));
	}
}
