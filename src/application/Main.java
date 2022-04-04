package application;

import java.util.Scanner;

import entities.Fatorial;
import entities.Multiplos;
import entities.Votos;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Exercício 1: ");

		Votos votos = new Votos();
		votos.calculaPercentualValido();
		votos.calculaPercentualBranco();
		votos.calculaPercentualNulo();

		System.out.println(" ");

		System.out.println("Exercício 3: ");
		
		Fatorial fatorial = new Fatorial();
		System.out.println("Digite um número: ");
		fatorial.numero = s.nextInt();
		fatorial.calculaFatorial();
		
		
		System.out.println(" ");

		System.out.println("Exercício 4: ");
		
		Multiplos multiplos = new Multiplos();
		System.out.println("Digite um número: ");
		multiplos.numero = s.nextInt();
		multiplos.calculamultiplos();
		

	}

}
