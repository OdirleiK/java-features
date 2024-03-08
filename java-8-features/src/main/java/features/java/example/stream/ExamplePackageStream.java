package features.java.example.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void imprime() {
		System.out.println(nome + " - " + preco);
	}
	
}
class OrdenaProdutoPorPreco implements Comparator<Produto> {
	
	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}
}


public class ExamplePackageStream {

public static void main(String[] args) { 
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Geladeira 330l", 3000.00));
		lista.add(new Produto("Geladeira 440l", 4000.00));
		lista.add(new Produto("Geladeira 230l", 2000.00));
		lista.add(new Produto("Fogao", 3000.00));
		lista.add(new Produto("TV", 2000.00));
		lista.add(new Produto("Celular", 6000.00));

		//without Pipeline 
		//Lista de geladeiras 
		List<Produto> listaGeladeira = new ArrayList<Produto>();
		for(Produto p : lista) {
			if(p.getNome().contains("Geladeira")) {
				listaGeladeira.add(p);
			}
		} 
		
		//Ordena a lista de geladeiras
		Collections.sort(listaGeladeira, new OrdenaProdutoPorPreco());
		
		//Lista dos nome das geladeiras
		List<String> listaNomesGeladeiras = new ArrayList<String>();
		for(Produto p : listaGeladeira) {
			listaNomesGeladeiras.add(p.getNome().toUpperCase());
		}
		
		//Saida nome 
		for(String nome : listaNomesGeladeiras) {
			System.out.println(nome);
		}
		
		//with Pipeline 
		lista.stream().filter(p -> p.getNome().contains("Geladeira"))
						.sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
						.map(p -> p.getNome().toUpperCase())
						.forEach(System.out::println);
		
	}
}
