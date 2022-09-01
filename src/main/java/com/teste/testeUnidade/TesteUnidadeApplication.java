package com.teste.testeUnidade;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteUnidadeApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu cpf");

		String cpf = scan.nextLine();
		// criar uma classe para validaçao

		System.out.println("O cpf digitado é: " + (ValidadorCpf.validar(cpf) ? "Válido" : "Invalido"));

	}

}
