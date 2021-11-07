package aula09;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class LeituraDeArquivo {

	public static void main(String[] args) {
		
		Leitor leitorDeArquivos = new Leitor();
		Map<String, Integer> totalVotos = leitorDeArquivos.executarLeitura("C:/Users/jefes/eclipse-workspace/teste1/resources/votos.txt");
		
		Escritor escritorDeArquivos = new Escritor();
		escritorDeArquivos.gravarEmArquivo(totalVotos);
		
		List<Entry<String, Integer>> list = new ArrayList<>(leitorDeArquivos.executarLeitura("C:/Users/jefes/eclipse-workspace/teste1/resources/votos.txt").entrySet());
		list.sort(Collections.reverseOrder(Entry.comparingByValue()));
		list.forEach(System.out::println);
		escritorDeArquivos.gravarEmArquivo1(list);
		
	}

}
