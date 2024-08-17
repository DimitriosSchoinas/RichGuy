
public class Cofre {
	private Dinheiro[] dinheiro;
	private int pos = 0;
	private int num500 = 0;
	private int num200 = 0;
	private int num100 = 0;
	private int num50 = 0;
	private int num20 = 0;
	private int num10 = 0;
	private int num5 = 0;
	private int num2 = 0;
	private int num1 = 0;

	public Cofre(int numMoedasNotas) {
		dinheiro = new Dinheiro[numMoedasNotas];

	}

	public void addDinheiro(int valorDinheiro) {

		dinheiro[pos] = new Dinheiro(valorDinheiro);
		pos++;
	}

	public Iterador iterador() {
		return new Iterador(dinheiro);
	}

	public void ordenarPorValor() {

		for (int i = 0; i < dinheiro.length - 1; i++) {
			if (dinheiro[i].getValor() < dinheiro[i + 1].getValor()) {
				Dinheiro tmp = dinheiro[i];
				dinheiro[i] = dinheiro[i + 1];
				dinheiro[i + 1] = tmp;
				i = -1;
			}
		}
	}

	public int valorTotalDinheiro(int pesoMaximo) {
		int valorTotalDinheiro = 0;
		int pesoAtual = 0;
		if(dinheiro.length == 1) {
			if(pesoAtual + dinheiro[0].getPeso() <= pesoMaximo) {
			return  valorTotalDinheiro + dinheiro[0].getValor();
			}
		}

		for (int i = 0; i < dinheiro.length - 1; i++) {
			if (pesoAtual + dinheiro[i + 1].getPeso() < pesoMaximo) {

				pesoAtual = pesoAtual + dinheiro[i].getPeso();
				valorTotalDinheiro = valorTotalDinheiro + dinheiro[i].getValor();
			}
			if(pesoAtual + dinheiro[i + 1].getPeso() == pesoMaximo) {
				
				pesoAtual = pesoAtual + dinheiro[i+1].getPeso();
				valorTotalDinheiro = valorTotalDinheiro + dinheiro[i+1].getValor();
				
			}
			if(i + 1 == dinheiro.length - 1 && pesoAtual + dinheiro[i + 1].getPeso() < pesoMaximo) {
				valorTotalDinheiro = valorTotalDinheiro + dinheiro[i +1].getValor();
			}
			
		}

		return valorTotalDinheiro;
	}

	public void numElementos(int pesoMaximo) {
		int pesoAtual = 0;

		for (int i = 0; i < dinheiro.length - 1 ; i++) {
			if (pesoAtual + dinheiro[i + 1].getPeso() < pesoMaximo) {

				pesoAtual = pesoAtual + dinheiro[i].getPeso();
				if (dinheiro[i].getValor() == 500) {
					num500 = num500 + 1;
				} else if (dinheiro[i].getValor() == 200) {
					num200 = num200 + 1;
				} else if (dinheiro[i].getValor() == 100) {
					num100 = num100 + 1;
				} else if (dinheiro[i].getValor() == 50) {
					num50 = num50 + 1;
				} else if (dinheiro[i].getValor() == 20) {
					num20 = num20 + 1;
				} else if (dinheiro[i].getValor() == 10) {
					num10 = num10 + 1;
				} else if (dinheiro[i].getValor() == 5) {
					num5 = num5 + 1;
				} else if (dinheiro[i].getValor() == 2) {
					num2 = num2 + 1;
				} else if (dinheiro[i].getValor() == 1) {
					num1 = num1 + 1;
				}
			}
			if(pesoAtual + dinheiro[i + 1].getPeso() == pesoMaximo) {
				
				pesoAtual = pesoAtual + dinheiro[i].getPeso();
				if (dinheiro[i+1].getValor() == 500) {
					num500 = num500 + 1;
				} else if (dinheiro[i+1].getValor() == 200) {
					num200 = num200 + 1;
				} else if (dinheiro[i+1].getValor() == 100) {
					num100 = num100 + 1;
				} else if (dinheiro[i+1].getValor() == 50) {
					num50 = num50 + 1;
				} else if (dinheiro[i+1].getValor() == 20) {
					num20 = num20 + 1;
				} else if (dinheiro[i+1].getValor() == 10) {
					num10 = num10 + 1;
				} else if (dinheiro[i+1].getValor() == 5) {
					num5 = num5 + 1;
				} else if (dinheiro[i+1].getValor() == 2) {
					num2 = num2 + 1;
				} else if (dinheiro[i+1].getValor() == 1) {
					num1 = num1 + 1;
				}
			}
			if(i + 1 == dinheiro.length - 1 && pesoAtual + dinheiro[i + 1].getPeso() < pesoMaximo) {
				if (dinheiro[i+1].getValor() == 500) {
					num500 = num500 + 1;
				} else if (dinheiro[i+1].getValor() == 200) {
					num200 = num200 + 1;
				} else if (dinheiro[i+1].getValor() == 100) {
					num100 = num100 + 1;
				} else if (dinheiro[i+1].getValor() == 50) {
					num50 = num50 + 1;
				} else if (dinheiro[i+1].getValor() == 20) {
					num20 = num20 + 1;
				} else if (dinheiro[i+1].getValor() == 10) {
					num10 = num10 + 1;
				} else if (dinheiro[i+1].getValor() == 5) {
					num5 = num5 + 1;
				} else if (dinheiro[i+1].getValor() == 2) {
					num2 = num2 + 1;
				} else if (dinheiro[i+1].getValor() == 1) {
					num1 = num1 + 1;
				}
			}
		}

	}

	public int getnum500() {
		return num500;
	}

	public int getnum200() {
		return num200;
	}

	public int getnum100() {
		return num100;
	}

	public int getnum50() {
		return num50;
	}

	public int getnum20() {
		return num20;
	}

	public int getnum10() {
		return num10;
	}

	public int getnum5() {
		return num5;
	}

	public int getnum2() {
		return num2;
	}

	public int getnum1() {
		return num1;
	}

}
