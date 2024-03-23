package features.java.example.apistreamupdate;

import java.util.ArrayList;
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


public class ExampleApiStreamUpdate {

	public static void main(String[] args) { 
			
			List<Produto> lista = new ArrayList<>();
			lista.add(new Produto("Geladeira 330l", 3000.00));
			lista.add(new Produto("Geladeira 440l", 4000.00));
			lista.add(new Produto("Geladeira 230l", 2000.00));
			lista.add(new Produto("Fogao", 3000.00));
			lista.add(new Produto("TV", 2000.00));
			lista.add(new Produto("Celular", 6000.00));
			
			
			lista.stream()
			.takeWhile(p -> p.getNome().contains("Geladeira"))
			.map(p -> p.getNome())
			.forEach(System.out::println);
			
		}
}