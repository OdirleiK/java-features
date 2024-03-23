package features.java.example.factorymethod;

import java.util.Set;

public class ExampleFactoryMethod {
	
	public static void main(String[] args) {
		
		//List<String> lista = List.of("Banana", "Maça", "Pera");
		//Set<String> lista = Set.of("Banana", "Maça", "Pera", "Banana", "Maça", "Pera");
		Set<String> lista = Set.of("Banana", "Maça", "Pera");

		for(String s : lista) {
			System.out.println(s);
		}
	}

}
