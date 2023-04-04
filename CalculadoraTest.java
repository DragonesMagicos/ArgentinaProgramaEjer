package exeption;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumaYdivTest() {
	
		double resultado=calculadora.div(calculadora.suma(150,180),3);
		assertEquals(resultado,110);
		
	}
	@Test
	void mulTest() {
	       double resultado=calculadora.mul(80, 3);
			assertEquals(resultado,240);

	}

	void restaYmulTest() {
		double resultado=calculadora.mul(calculadora.resta(90,50),15);
		assertFalse(resultado==605);

	}
	@Test
	void sumaYmulTest() {
		double resultado=calculadora.mul(calculadora.suma(70,40),25);
		assertFalse(resultado==2700);

	}

}
