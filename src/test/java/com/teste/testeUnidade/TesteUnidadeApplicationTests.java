package com.teste.testeUnidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteUnidadeApplicationTests {

	@Test
	void testantdoCpfValido() {
		var valido = ValidadorCpf.validar("491.928.530-21");
		// validar se o intem é verdadeiro ou facço
		assertEquals(true, valido);

	}
	
	@Test
	void testantdoCpfInvalido() {
		var invalido = ValidadorCpf.validar("491.928.530-1123");
		// validar se o intem é verdadeiro ou facço
		assertEquals(false, invalido);

	}

}
