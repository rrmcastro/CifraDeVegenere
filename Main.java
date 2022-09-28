import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CifraDeVegenere cifraDeVegenere = new CifraDeVegenere();
		String chave;
		String mensagem;
		String cifra;
		int opcao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a chave:");
		chave = entrada.nextLine().toUpperCase();

		System.out.println("Escolha a opção desejada:\n(1) Cifrar \n(2) Decifrar");
		opcao = Integer.parseInt(entrada.nextLine());

		switch (opcao) {

		case 1:
			System.out.println("Insira o texto a ser Cifrado:");
			mensagem = entrada.nextLine().toUpperCase();
			cifraDeVegenere.cifrar(mensagem, chave);
			break;

		case 2:
			System.out.println("Insira o texto a ser Decifrado:");
			cifra = entrada.nextLine().toUpperCase();
			cifraDeVegenere.decifrar(cifra, chave);
			break;

		default:
			System.out.println("Entrada inválida, reinicie o programa.");
			break;
		}

		entrada.close();
	}
}
