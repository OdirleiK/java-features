package features.java.example.typeinference;

import java.util.ArrayList;
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

class ImprimeProdutos {
	
	public static void imprime(List<Produto> lista) {
		if(!lista.isEmpty()) {
			lista.forEach(p -> System.out.println(p.getNome()));
		}else {
			System.out.println("Lista vazia");
		}
	}
	
}


public class ExampleTypeInference {

public static void main(String[] args) { 
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Geladeira 330l", 3000.00));
		lista.add(new Produto("Geladeira 440l", 4000.00));
		lista.add(new Produto("Geladeira 230l", 2000.00));
		lista.add(new Produto("Fogao", 3000.00));
		lista.add(new Produto("TV", 2000.00));
		lista.add(new Produto("Celular", 6000.00));

		//ImprimeProdutos.imprime(lista);
		ImprimeProdutos.imprime(new ArrayList<>());
	}
}
