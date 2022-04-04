package entities;

import java.util.stream.IntStream;

public class Multiplos {

	public int numero;

	public int calculamultiplos() {

		numero = IntStream.range(1, 10).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();
		System.out.print("Soma dos multiplos: " + numero);

		return numero;
	}

}
