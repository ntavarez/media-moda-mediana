package main;

public class StatisticUtil {

	// Media
	public static long average(int[] elements) {
		int media = 0;
		int soma = 0;
		for (int i = 0; i < elements.length; ++i) {
			soma = soma + elements[i];
			int quant = elements.length;
			media = soma / quant;
		}
		return media;
	}

	// Moda
	public static long mode(int[] elements) {
		int moda = 0;
		int contaMax = 0;
		int tamanho = elements.length;

		for (int i = 0; i < tamanho; ++i) {
			int contador = 0;
			for (int j = 0; j < tamanho; ++j) {
				if (elements[j] == elements[i]) {
					contador++;
				}
				if (contador > contaMax) {
					contaMax = contador;
					moda = elements[i];
				}
			}
		}
		return moda;
	}

	// Mediana
	public static long median(int[] elements) {
		int aux = 0;
		int metadeFinal = 0;
		int metade1 = 0;
		int metade2 = 0;
		int mediana = 0;

		if (elements.length % 2 == 0) {
			for (int i = 0; i < elements.length; i++) {
				for (int j = i + 1; j < elements.length; j++) {
					if (elements[j] < elements[i]) {
						aux = elements[i];
						elements[i] = elements[j];
						elements[j] = aux;
					}
					metade1 = elements[elements.length / 2];
					metade2 = (metade1) - 1;
					metadeFinal = ((metade1) + (metade2)) / 2;
					mediana = metadeFinal;
				}
			}
		} else {
			for (int i = 0; i < elements.length; i++) {
				for (int j = i + 1; j < elements.length; j++) {
					if (elements[j] < elements[i]) {
						aux = elements[i];
						elements[i] = elements[j];
						elements[j] = aux;
					}
					int esquerdo = 0;
					int direito = elements.length - 1;
					int meio;
					meio = (esquerdo + direito) / 2;
					mediana = elements[meio];
				}
			}
		}
		return mediana;
	}
}
