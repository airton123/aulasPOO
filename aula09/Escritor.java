package aula09;

import java.io.FileWriter;
import java.util.stream.Collectors;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

class Escritor {
	
	public void gravarEmArquivo(Map<String, Integer> resultado) {
		try {
			FileWriter escritor = new FileWriter("resources/resultado.txt");

			for (String chave : resultado.keySet()) {
				String linha = chave + "," + resultado.get(chave) + "\n";
				escritor.write(linha);
			}
			escritor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void gravarEmArquivo1(List<Entry<String, Integer>> resultado) {
		try {
			FileWriter escritor = new FileWriter("resources/resultado.txt");
			
			String result = resultado.stream()
				      .map(n -> String.valueOf(n))
				      .collect(Collectors.joining("\n"));
			
			escritor.write(result);
			escritor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
			
		
	}


