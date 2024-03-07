package features.java.example.referencemethod;

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

class Impressora {
	
	public static void imprime(Produto p) {
		System.out.println(p.getNome() + " - " + p.getPreco());
	}
}


public class ExampleMethodReferenceStatic {

	public static void main(String[] args) { 
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("tv 50", 2000.00));
		lista.add(new Produto("tv 40", 3000.00));
		lista.add(new Produto("tv 30", 2000.00));
		lista.add(new Produto("tv 60", 6000.00));

		//method reference (referencia ao metodo estatico)
		//lista.forEach(Impressora::imprime);

		//method reference (referencia ao metodo de instancia de um Objeto arbitrario)
		lista.forEach(Produto::imprime);
		
	}
	
	
}
