
public class Iterador {
	private Dinheiro[] dinheiro;
	private int nextIndex;

	public Iterador(Dinheiro[] dinheiro) {
		this.dinheiro = dinheiro;
		nextIndex = 0;
	}

	public boolean hasNext() {
		return nextIndex < dinheiro.length;
	}

	public Dinheiro Next() {
		return dinheiro[nextIndex++];
	}
}
