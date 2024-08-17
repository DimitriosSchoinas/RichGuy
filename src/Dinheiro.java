
public class Dinheiro {

	private int valor;
	private int peso;

	public Dinheiro(int valor) {
		this.valor = valor;
		if (valor == 1 || valor == 2) {
			peso = 5;
		} else {
			peso = 1;
		}
	}

	public int getValor() {
		return valor;
	}

	public int getPeso() {
		return peso;
	}
}
