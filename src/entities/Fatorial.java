package entities;

public class Fatorial {

	public int numero;
	public long fatorial = 1;

	public Fatorial() {
	}

	// Calculando o fatorial
	public int calculaFatorial() {

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
		return (int) fatorial;
	}

}
