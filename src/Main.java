import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int peso = in.nextInt();
		int numNotasMoedas = in.nextInt();
		in.nextLine();
		Cofre cofre = new Cofre(numNotasMoedas);
		
		for(int i = 0;i < numNotasMoedas; i++) {
			int v = in.nextInt();
			in.nextLine();
			cofre.addDinheiro(v);
		}
		cofre.ordenarPorValor();
		System.out.println(cofre.valorTotalDinheiro(peso));
		//teste(cofre);
		cofre.numElementos(peso);
		if(cofre.getnum500() > 0) {
			System.out.println("500 "+cofre.getnum500());
		}
		if(cofre.getnum200() > 0) {
			System.out.println("200 "+cofre.getnum200());
		}
		if(cofre.getnum100() > 0) {
			System.out.println("100 "+cofre.getnum100());
		}
		if(cofre.getnum50() > 0) {
			System.out.println("50 "+cofre.getnum50());
		}
		if(cofre.getnum20() > 0) {
			System.out.println("20 "+cofre.getnum20());
		}
		if(cofre.getnum10() > 0) {
			System.out.println("10 "+cofre.getnum10());
		}
		if(cofre.getnum5() > 0) {
			System.out.println("5 "+cofre.getnum5());
		}
		if(cofre.getnum2() > 0) {
			System.out.println("2 "+cofre.getnum2());
		}
		if(cofre.getnum1() > 0) {
			System.out.println("1 "+cofre.getnum1());
		}
	}
	//public static void teste(Cofre cofre) {
	//	Iterador iterador = cofre.iterador();
	//	while(iterador.hasNext()) {
	//		Dinheiro tmp = iterador.Next();
	//		System.out.println("O valor do dinheiro introduzido foi de: " + tmp.getValor()+ " e o peso foi de: " + tmp.getPeso());
		//}
	//}
	
	
	
	
}
