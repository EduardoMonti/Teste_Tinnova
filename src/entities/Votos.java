package entities;

public class Votos {

	private double totalEleitores = 1000;
	private double votosValidos = 800;
	private double votosBrancos = 150;
	private double votosNulos = 50;

	public Votos() {
	}

	public double getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(double totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	public double getVotosValidos() {
		return votosValidos;
	}

	public void setVotosValidos(double votosValidos) {
		this.votosValidos = votosValidos;
	}

	public double getVotosBrancos() {
		return votosBrancos;
	}

	public void setVotosBrancos(double votosBrancos) {
		this.votosBrancos = votosBrancos;
	}

	public double getVotosNulos() {
		return votosNulos;
	}

	public void setVotosNulos(double votosNulos) {
		this.votosNulos = votosNulos;
	}

	// Calculando percentual de votos validos
	public double calculaPercentualValido() {

		double valido = ((votosValidos / totalEleitores) * 100);

		System.out.println("Percentual de votos válidos: " + valido + "%");
		return valido;
	}

	// Calculando percentual de votos em branco
	public double calculaPercentualBranco() {

		double branco = (votosBrancos / totalEleitores) * 100;

		System.out.println("Percentual de votos brancos: " + branco + "%");
		return branco;
	}

	// Calculando percentual de votos nulos
	public double calculaPercentualNulo() {

		double nulos = (votosNulos / totalEleitores) * 100;

		System.out.println("Percentual de votos nulos: " + nulos + "%");
		return nulos;
	}

}
