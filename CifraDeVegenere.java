
public class CifraDeVegenere {

	void cifrar(String txt, final String chave) {

		String txtCifrado = "";
		txt = txt.toUpperCase();
		int j = 0;
		int tamanho = txt.length();

		for (int i = 0; i < tamanho; i++) {
			char c = txt.charAt(i);
			if (c != ' ') {
				txtCifrado += (char) ((c + chave.charAt(j) - 2 * 'A') % 26 + 'A');
				j++;
				j %= chave.length();
			}
		}

		System.out.println("Mensagem CIFRADA com a chave " + chave + ":");
		System.out.println(txtCifrado);
	}

	void decifrar(String txt, final String chave) {

		String txtDecifrado = "";
		txt = txt.toUpperCase();
		int j = 0;
		int tamanho = txt.length();

		for (int i = 0; i < tamanho; i++) {
			char c = txt.charAt(i);
			if (c != ' ') {
				txtDecifrado += (char) ((c - chave.charAt(j) + 26) % 26 + 'A');
				j++;
				j %= chave.length();
			}
		}

		System.out.println("Mensagem DECIFRADA com a chave " + chave + ":");
		System.out.println(txtDecifrado);
	}
}
